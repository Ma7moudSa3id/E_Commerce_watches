
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.dto.OrderedProductDTO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE HTML>
<html>
    <head>
        <title>Watches an E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Checkout :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <!--webfont-->
        <link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Dorsa' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
        <script src="js/jquery.easydropdown.js"></script>
        <script src="js/simpleCart.min.js"></script>
    </head>
    <body>
        <div class="men_banner">
            <div class="container">
                <div class="header_top">
                    <div class="header_top_left">
                        <div class="box_11"><a href="<c:url value='CheckoutServlet'/>">
                                <h4><p>Cart: <c:out value="${sessionScope.totalPrice}"/> $ (<c:out value="${sessionScope.noOfProducts}"/> items)</p><img src="images/bag.png" alt=""/><div class="clearfix"> </div></h4>
                            </a></div>
                        <p class="empty"><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="header_top_right">

                        <c:choose>
                            <c:when test="${not pageContext.session['new']}">
                                <ul class="header_user_info">
                                    <a  href="<c:url value='ViewProfile'/>">
                                        <i class="user"> </i> 
                                        <li class="user_desc"><c:out value="${sessionScope.name}"/></li>
                                    </a>
                                    <a  href="<c:url value='LogOutServlet'/>">
                                        <i class="user"> </i> 
                                        <li class="user_desc">Logout</li>
                                    </a>
                                    <div class="clearfix"> </div>
                                </ul>

                            </c:when>
                            <c:otherwise>
                                <ul class="header_user_info">
                                    <a  href="<c:url value='login.html'/>">
                                        <i class="user"> </i> 
                                        <li class="user_desc">Login / Register</li>
                                    </a>
                                    <div class="clearfix"> </div>
                                </ul>
                            </c:otherwise>
                        </c:choose>
                        <!-- start search-->
                        <div class="search-box">
                            <div id="sb-search" class="sb-search">
                                <form>
                                    <input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
                                    <input class="sb-search-submit" type="submit" value="">
                                    <span class="sb-icon-search"> </span>
                                </form>
                            </div>
                        </div>
                        <!----search-scripts---->
                        <script src="js/classie1.js"></script>
                        <script src="js/uisearch.js"></script>
                        <script>
            new UISearch(document.getElementById('sb-search'));
                        </script>
                        <!----//search-scripts---->
                        <div class="clearfix"> </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="header_bottom">
                    <div class="logo">
                        <h1><a href="index.jsp"><span class="m_1">W</span>atches</a></h1>
                    </div>
                    <div class="menu">
                        <ul class="megamenu skyblue">
                            <li><a class="color2" href="#">Mens</a>

                            <li><a class="color4" href="#">womens</a>

                                <div class="clearfix"> </div>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <div class="account-in">
            <div class="container">
                <div class="check_box">	 
                    <div class="col-md-9 cart-items">
                        <h1>My Shopping Bag (<c:out value="${sessionScope.noOfProducts}"/>)</h1>

                        <c:forEach items="${products}" var="product">

                            <div class="cart-header">

                                <div class="cart-sec simpleCart_shelfItem">
                                    <div class="cart-item cyc">
                                        <c:url value="DeleteFromCartServlet" var="deleteURL">
                                            <c:param name="productName" value="${product.name}" />
                                        </c:url>
                                        <a href="${deleteURL}">
                                            <img src="images/close_1.png" >
                                            

                                        </a>
                                        <img src="images/<c:out value="${product.name}" />.jpg" class="img-responsive" alt=""/> 
                                    </div>
                                    <div class="cart-item-info">
                                        <h3><c:out value="${product.name}" /></h3>
                                        <ul class="qty">

                                            <li><p>Qty : <c:out value="${product.amount}" /> </p></li>
                                        </ul>
                                        <div class="delivery">
                                            <p>Price : <c:out value="${product.price}" /> </p>
                                            <p>Total Price : <c:out value="${product.amount*product.price}" /> </p>

                                            <div class="clearfix"></div>
                                        </div>	
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>



                        </c:forEach>
                    </div>
                    <div class="col-md-3 cart-total">

                        <div class="price-details">
                            <h3>Price Details</h3>
                            <span>Total Items</span>
                            <span class="total1"><c:out value="${sessionScope.noOfProducts}"/></span>
                            <span>Discount</span>
                            <span class="total1">---</span>

                            <div class="clearfix"></div>				 
                        </div>	
                        <ul class="total_price">
                            <li class="last_price"> <h4>TOTAL</h4></li>	
                            <li class="last_price"><span><c:out value="${sessionScope.totalPrice}"/></span></li>
                            <div class="clearfix"> </div>
                        </ul>
                        <div class="clearfix"></div>
                        <c:if test="${sessionScope.totalPrice gt sessionScope.creditLimit}" >
                            <a class="order" href="">You don't have enough money</a>
                        </c:if>
                        <c:if test="${sessionScope.creditLimit  gt sessionScope.totalPrice }" >

                            <a class="order" href="<c:url value='PayServlet'/>">Buy</a>
                        </c:if>


                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>


        <div class="cssmenu">
            <ul>
                <li class="active"><a href="#">Privacy</a></li>
                <li><a href="#">Terms</a></li>
                <li><a href="#">Shop</a></li>
                <li><a href="#">About</a></li>
                <li><a href="contact.html">Contact</a></li>
            </ul>
        </div>
        <ul class="social">
            <li><a href=""> <i class="instagram"> </i> </a></li>
            <li><a href=""><i class="fb"> </i> </a></li>
            <li><a href=""><i class="tw"> </i> </a></li>
        </ul>
        <div class="clearfix"></div>
        <div class="copy">
            <p> &copy; 2015 Watches. All Rights Reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a></p>
        </div>
    </div>
</div>
</body>
</html>		