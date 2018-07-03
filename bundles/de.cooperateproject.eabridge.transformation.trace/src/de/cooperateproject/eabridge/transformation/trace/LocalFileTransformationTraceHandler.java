package de.cooperateproject.eabridge.transformation.trace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.qvt.oml.util.Trace;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.cooperateproject.eabridge.services.ModelSetConfiguration.QualifiedModel;
import de.cooperateproject.eabridge.services.Transformation;
import de.cooperateproject.eabridge.services.TransformationTraceHandler;

@Component (
		configurationPolicy = ConfigurationPolicy.REQUIRE, 
		name = LocalFileTransformationTraceHandler.SERVICE_PID)
public class LocalFileTransformationTraceHandler implements TransformationTraceHandler {
	public static final String SERVICE_PID = "tracehandler";
	public static final String PROPERTY_FOLDER = "folder";
	
	private Path traceFolder;
	private ResourceSet resourceSet;
	
    @Activate
    protected void activate(Map<String, Object> properties) throws IOException {
    	if (!properties.containsKey(PROPERTY_FOLDER)) {
    		throw new IllegalStateException("The configuration of " + this.getClass().getName() 
    				+ " must specify a folder to store the traces");
    	}
    	
    	String folderPath = properties.get(PROPERTY_FOLDER).toString();
    	this.traceFolder = Paths.get(folderPath);
    	
    	if (!Files.exists(this.traceFolder)) {
    		Files.createDirectory(traceFolder);
    	}
    	
    	if (!(Files.exists(this.traceFolder) && Files.isDirectory(traceFolder))) {
    		throw new IllegalStateException("The specified path is not a directory, or it could not be created");
    	}
    	
    	resourceSet = new ResourceSetImpl();
    }
    
	@Override
	public Optional<Trace> getTrace(Transformation trans) {
		Path buildFileName = traceFolder.resolve(buildFileName(trans));
		
		ensureFolderExists(buildFileName);
		
		URI traceUri = URI.createURI(buildFileName.toUri().toString());
	
		Resource resource;
		if (Files.exists(buildFileName)) {
			resource = resourceSet.getResource(traceUri, true);
		} else {
			resource = resourceSet.createResource(traceUri);
		}
		
		Trace result = new Trace(resource.getContents());
		
		return Optional.of(result);
	}

	private void ensureFolderExists(Path buildFileName) {
		Path folder = buildFileName.getParent();
		if (Files.exists(folder)) {
			if (!Files.isDirectory(folder)) {
				throw new IllegalStateException("Cannot open directory to store the trace in.");
			}
		} else {
			try {
				Files.createDirectories(folder);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	protected Path buildFileName(Transformation trans) {
		List<String> nameQualifier = new ArrayList<>(2);
		Iterator<QualifiedModel> iterator = trans.getInputModels().iterator();
		if (iterator.hasNext()) {
			nameQualifier.add(iterator.next().getModel().getURI().toString().replaceAll("\\W+", ""));
		}
		
		iterator = trans.getTargetModels().iterator();
		if (iterator.hasNext()) {
			nameQualifier.add(iterator.next().getModel().getURI().toString().replaceAll("\\W+", "") + ".xmi");
		}
		Path temp = Paths.get(trans.getName().replaceAll("\\W+", ""), nameQualifier.toArray(new String[nameQualifier.size()]));
		
		return temp;
	}

	@Override
	public void storeTrace(Transformation trans, Trace value) {
		Path buildFileName = traceFolder.resolve(buildFileName(trans));
		
		ensureFolderExists(buildFileName);
		
		URI traceUri = URI.createURI(buildFileName.toUri().toString());
		
		Resource resource;
		if (Files.exists(buildFileName)) {
			resource = resourceSet.getResource(traceUri, true);
		} else {
			resource = resourceSet.createResource(traceUri);
		}
		
		
		resource.getContents().clear();
		resource.getContents().addAll(value.getTraceContent());
		
		try {
			resource.save(Collections.singletonMap(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}		
	}

	@Override
	public boolean isHandlerFor(Transformation trans) {
		return true;
	}


}
