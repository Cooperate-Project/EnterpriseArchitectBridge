package integrationTest;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import de.cooperateproject.eabridge.eaobjectmodel.Package;
import de.cooperateproject.eabridge.eaobjectmodel.util.EAObjectModelHelper;
import liquibase.Liquibase;
import liquibase.database.core.MySQLDatabase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

public class ObjectModel2EAMappingTest extends TeneoMappingBaseTest {

    protected void initDb(Connection con) throws Exception {
        InputStream sqlScript = getClass().getClassLoader().getResourceAsStream("resources/MySQL_InnoDB_EASchema.sql");
        initDbWithSQLScript(con, sqlScript);
    }

    @Test
    public void testAddModel() throws Exception {
        Package loadedPackage = loadModelFromResource("resources/Bootstrap.xmi");
        Session session = getDataStore().getSessionFactory().openSession();
        Transaction trans = session.getTransaction();

        org.h2.tools.Server.createWebServer("-webPort", "10500").start();

        trans.begin();
        session.save(loadedPackage);
        trans.commit();

         MySQLDatabase db = new MySQLDatabase();
         db.setConnection(new JdbcConnection(getDbConnection()));
         Liquibase liquibase = new Liquibase((String) null, new ClassLoaderResourceAccessor(),
         db);
        // //liquibase.

    }

    private static Package loadModelFromResource(String resourcePath) throws IOException {
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

}
