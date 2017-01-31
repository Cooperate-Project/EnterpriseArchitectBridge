package de.cooperateproject.eabridge.tests.common.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;

import com.google.common.io.Files;


public enum TestResource {
	
	EABaseChangelog("resources/EABase.changelog.xml"),
	EASchemaChangelog("resources/EASchema.changelog.xml"),
	SimmpleClassDiagramChangelog("resources/SimpleClassDiagram.changelog.xml"),
	SimpleClassModel("resources/SimpleClassModel.xmi"), 
	SimpleClassModelChangelog("resources/SimpleClassModel.changelog.xml"),
	EASingleClassChangelog("resources/EASingleClass.changelog.xml"),
	EASingleClassModel("resources/EASingleClass.xmi"),
	bigModel("resources/bigModel.xml"),
	GameChangelog("resources/Game.changelog.xml"),
	GameModel("resources/Game.xmi"),
	PeopleChangelog("resources/People.changelog.xml"),
	DataTypeChangelog("resources/DataType.changelog.xml"),
	PrimitiveChangelog("resources/Primitive.changelog.xml"),
	VehicleChangelog("resources/Vehicles.changelog.xml");

//	private static File TMP_DIR = null;
//	private final File tmpFile;
	private final String resourcePath;

	private TestResource(String relativePath) {
		this.resourcePath = relativePath;
//		tmpFile = copyFile(relativePath);
	}
	
//	public File getFile() {
//		return tmpFile;
//	}
	
//	public URI getURI() {
//		return URI.createFileURI(tmpFile.getAbsolutePath());
//	}
	
	public String getResourcePath() {
		return resourcePath;
	}
	
	public ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public InputStream getInputStream() {
		return getClassLoader().getResourceAsStream(getResourcePath());
	}
	
	public String getContent() {
		InputStream is = getInputStream();
		try {
			return IOUtils.toString(is);
		} catch (IOException e) {
			return null;
		} finally {
			IOUtils.closeQuietly(is);
		}
	}

	
//	private static File getTmpDir() {
//		if (TMP_DIR == null) {
//			TMP_DIR = createTmpDir();
//		}
//		return TMP_DIR;
//	}
//	
//	private static File createTmpDir() {
//		File tmpDir = Files.createTempDir();
//		tmpDir.deleteOnExit();
//		return tmpDir;
//	}
//	
//	private static File copyFile(String relativePath) {
//		InputStream is = TestResource.class.getClassLoader().getResourceAsStream(relativePath.replaceFirst("src/", ""));
//		try {
//			File targetFile = new File(getTmpDir(), relativePath);
//			targetFile.deleteOnExit();
//			FileUtils.copyInputStreamToFile(is, targetFile);
//			return targetFile;
//		} catch (IOException e) {
//			return null;
//		} finally {
//			IOUtils.closeQuietly(is);
//		}
//	}
//	
}
