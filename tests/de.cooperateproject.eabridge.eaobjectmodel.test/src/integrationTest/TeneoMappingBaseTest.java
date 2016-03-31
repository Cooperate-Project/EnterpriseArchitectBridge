package integrationTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.h2.jdbcx.JdbcDataSourceFactory;
import org.h2.tools.RunScript;
import org.junit.After;
import org.junit.Before;

import de.cooperateproject.eabridge.eaobjectmodel.DatabaseAdapter;
import de.cooperateproject.eabridge.eaobjectmodel.DatabaseAdapter.DatabaseProperties;
import liquibase.database.DatabaseFactory;
import liquibase.database.core.H2Database;
import liquibase.database.jvm.JdbcConnection;

public abstract class TeneoMappingBaseTest {

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String JDBC_USER = "";
    private static final String JDBC_PASS = "";
    private static final String JDBC_DIALECT = org.hibernate.dialect.MySQLInnoDBDialect.class.getName();

    private Connection dbConnection;
    private HbDataStore dataStore;

    @Before
    public void setup() throws Exception {
        Class.forName("org.h2.Driver");

        final String jdbcUrl = createJDBCURL();
        dbConnection = DriverManager.getConnection(jdbcUrl);
        initDb(dbConnection);
        dataStore = createDataStore(jdbcUrl);
    }

    @After
    public void finalize() throws SQLException {
        finalizeDataStore(dataStore);
        dbConnection.close();
    }

    public Connection getDbConnection() {
        return dbConnection;
    }

    public HbDataStore getDataStore() {
        return dataStore;
    }

    protected abstract void initDb(Connection con) throws Exception;
    
    protected void initDbWithSQLScript(Connection con, InputStream sqlScript) throws SQLException {
        String content;
        try {
            content = IOUtils.toString(sqlScript, "UTF-8");
        } catch (IOException e) {
            throw new SQLException(e);
        }
        content = content.replaceAll("`", "\"");
        content = Pattern.compile("#[^\\\n]*\n", Pattern.DOTALL).matcher(content).replaceAll("");
        
        StringReader initScriptReader = null;
        try {
            RunScript.execute(con, new StringReader(content));
        } finally {
            IOUtils.closeQuietly(initScriptReader);
        }
    }

    private static HbDataStore createDataStore(String jdbcUrl) {
        return DatabaseAdapter
                .createDataStore(new DatabaseProperties(JDBC_DRIVER, JDBC_USER, jdbcUrl, JDBC_PASS, JDBC_DIALECT));
    }
    
    private static void finalizeDataStore(HbDataStore dataStore) {
        DatabaseAdapter.finalizeDataStore(dataStore);
    }

    private static String createJDBCURL() {
        return String.format("jdbc:h2:mem:test%s;MODE=MYSQL;DATABASE_TO_UPPER=false;IGNORECASE=TRUE",
                RandomStringUtils.randomAlphabetic(10));
    }

}
