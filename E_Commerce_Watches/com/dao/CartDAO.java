package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.dto.OrderedProductDTO;
import com.dto.ProductDTO;
import com.dto.ProductInCartDTO;
import com.ecommerce.Utilities;

public class CartDAO {

    public static int getCartID(String userName) throws SQLException, ClassNotFoundException {

        int customerID = CustomerDAO.getUserID(userName);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select idcart from cart where Customer_id = \"" + customerID + "\"";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int cartID = resultSet.getInt("idcart");
        connection.close();
        statement.close();
        resultSet.close();
        return cartID;

    }

    public static void addProductToCartDAO(OrderedProductDTO orderedProductDTO, String userName)
            throws SQLException, ClassNotFoundException {
        int CartID = CartDAO.getCartID(userName);
        int productID = orderedProductDTO.getProductID();
        int quantity = orderedProductDTO.getQuantity();
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "insert  into ordered_product (cart_idcart , product_id , product_quantity) values " + " ("
                + CartID + "," + productID + "," + quantity + ")";
        statement.executeUpdate(sql);
        connection.close();
        statement.close();
    }

    public static java.util.ArrayList<ProductInCartDTO> getProductsFromCart(String userName)
            throws ClassNotFoundException, SQLException {
        java.util.ArrayList<ProductInCartDTO> orderedProductsList = new ArrayList<ProductInCartDTO>();
        int cartID = CartDAO.getCartID(userName);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select product_id , product_quantity  from ordered_product where cart_idcart = " + cartID;
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            ProductDTO productDTO = new ProductDTO();
            ProductInCartDTO productInCartDTO = new ProductInCartDTO();
            int product_id = resultSet.getInt("product_id");
            productDTO = ProductDAO.getProduct(product_id);
            int product_quantity = resultSet.getInt("product_quantity");
            productInCartDTO.setAmount(product_quantity);
            productInCartDTO.setName(productDTO.getName());
            productInCartDTO.setCategory(productDTO.getCategory());
            productInCartDTO.setPrice(productDTO.getPrice());
            orderedProductsList.add(productInCartDTO);

        }
        connection.close();
        statement.close();
        resultSet.close();
        return orderedProductsList;

    }

    public static void deleteProductFromCart(int cartID, String productName) throws SQLException, ClassNotFoundException {
        int productID = ProductDAO.getProductID(productName);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "DELETE FROM ordered_product WHERE cart_idcart = " + cartID + " and product_id = " + productID;
        statement.executeUpdate(sql);
        connection.close();
        statement.close();
    }

    public static int getNoOfProductInCart(String customerName) throws SQLException, ClassNotFoundException {
        int cartID = CartDAO.getCartID(customerName);
        int noOfProducts = 0;
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select product_quantity from ordered_product where(cart_idcart =" + cartID + ")";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            noOfProducts += resultSet.getInt("product_quantity");
        }
        connection.close();
        statement.close();
        resultSet.close();
        return noOfProducts;
    }

    public static void createCart(String userName) throws SQLException, ClassNotFoundException {
        int userID = CustomerDAO.getUserID(userName);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "insert into cart (Customer_id) values( " + userID + ")";
        statement.executeUpdate(sql);
        connection.close();
        statement.close();

    }

    public static int getTotalPrice(String userName) throws ClassNotFoundException, SQLException {
        ArrayList<ProductInCartDTO> productsList = new ArrayList<>();
        productsList = CartDAO.getProductsFromCart(userName);
        int totalPrice = 0;
        for (int i = 0; i < productsList.size(); i++) {
            ProductInCartDTO productInCartDTO = (ProductInCartDTO) productsList.get(i);
            int amount = productInCartDTO.getAmount();
            int price = productInCartDTO.getPrice();
            totalPrice += (amount * price);
        }
        return totalPrice;
    }

    public static void emptyCart(String userName) throws SQLException, ClassNotFoundException {
        int cartID = CartDAO.getCartID(userName);
        String sql = "DELETE  FROM ordered_product WHERE (cart_idcart =" + cartID + ")";
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        statement.executeUpdate(sql);
        connection.close();
        statement.close();

    }
}
