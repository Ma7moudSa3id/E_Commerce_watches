<%-- 
    Document   : trial2
    Created on : Mar 5, 2017, 4:12:06 PM
    Author     : Eng.MSI
--%>

<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ page import="com.dto.OrderedProductDTO" %>
<%@page import="com.dao.CartDAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>trial2</title>
    </head>
    <body>

${item.amount}
        <c:forEach items="${list}" var="item">
       
       						<li class="last simpleCart_shelfItem">
							<a class="cbp-vm-image" href="single.html">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<div class="mask1"><img src="images/${item.name}.jpg" alt="image" class="img-responsive zoom-img"></div>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <h4>${item.name}</h4>
									   <p>${item.category}</p>
									    <div class="price mount item_price">${item.price}</div>
									    <a class="button item_add cbp-vm-icon cbp-vm-add" href="#">Add to cart</a>
									 </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
						</li>
       
    </c:forEach>




</body>
</html>
