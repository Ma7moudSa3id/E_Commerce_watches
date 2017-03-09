package com.servletes;

import com.dao.CartDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteFromCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productName = request.getParameter("productName");
        try {
            int cartID = CartDAO.getCartID("mahmoud");
            CartDAO.deleteProductFromCart(cartID, productName);
            request.getSession().setAttribute("totalPrice", CartDAO.getTotalPrice((String) request.getSession().getAttribute("name")));
            request.getSession().setAttribute("noOfProducts", CartDAO.getNoOfProductInCart((String) request.getSession().getAttribute("name")));
                    
                    } catch (SQLException ex) {
            Logger.getLogger(DeleteFromCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeleteFromCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("/CheckoutServlet").forward(request, response);

    }

}
