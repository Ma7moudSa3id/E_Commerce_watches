package com.servletes;

import com.dao.CartDAO;
import com.dao.CustomerDAO;
import com.dto.LoginDTO;
import com.ecommerce.Utilities;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlogin extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setName(request.getParameter("email"));
        loginDTO.setPass(request.getParameter("userpassword"));

        try {
            Connection connection = Utilities.openConnection();
            Statement statement = Utilities.createStatement(connection);

            ResultSet rs = statement.executeQuery("select * from customer");
            while (rs.next()) {
                String mail = rs.getString("cst_mail");
                String pass = rs.getString("cst_pass");
                if (pass.equals(loginDTO.getPass()) && mail.equals(loginDTO.getName())) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("name", rs.getString("cst_name"));
                    session.setAttribute("totalPrice", CartDAO.getTotalPrice(rs.getString("cst_name")));
                    session.setAttribute("noOfProducts", CartDAO.getNoOfProductInCart(rs.getString("cst_name")));
                    session.setAttribute("creditLimit", CustomerDAO.getUserCreditLimit(rs.getString("cst_name")));
                    
                    RequestDispatcher requestDispatcher;
                    requestDispatcher = request.getRequestDispatcher("index.jsp");
                    requestDispatcher.forward(request, response);

                } 

            }
//            RequestDispatcher requestDispatcher;
//                    requestDispatcher = request.getRequestDispatcher("login.html");
//                    requestDispatcher.forward(request, response);
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



}
