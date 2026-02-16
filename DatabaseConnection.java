import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/yourDatabaseName";
    private static final String USER = "yourUsername";
    private static final String PASSWORD = "yourPassword";

    public static void main(String[] args) {
        createConnection();
    }

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established.");
            initializeTables(connection);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }

    public static void initializeTables(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS YourTableName (\n" +
                "id INT PRIMARY KEY AUTO_INCREMENT, \n" +
                "name VARCHAR(100), \n" +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP\n" +
                ");";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table initialized.");
        } catch (SQLException e) {
            System.out.println("Table initialization failed: " + e.getMessage());
        }
    }
}