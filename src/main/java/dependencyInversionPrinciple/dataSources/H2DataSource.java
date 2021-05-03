package dependencyInversionPrinciple.dataSources;

import com.sleepycat.je.DatabaseConfig;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class H2DataSource implements DataSource{

    private JdbcDataSource dataSource;

    @Override
    public void createConnection(DatabaseConfig config) {
        dataSource = new JdbcDataSource();
        dataSource.setURL(config.getUrl());
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
