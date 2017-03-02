package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dto.LoginDTO;
import ecommerce.Utilities;

public class CustomerDAO {
	public static int getUserID(LoginDTO loginDTO) throws SQLException, ClassNotFoundException {
		String name = loginDTO.getUser();
		Connection connection = Utilities.openConnection();
		Statement statement = Utilities.createStatement(connection);
		String sql = "select idCustomer from customer where cst_name = \"" + name + "\"";
		ResultSet resultSet = statement.executeQuery(sql);
		resultSet.next();
		return resultSet.getInt("idCustomer");
	}
}
