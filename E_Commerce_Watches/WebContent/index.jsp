<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<html>
    <head>
        <title>Watches an E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Home :: w3layouts</title>
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
        <div class="banner">
            <div class="container">
                <div class="header_top">
                    <div class="header_top_left">
                        <div class="box_11"><a href="<c:url value='CheckoutServlet'/>">
                                <h4><p>Cart: <c:out value="${sessionScope.totalPrice}"/> $(<c:out value="${sessionScope.noOfProducts}"/> items)</p><img src="images/bag.png" alt=""/><div class="clearfix"> </div></h4>
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
                            <li><a class="color2" href="<c:url value='proserv'/>">Men</a>

                            </li>
                            <li><a class="color4" href="<c:url value='TrialServlet'/>">womens</a>



                                <div class="clearfix"> </div>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>


        <div class="content_middle_bottom">
            <div class="header-left" id="home">
                <section>
                    <ul class="lb-album" >
                        <li>
                            <a href="#image-1">
                                <img src="images/g1.jpg"  class="img-responsive" alt="image01"/>
                                <span>Pointe</span>
                            </a>
                            <div class="lb-overlay" id="image-1">
                                <a href="#page" class="lb-close">x Close</a>
                                <img src="images/g1.jpg"  class="img-responsive" alt="image01"/>
                                <div>
                                    <h3>pointe <span>/point/</span></h3>
                                    <p>Dance performed on the tips of the toes</p>
                                </div>
                            </div>
                        </li>
                        <li>
                            <a href="#image-2">
                                <img src="images/g2.jpg"  class="img-responsive" alt="image02"/>
                                <span>Port de bras</span>
                            </a>
                            <div class="lb-overlay" id="image-2">
                                <img src="images/g2.jpg"  class="img-responsive" alt="image02"/>
                                <div>							
                                    <h3>port de bras <span>/ˌpôr də ˈbrä/</span></h3>
                                    <p>An exercise designed to develop graceful movement and disposition of the arms</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-3">
                                <img src="images/g3.jpg"  class="img-responsive" alt="image03"/>
                                <span>Plié</span>
                            </a>
                            <div class="lb-overlay" id="image-3">
                                <img src="images/g3.jpg"  class="img-responsive" alt="image03"/>
                                <div>							
                                    <h3>pli·é <span>/plēˈā/</span></h3>
                                    <p>A movement in which a dancer bends the knees and straightens them again</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-4">
                                <img src="images/g4.jpg"  class="img-responsive" alt="image04"/>
                                <span>Adagio</span>
                            </a>
                            <div class="lb-overlay" id="image-4">
                                <img src="images/g4.jpg"  class="img-responsive" alt="image04"/>
                                <div>							
                                    <h3>a·da·gio <span>/əˈdäjō/</span></h3>
                                    <p>A movement or composition marked to be played adagio</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-5">
                                <img src="images/g5.jpg"  class="img-responsive" alt="image05"/>
                                <span>Frappé</span>
                            </a>
                            <div class="lb-overlay" id="image-5">
                                <img src="images/g5.jpg"  class="img-responsive" alt="image05"/>
                                <div>							
                                    <h3>frap·pé<span>/fraˈpā/</span></h3>
                                    <p>Involving a beating action of the toe of one foot against the ankle of the supporting leg</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-6">
                                <img src="images/g6.jpg"  class="img-responsive" alt="image06"/>
                                <span>Glissade</span>
                            </a>
                            <div class="lb-overlay" id="image-6">
                                <img src="images/g6.jpg"  class="img-responsive" alt="image06"/>
                                <div>							
                                    <h3>glis·sade <span>/gliˈsäd/</span></h3>
                                    <p>One leg is brushed outward from the body, which then takes the weight while the second leg is brushed in to meet it</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-7">
                                <img src="images/g7.jpg"  class="img-responsive" alt="image07"/>
                                <span>Jeté</span>
                            </a>
                            <div class="lb-overlay" id="image-7">
                                <img src="images/g7.jpg"  class="img-responsive" alt="image07"/>
                                <div>							
                                    <h3>je·té <span>/zhə-ˈtā/</span></h3>
                                    <p>A springing jump made from one foot to the other in any direction</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <li>
                            <a href="#image-8">
                                <img src="images/g8.jpg"  class="img-responsive" alt="image08"/>
                                <span>Piqué</span>
                            </a>
                            <div class="lb-overlay" id="image-8">
                                <img src="images/g8.jpg"  class="img-responsive" alt="image08"/>
                                <div>							
                                    <h3>pi·qué <span>/pēˈkā/</span></h3>
                                    <p>Strongly pointed toe of the lifted and extended leg sharply lowers to hit the floor then immediately rebounds upward</p>
                                </div>
                                <a href="#page" class="lb-close">x Close</a>
                            </div>
                        </li>
                        <div class="clearfix"></div>
                    </ul>
                </section>
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