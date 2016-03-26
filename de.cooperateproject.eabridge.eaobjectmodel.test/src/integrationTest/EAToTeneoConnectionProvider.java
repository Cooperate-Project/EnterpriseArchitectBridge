package integrationTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class EAToTeneoConnectionProvider implements ConnectionProvider {

	@Override
	public boolean isUnwrappableAs(Class arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConnection(Connection arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Connection getConnection() throws SQLException {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
		Statement stat = conn.createStatement();

		// this line would initialize the database
		// from the SQL script file 'init.sql'
		stat.execute("runscript from 'classpath:integrationTest/EA Bridge Scheme H2.sql'");
		
		stat.execute("runscript from 'classpath:integrationTest/init.sql'");
		
		return conn;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		// TODO Auto-generated method stub
		return false;
	}

}
