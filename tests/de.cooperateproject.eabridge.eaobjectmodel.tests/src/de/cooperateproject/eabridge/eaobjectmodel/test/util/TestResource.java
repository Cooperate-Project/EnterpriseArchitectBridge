package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.File;

import org.eclipse.emf.common.util.URI;


public enum TestResource {

	EABaseChangelog("src/resources/EABase.changelog.xml"),
	EASchemaChangelog("src/resources/EASchema.changelog.xml"),
	SimmpleClassDiagramChangelog("src/resources/SimpleClassDiagram.changelog.xml"),
	SimpleClassModel("src/resources/SimpleClassModel.xmi"), 
	SimpleClassModelChangelog("src/resources/SimpleClassModel.changelog.xml"),
	EASingleClassChangelog("src/resources/EASingleClass.changelog.xml"),
	EASingleClassModel("src/resources/EASingleClass.xmi"),
	bigModel("src/resources/bigModel.xml");

	private final File tmpFile;

	private TestResource(String relativePath) {
		tmpFile = new File(relativePath);
	}
	
	public File getFile() {
		return tmpFile;
	}
	
	public URI getURI() {
		return URI.createFileURI(tmpFile.getAbsolutePath());
	}

}
