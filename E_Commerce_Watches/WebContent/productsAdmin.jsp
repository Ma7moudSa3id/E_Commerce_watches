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
                        
                        <p class="empty"><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="header_top_right">

                       
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

    </body>
</html>		