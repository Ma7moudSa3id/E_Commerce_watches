<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ page import="com.dto.OrderedProductDTO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=windows-1256">
        <title>Insert title here</title>
    </head>
    <body>



        <c:forEach items="${products}" var="product">
            <script>$(document).ready(function (c) {
                    $('.close1').on('click', function (c) {
                        $('.cart-header').fadeOut('slow', function (c) {
                            $('.cart-header').remove();
                        });
                    });
                });
            </script>
            <div class="cart-header">
                <div class="close1"> </div>
                <div class="cart-sec simpleCart_shelfItem">
                    <div class="cart-item cyc">
                        <img src="images/<c:out value="${product.name}" />.jpg" class="img-responsive" alt=""/>
                    </div>
                    <div class="cart-item-info">
                        <h3><c:out value="${product.name}" /></h3>
                        <ul class="qty">

                            <li><p>Qty : <c:out value="${product.amount}" /> </p></li>
                        </ul>
                        <div class="delivery">
                            <p>Price : <c:out value="${product.price}" /> </p>

                            <div class="clearfix"></div>
                        </div>	
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            
             
             
        </c:forEach>

        <br>





    </body>
</html>