package de.cooperateproject.eabridge.eaobjectmodel.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.PackageBase;
import de.cooperateproject.eabridge.eaobjectmodel.RootPackage;
import de.cooperateproject.eabridge.eaobjectmodel.test.util.DBChangelogInitializer;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.Liquibase;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

    @Test
    public void testAddModel() throws Exception {
    	initTestDb(new DBChangelogInitializer("resources/EABase.changelog.xml"));
    	
        PackageBase loadedPackage = loadModelFromResource("resources/SimpleClassModel.xmi");
        Session session = getDataStore().getSessionFactory().openSession();
        Transaction trans = session.getTransaction();
        
        trans.begin();
        session.save(loadedPackage);
        trans.commit();

         MySQLDatabase db = new MySQLDatabase();
         db.setConnection(new JdbcConnection(getDbConnection()));
         Liquibase liquibase = new Liquibase((String) null, new ClassLoaderResourceAccessor(),
         db);
        // //liquibase.

    }

    private static RootPackage loadModelFromResource(String resourcePath) throws IOException {
    	RootPackage loadedPackage = null;
        InputStream is = null;
        try {
            is = ObjectModel2EAMappingTest.class.getClassLoader().getResourceAsStream(resourcePath);
            loadedPackage = EAObjectModelHelper.loadModel(is);
        } finally {
            IOUtils.closeQuietly(is);
        }
        return loadedPackage;
    }

}
