package integrationTest;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl;

public class TeneoToEaConnectionProvider extends DriverManagerConnectionProviderImpl {

    @Override
    public Connection getConnection() throws SQLException {
        Connection con =  super.getConnection();
        
        
        
        return con;
    }

}
