<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<html>
    <head>
        <title>Watches an E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Men :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- Custom Theme files -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <link href="css/component.css" rel='stylesheet' type='text/css' />
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

                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <div class="men">
            <div class="container">
                <div class="col-md-4 sidebar_men">
                    <h3>Categories</h3>
                    <ul class="product-categories color"><li class="cat-item cat-item-42">

                        <li class="cat-item cat-item-62"><a href="#">Men</a> <span class="count">(2)</span></li>
                        <li class="cat-item cat-item-41"><a href="#">Women</a> <span class="count">(17)</span></li>
                    </ul>

                </div>
                <div class="col-md-8 mens_right">
                    <div class="dreamcrub">
                        <ul class="breadcrumbs">
                            <li class="home">
                                <a href="index.html" title="Go to Home Page">Home</a>&nbsp;
                                <span>&gt;</span>
                            </li>
                            <li class="home">&nbsp;
                                Men / Women&nbsp;
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="mens-toolbar">

                        <ul class="women_pagenation dc_paginationA dc_paginationA06">
                            <li><a href="#" class="previous">Page : </a></li>
                            <li class="active"><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                        </ul>
                        <div class="clearfix"></div>		
                    </div>
                    <div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
                        <div class="cbp-vm-options">
                            <a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected" data-view="cbp-vm-view-grid" title="grid">Grid View</a>
                            <a href="#" class="cbp-vm-icon cbp-vm-list" data-view="cbp-vm-view-list" title="list">List View</a>
                        </div>
                        <div class="pages">   

                        </div>
                        <div class="clearfix"></div>
                       
                            <ul>

                                <c:forEach items="${list}" var="item">

                                    <li class="last simpleCart_shelfItem">

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
                                                        <c:url value="AddproductToCart" var="addProductURL">
                                                            <c:param name="productName" value="${item.name}" />
                                                        </c:url>
                                                        <a class="button item_add cbp-vm-icon cbp-vm-add" href="${addProductURL}">Add to cart</a>
                                                    </div>		
                                                </div>
                                            </div>
                                        </div>
                                     
                                    </li>

                                </c:forEach>
                            </ul>
                        

                    </div>
                    <script src="js/cbpViewModeSwitch.js" type="text/javascript"></script>
                    <script src="js/classie.js" type="text/javascript"></script>
                </div>
            </div>
        </div>
        <div class="footer">
            <div class="container">
                <div class="newsletter">
                    <h3>Newsletter</h3>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>
                    <form>
                        <input type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = '';
                                }">
                        <input type="submit" value="SUBSCRIBE">
                    </form>
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