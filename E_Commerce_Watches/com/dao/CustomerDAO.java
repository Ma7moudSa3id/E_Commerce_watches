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
	 public static CustomerDTO showCustomerData(int customerID) throws SQLException, ClassNotFoundException {
	        CustomerDTO customerDTO = new CustomerDTO();
	        String sql = "select * from customer where idCustomer =" + customerID;
	        Connection connection = Utilities.openConnection();
	        Statement statement = Utilities.createStatement(connection);
	        ResultSet resultSet = statement.executeQuery(sql);
	        resultSet.next();
	        customerDTO.setName(resultSet.getString("cst_name"));
	        customerDTO.setAddress(resultSet.getString("cst_address"));
	        customerDTO.setCreditlimit(resultSet.getInt("cst_creditlimit"));
	        customerDTO.setJob(resultSet.getString("cst_job"));
	        customerDTO.setMail(resultSet.getString("cst_mail"));
	        customerDTO.setPass(resultSet.getString("cst_pass"));
	        customerDTO.setPhone(resultSet.getString("cst_phone"));
	        connection.close();
	        statement.close();
	        resultSet.close();
	        return customerDTO;

	    }
}
