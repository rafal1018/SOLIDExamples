package openClosedPrinciple;

import java.sql.Connection;

public interface ConnetionProvider {
    public Connection establishConnection();
}
