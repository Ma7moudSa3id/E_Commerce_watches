/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Eng.MSI
 */
public class ViewProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomerDTO customerDTO = new CustomerDTO();
        HttpSession session = req.getSession();
        
        ArrayList<CustomerDTO> list = new ArrayList<>();
        try {
            int customerID = CustomerDAO.getUserID((String)session.getAttribute("name"));
            customerDTO = CustomerDAO.showCustomerData(customerID);
            list.add(customerDTO);
        } catch (SQLException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("customer", list);
        req.getRequestDispatcher("/profile.jsp").forward(req, resp);
    }

}
