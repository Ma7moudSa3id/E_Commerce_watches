package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ecommerce.Utilities;
import dto.ProductDTO;
import java.sql.PreparedStatement;

public class ProductDAO {

    public static int getProductID(String name) throws SQLException, ClassNotFoundException {
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select idProduct from product where prod_name = \"" + name + "\"";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int productID = resultSet.getInt("idProduct");
        connection.close();
        statement.close();
        resultSet.close();
        return productID;
    }

    public static void addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException {
        String prod_name = productDTO.getName();
        int prod_pricel = productDTO.getPrice();
        int prod_amount = productDTO.getAmount();
        String prod_category = productDTO.getCategory();
        Connection connection = Utilities.openConnection();
        Statement Statement = Utilities.createStatement(connection);
        String sql = "insert into product (prod_name,prod_price,prod_amount,prod_category) values ("
                + "\"" + prod_name + "\"" + "," + prod_pricel + "," + prod_amount + "," + "\"" + prod_category + "\"" + ")";
        Statement.executeUpdate(sql);
        connection.close();
        Statement.close();

    }

    public static ProductDTO getProduct(int productID) throws SQLException, ClassNotFoundException {
        ProductDTO productDTO = new ProductDTO();
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "SELECT prod_name , prod_price , prod_amount , prod_category FROM `e-commerce`.product where idProduct = " + productID;
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        productDTO.setName(resultSet.getString("prod_name"));
        productDTO.setPrice(resultSet.getInt("prod_price"));
        productDTO.setAmount(resultSet.getInt("prod_amount"));
        productDTO.setCategory(resultSet.getString("prod_category"));
        connection.close();
        statement.close();
        resultSet.close();
        return productDTO;

    }

    public static void updateProduct(int productID, ProductDTO productDTO) throws ClassNotFoundException, SQLException {

        String sql = "UPDATE `product` SET `name` = ? ,`price` = ?,`stock`= ? , `category` = ?  WHERE id = ? ";
        Connection conn = Utilities.openConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, productDTO.getName());
        preparedStatement.setInt(2, productDTO.getPrice());
        preparedStatement.setInt(3, productDTO.getAmount());
        preparedStatement.setString(4, productDTO.getCategory());
        preparedStatement.setInt(5, productID);
        preparedStatement.executeUpdate();
        conn.close();
        preparedStatement.close();

    }

    public static void deleteProduct(int productID) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM `product` WHERE id = ?";
        Connection conn = Utilities.openConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, productID);
        preparedStatement.executeUpdate();
        conn.close();
        preparedStatement.close();

    }

}
