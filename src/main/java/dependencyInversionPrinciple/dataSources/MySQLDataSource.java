package dependencyInversionPrinciple.dataSources;

import com.sleepycat.je.DatabaseConfig;

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLDataSource implements DataSource{

    private org.mariadb.jdbc.MySQLDataSource dataSource;


    @Override
    public void createConnection(DatabaseConfig config) {
        dataSource = new org.mariadb.jdbc.MySQLDataSource();
        dataSource.setUrl(config.getUrl());
        dataSource.setUser(config.getUserName());
        dataSource.setPassword(config.getPassword());
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
