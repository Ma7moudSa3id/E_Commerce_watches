package com.servletes;

import com.dao.CartDAO;
import com.dao.CustomerDAO;
import com.dto.CustomerDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(req.getParameter("name"));
        customerDTO.setPass(req.getParameter("pass"));
        customerDTO.setCreditlimit(Integer.parseInt(req.getParameter("creditLimit")));
        customerDTO.setMail(req.getParameter("mail"));
        customerDTO.setPhone(req.getParameter("phone"));
        customerDTO.setAddress(req.getParameter("address"));
        customerDTO.setJob(req.getParameter("job"));
        try {
            CustomerDAO.editCustomer((String) req.getSession().getAttribute("name"), customerDTO);
            req.getSession().setAttribute("totalPrice", CartDAO.getTotalPrice(req.getParameter("name")));
            req.getSession().setAttribute("noOfProducts", CartDAO.getNoOfProductInCart(req.getParameter("name")));
            req.getSession().setAttribute("creditLimit", CustomerDAO.getUserCreditLimit(req.getParameter("name")));

        } catch (SQLException ex) {
            Logger.getLogger(EditProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        req.getRequestDispatcher("/ViewProfile").forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        CustomerDTO customerDTO = new CustomerDTO();
//        customerDTO.setName(request.getParameter("name"));
//        customerDTO.setPass(request.getParameter("pass"));
//        customerDTO.setCreditlimit(Integer.parseInt(request.getParameter("creditLimit")));
//        customerDTO.setMail(request.getParameter("mail"));
//        customerDTO.setPhone(request.getParameter("phone"));
//        customerDTO.setAddress(request.getParameter("address"));
//        customerDTO.setJob(request.getParameter("job"));
//        try {
//            CustomerDAO.editCustomer("Mahmoud", customerDTO);
//        } catch (SQLException ex) {
//            Logger.getLogger(EditProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(EditProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        request.getRequestDispatcher("/ViewProfile").forward(request, response);
//             
//
//    }
}
