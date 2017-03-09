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
        <title>Watches an E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Register :: w3layouts</title>
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


                    <div class="clearfix"> </div>
                </div>
                <div class="header_bottom">
                    <div class="logo">
                        <h1><a href="index.jsp"><span class="m_1">W</span>atches</a></h1>
                    </div>
                    <div class="menu">
                        <ul class="megamenu skyblue">

                            <div class="clearfix"> </div>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <div class="account-in">
            <div class="container">
                <form> 
                    <div class="register-top-grid">

                        <c:forEach items="${customers}" var="customer">
                            <h2>${customer.name}</h2>
                            <div>
                                <span>Phone</span>
                                <b>${customer.phone}</b>


                            </div>
                            <div>
                                <span>Mail</span>
                                <b>${customer.mail}</b>


                            </div>
                            <div>
                                <span>Address</span>
                                <b>${customer.address}</b>


                            </div>
                            <div>
                                <span>Job</span>
                                <b>${customer.job}</b>


                            </div>
                            <div>
                                <span>Credit Limit</span>
                                <b>${customer.creditlimit}</b>


                            </div>

                                
                        </c:forEach>


                        <div class="clearfix"> </div>

                    </div>

                </form>
                <div class="clearfix"> </div>
                <div class="register-but">
                    <form action="editProfile.jsp">

                </div>
            </div>
        </div>


    </body>
</html>		