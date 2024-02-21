package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private Connection connection;
    private static JdbcConnection obj;

    private JdbcConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "postgres");
        } catch (SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

    public static JdbcConnection getInstance() throws ClassNotFoundException {
        if (obj == null) obj = new JdbcConnection();
        return obj;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static JdbcConnection getObj() {
        return obj;
    }

    public static void setObj(JdbcConnection obj) {
        JdbcConnection.obj = obj;
    }
}
