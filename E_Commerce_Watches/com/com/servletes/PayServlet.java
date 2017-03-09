package com.servletes;

import com.dao.CartDAO;
import com.dao.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int newCredit = (int) req.getSession().getAttribute("creditLimit") - (int) req.getSession().getAttribute("totalPrice");
        HttpSession session = req.getSession();
        try {
            CustomerDAO.editUserCredit(newCredit, (String) req.getSession().getAttribute("name"));
            CartDAO.emptyCart((String) req.getSession().getAttribute("name"));
            session.setAttribute("totalPrice", 0);
            session.setAttribute("noOfProducts", 0);
            session.setAttribute("creditLimit", CustomerDAO.getUserCreditLimit((String) req.getSession().getAttribute("name")));
            session.setAttribute("totalPrice", 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(PayServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PayServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

}
