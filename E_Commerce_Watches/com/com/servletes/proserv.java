package com.servletes;

import com.dto.ProductDTO;
import com.ecommerce.Utilities;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/proserv")
public class proserv extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public proserv() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ProductDTO> list = new ArrayList<>();

        ResultSet rs;

        try {
            Connection con = Utilities.openConnection();
            Statement statement = Utilities.createStatement(con);
            rs = statement.executeQuery("SELECT * FROM product");
            while (rs.next()) {
                ProductDTO pro = new ProductDTO();
                String name = rs.getString("prod_name");
                int price = rs.getInt("prod_price");
                int amount = rs.getInt("prod_amount");
                String category = rs.getString("prod_category");
                System.out.println(name + price + amount + category);

                pro.setName(name);
                pro.setPrice(price);
                pro.setAmount(amount);
                pro.setCategory(category);
                list.add(pro);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(proserv.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("list", list);
        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
