
package com.dao;

import com.ecommerce.Utilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderedProductDAO {
    public static int getOrderedProductAmount(int productID , String userName) throws SQLException, ClassNotFoundException{
        int cartID = CartDAO.getCartID(userName);
        Connection Connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(Connection);
        String sql ="SELECT product_quantity FROM `e-commerce`.ordered_product where product_id ="+productID+" and cart_idcart ="+cartID;
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int orderedProductAmount = resultSet.getInt("product_quantity");
        Connection.close();
        statement.close();
        resultSet.close();
        return orderedProductAmount;
    
    }
}
