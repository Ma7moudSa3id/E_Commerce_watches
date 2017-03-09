/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servletes;

import com.dto.ProductDTO;
import static com.sun.xml.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class AddProduct extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(req.getParameter("name"));
        productDTO.setPrice(Integer.parseInt(req.getParameter("price")));
        productDTO.setCategory(req.getParameter("category"));
        productDTO.setAmount(Integer.parseInt(req.getParameter("amount")));
        final Part filePart = req.getPart("file");
        OutputStream out = null;
        InputStream filecontent = null;
        try {
            out = new FileOutputStream(new File("C:\\Users\\Eng.MSI\\Documents\\NetBeansProjects\\E_Commerce\\web\\images\\" + productDTO.getName() + ".jpeg"));
            filecontent = filePart.getInputStream();
            com.dao.ProductDAO.addProduct(productDTO);

            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }


            LOGGER.log(Level.INFO, "File{0}being uploaded to {1}",
                    new Object[]{"img", "C:\\Users\\Eng.MSI\\Documents\\NetBeansProjects\\E_Commerce\\web\\images"});
        } catch (FileNotFoundException fne) {


            LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}",
                    new Object[]{fne.getMessage()});
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
            

        }
    }

}
