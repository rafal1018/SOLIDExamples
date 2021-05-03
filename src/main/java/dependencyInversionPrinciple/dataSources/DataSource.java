package dependencyInversionPrinciple.dataSources;

import com.sleepycat.je.DatabaseConfig;

import java.sql.Connection;

public interface DataSource {
    void createConnection(DatabaseConfig config);
    Connection getConnection();}
