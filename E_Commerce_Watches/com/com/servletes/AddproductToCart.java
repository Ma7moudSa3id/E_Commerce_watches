package com.servletes;

import com.dao.CartDAO;
import com.dao.CustomerDAO;
import com.dao.ProductDAO;
import com.dto.OrderedProductDTO;
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

public class AddproductToCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String userName = (String) session.getAttribute("name");
        String productName = (String) req.getParameter("productName");
        int amount = 1;
        try {
            int productID = ProductDAO.getProductID(productName);
            System.out.println(userName + productName);
            OrderedProductDTO orderedProductDTO = new OrderedProductDTO(productID, amount);

            CartDAO.addProductToCartDAO(orderedProductDTO, userName);
            session.setAttribute("totalPrice", CartDAO.getTotalPrice(userName));
            session.setAttribute("noOfProducts", CartDAO.getNoOfProductInCart(userName));
        } catch (SQLException ex) {
            Logger.getLogger(AddproductToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddproductToCart.class.getName()).log(Level.SEVERE, null, ex);
        }

        req.getRequestDispatcher("proserv").forward(req, resp);

    }

}
