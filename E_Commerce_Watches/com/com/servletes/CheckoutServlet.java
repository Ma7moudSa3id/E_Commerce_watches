package com.servletes;

import com.dao.CartDAO;
import com.dto.OrderedProductDTO;
import com.dto.ProductInCartDTO;
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

public class CheckoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<OrderedProductDTO> orderedProducts = new ArrayList<>();
        ArrayList<ProductInCartDTO> products = new ArrayList<>();
        try {
            products = CartDAO.getProductsFromCart("mahmoud");
                        request.getSession().setAttribute("totalPrice", CartDAO.getTotalPrice((String) request.getSession().getAttribute("name")));
            request.getSession().setAttribute("noOfProducts", CartDAO.getNoOfProductInCart((String) request.getSession().getAttribute("name")));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.setAttribute("products", products);
        request.getRequestDispatcher("/checkout.jsp").forward(request, response);

    }

}
