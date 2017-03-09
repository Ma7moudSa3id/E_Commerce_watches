package com.dao;

import com.dto.CustomerDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.ecommerce.Utilities;
import java.util.ArrayList;

public class CustomerDAO {

    public static int getUserID(String userName) throws SQLException, ClassNotFoundException {
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select idCustomer from customer where cst_name = \"" + userName + "\"";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int customerID = resultSet.getInt("idCustomer");
        connection.close();
        statement.close();
        resultSet.close();
        return customerID;
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

    public static void editCustomer(String UserName, CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        String name = customerDTO.getName();
        String pass = customerDTO.getPass();
        int creditlimit = customerDTO.getCreditlimit();
        String mail = customerDTO.getMail();
        String phone = customerDTO.getPhone();
        String address = customerDTO.getAddress();
        String job = customerDTO.getJob();
        int customerID = CustomerDAO.getUserID(name);
        String sql = "UPDATE customer SET cst_name = \"" + name + "\" , cst_pass = \"" + pass + "\" ,"
                + "cst_creditlimit = \"" + creditlimit + "\",cst_mail = \"" + mail + "\" ,"
                + "cst_phone = \"" + phone + "\", cst_address = \"" + address + "\","
                + "cst_job = \"" + job + "\" where (idCustomer =   " + 1 + ")";
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        statement.executeUpdate(sql);
        connection.close();
        statement.close();

    }

    public static int getUserCreditLimit(String userName) throws SQLException, ClassNotFoundException {
        int creditLimit;
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "select cst_creditlimit from customer where (cst_name = \"" + userName + "\")";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        creditLimit = resultSet.getInt("cst_creditlimit");
        return creditLimit;
    }

    public static void editUserCredit(int newCredit, String userName) throws SQLException, ClassNotFoundException {
        int userID = CustomerDAO.getUserID(userName);
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        String sql = "update customer set cst_creditlimit = " + newCredit + " where (idCustomer =" + userID + ")";
        statement.executeUpdate(sql);
        connection.close();
        statement.close();
    }

    public static ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        String sql = "select * from customer ";
        Connection connection = Utilities.openConnection();
        Statement statement = Utilities.createStatement(connection);
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setName(resultSet.getString("cst_name"));
            customerDTO.setPass(resultSet.getString("cst_pass"));
            customerDTO.setAddress(resultSet.getString("cst_address"));
            customerDTO.setMail(resultSet.getString("cst_mail"));
            customerDTO.setPhone(resultSet.getString("cst_phone"));
            customerDTO.setJob(resultSet.getString("cst_job"));
            customerDTO.setCreditlimit(resultSet.getInt("cst_creditlimit"));
            list.add(customerDTO);
        }
        connection.close();
        statement.close();
        resultSet.close();
        return list;
    }
}
