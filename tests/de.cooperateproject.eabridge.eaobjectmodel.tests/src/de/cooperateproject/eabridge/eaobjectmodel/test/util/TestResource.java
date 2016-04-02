package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.google.common.io.Files;

public enum TestResource {

	EABaseChangelog("resources/EABase.changelog.xml"), EASchemaChangelog(
			"resources/EASchema.changelog.xml"), SimmpleClassDiagramChangelog(
					"resources/SimpleClassDiagram.changelog.xml"), SimpleClassModel("resources/SimpleClassModel.xmi");

	private static final Logger LOGGER = Logger.getLogger(TestResource.class);
	private static final File tmpDir = createTmpDir();
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
			File destinationFile = new File(tmpDir, relativePath);
			Files.createParentDirs(destinationFile);
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

	private static File createTmpDir() {
		File tmpDir = Files.createTempDir();
		Runtime.getRuntime().addShutdownHook(new Thread(() -> FileUtils.deleteQuietly(tmpDir)));
		return tmpDir;
	}
}
