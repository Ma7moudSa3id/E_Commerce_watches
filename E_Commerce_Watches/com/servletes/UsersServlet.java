package com.servletes;

import com.dao.CustomerDAO;
import com.dto.CustomerDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<CustomerDTO> list = new ArrayList<>();
        try {
            list = CustomerDAO.getAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(UsersServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsersServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("customers", list);
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }
    
}
