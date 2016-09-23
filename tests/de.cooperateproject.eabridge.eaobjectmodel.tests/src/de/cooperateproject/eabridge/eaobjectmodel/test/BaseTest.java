package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.emf.teneo.hibernate.HbDataStore;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.LiquibaseFactory.LiquibaseLogger;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;

public abstract class BaseTest {

	static {
		BasicConfigurator.resetConfiguration();
		final ConsoleAppender appender = new ConsoleAppender(new PatternLayout("%m%n"));
		appender.setThreshold(Level.INFO);
		appender.addFilter(new Filter() {
			@Override
			public int decide(LoggingEvent arg0) {
				if (LiquibaseLogger.class.getName().equals(arg0.getLoggerName())) {
					if (arg0.getLevel().toInt() <= Level.INFO_INT) {
						return Filter.DENY;
					}
				}
				if (HbDataStore.class.getName().equals(arg0.getLoggerName())) {
					if (arg0.getLevel().toInt() <= Level.INFO_INT) {
						return Filter.DENY;
					}
				}
				return Filter.NEUTRAL;
			}
		});
		BasicConfigurator.configure(appender);
		LiquibaseFactory.init();
	}

	public static Package loadModelFromResource(String resourcePath) throws IOException {
		Package loadedPackage = null;
		InputStream is = null;
		try {
			is = ObjectModel2EAMappingTest.class.getClassLoader().getResourceAsStream(resourcePath);
			loadedPackage = EAObjectModelHelper.loadModel(is);
		} finally {
			IOUtils.closeQuietly(is);
		}
		return loadedPackage;
	}

	public static String readFile(File f, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(f.getAbsolutePath()));
		return new String(encoded, encoding);
	}

}
