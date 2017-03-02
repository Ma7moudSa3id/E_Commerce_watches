package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ecommerce.Utilities;

public class ProductDAO {
	public static int getProductID(String name) throws SQLException, ClassNotFoundException {
		Connection connection = Utilities.openConnection();
		Statement statement = Utilities.createStatement(connection);
		String sql = "select idProduct from product where prod_name = \"" + name + "\"";
		ResultSet resultSet = statement.executeQuery(sql);
		resultSet.next();
		return resultSet.getInt("idProduct");
	}

}
