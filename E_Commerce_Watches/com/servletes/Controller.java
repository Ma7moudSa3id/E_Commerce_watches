package com.servletes;

import com.dao.CartDAO;
import com.dao.ProductDAO;
import com.dto.OrderedProductDTO;
import com.dto.ProductDTO;
import com.dto.ProductInCartDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet(loadOnStartup = 1, urlPatterns = {"/Controller", "/products", "/single", "/checkout"})
public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<OrderedProductDTO> orderedProducts = new ArrayList<>();
        ArrayList<ProductInCartDTO> products = new ArrayList<>();
        try {
            products = CartDAO.getProductsFromCart("mahmoud");


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

        req.setAttribute("products", products);
        req.getRequestDispatcher("/trial.jsp").forward(req, resp);
    }

}
