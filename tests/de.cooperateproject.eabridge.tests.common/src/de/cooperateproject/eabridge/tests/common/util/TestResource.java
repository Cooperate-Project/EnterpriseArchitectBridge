package de.cooperateproject.eabridge.tests.common.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;


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
	VehicleChangelog("resources/Vehicles.changelog.xml"),
	PortableChangelog("resources/Portable.changelog.xml"),
	SimpleAssociationChangelog("resources/SimpleAssociation.changelog.xml"),
	AdvancedAssociationChangelog("resources/AdvancedAssociation.changelog.xml"),
	NestedChangelog("resources/Nested.changelog.xml");

	private final String resourcePath;

	private TestResource(String relativePath) {
		this.resourcePath = relativePath;
	}
	
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

}
