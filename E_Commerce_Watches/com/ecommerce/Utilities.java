package ecommerce;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilities {

    public static Connection openConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/e-commerce";
        String USER = "root";
        String PASS = "MyNewPass";
        Connection connection = null;
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        return connection;
    }

    public static Statement createStatement(Connection connection) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        return statement;
    }
}
