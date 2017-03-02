package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.LoginDTO;
import dto.OrderedProductDTO;
import ecommerce.Utilities;

public class CartDAO {

    public static int getCartID(LoginDTO loginDTO) throws SQLException, ClassNotFoundException {
        String name = loginDTO.getUser();
        int customerID = CustomerDAO.getUserID(loginDTO);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select idcart from cart where Customer_id = \"" + customerID + "\"";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        return resultSet.getInt("idcart");

    }

    public static void addProductToCartDAO(OrderedProductDTO orderedProductDTO, LoginDTO loginDTO) throws SQLException, ClassNotFoundException {
        int CartID = CartDAO.getCartID(loginDTO);
        int productID = orderedProductDTO.getProductID();
        int quantity = orderedProductDTO.getQuantity();
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "insert  into ordered_product (cart_idcart , product_id , product_quantity) values "
                + " (" + CartID + "," + productID + "," + quantity + ")";
        statement.executeUpdate(sql);
    }
}
