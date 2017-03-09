package com.servletes;

import com.dao.CartDAO;
import com.dto.CustomerDTO;
import com.ecommerce.Utilities;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

public class servregister extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CustomerDTO dto = new CustomerDTO();
        String fname = request.getParameter("fname");
        String pwd = request.getParameter("password");
        String creditlimit = request.getParameter("climit");
        String email = request.getParameter("email");
        String job = request.getParameter("job");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        dto.setName(fname);
        dto.setPass(pwd);
        dto.setMail(email);
        dto.setAddress(address);
        dto.setCreditlimit(Integer.parseInt(creditlimit));
        dto.setJob(job);
        dto.setPhone(phone);

        try {
            Connection connection = Utilities.openConnection();
            java.sql.Statement statement = Utilities.createStatement(connection);
            

            if (pwd.isEmpty() || fname.isEmpty() || creditlimit.isEmpty() || email.isEmpty()) {
                response.sendRedirect("reg.html");

            } else {
                statement.executeUpdate("insert into customer (cst_name,cst_pass,cst_creditlimit,cst_mail,cst_phone,cst_address,cst_job) values ('" + dto.getName() + "','" + dto.getPass() + "','" + dto.getCreditlimit() + "','" + dto.getMail() + "','" + dto.getPhone() + "','" + dto.getAddress() + "','" + dto.getJob() + "')");
                HttpSession session = request.getSession(true);
                CartDAO.createCart(fname);
                session.setAttribute("name",fname );
                
                response.sendRedirect("ViewProfile");

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servregister.class.getName()).log(Level.SEVERE, null, ex);
        }
        //response.sendRedirect("brands.html");

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
