package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

public enum TestResource {

	EABaseChangelog("resources/EABase.changelog.xml"),
	EASchemaChangelog("resources/EASchema.changelog.xml"),
	SimmpleClassDiagramChangelog("resources/SimpleClassDiagram.changelog.xml"),
	SimpleClassModel("resources/SimpleClassModel.xmi"),
	SimpleClassModelChangelog("resources/SimpleClassModel.changelog.xml"),
	EASingleClassChangelog("resources/EASingleClass.changelog.xml"),
	EASingleClassModel("resources/EASingleClass.xmi");

	private static final Logger LOGGER = Logger.getLogger(TestResource.class);
	private static File tmpDir = null;
	private final File tmpFile;
	private final String relativePath;

	private TestResource(String relativePath) {
		this.relativePath = relativePath;
		tmpFile = writeToTmpDir();
	}

	public File getFile() {
		return tmpFile;
	}

	private File writeToTmpDir() {
		try {
			File destinationFile = new File(getTmpDir(), relativePath);
			com.google.common.io.Files.createParentDirs(destinationFile);
			InputStream is = TestResource.class.getClassLoader().getResourceAsStream(relativePath);
			try {
				FileUtils.copyInputStreamToFile(is, destinationFile);
			} finally {
				IOUtils.closeQuietly(is);
			}
			return destinationFile;
		} catch (IOException e) {
			LOGGER.error("Could not write " + relativePath + " to temporary directory.", e);
			return null;
		}
	}

	private static File getTmpDir() {
		if (tmpDir == null) {
			tmpDir = createTmpDir();
		}
		return tmpDir;
	}

	private static File createTmpDir() {
		try {
			File tmpDir = Files.createTempDirectory(TestResource.class.getName()).toFile();
			Runtime.getRuntime().addShutdownHook(new Thread(() -> FileUtils.deleteQuietly(tmpDir)));
			return tmpDir;
		} catch (IOException e) {
			LOGGER.error("Could not create temporary directory.", e);
			return null;
		}
	}
}
