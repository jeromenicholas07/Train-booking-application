<%-- 
    Document   : HeaderPage
    Created on : Jul 23, 2016, 2:41:26 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header Page</title>

        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />

        <!-- 
            <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
        <link href="assets/css/material-kit.css" rel="stylesheet"/>
        -->
    </head>
    <body style="margin: 0;font-family: Century Gothic;">

        <!--
         <table border="0" width="100%" align="centre" style="font-family: Century Gothic;padding: 0" >
             <tr>
                 <td rowspan="2" width="10%" align="left"><img height="75" src="Images/Indian_Railways_Suburban_Railway_Logo.svg.png" alt="Logo.png" ></td>
                 <td rowspan="2" align="left" valign="centre" width="45%"><font style="font-family: Century gothic; font-size: x-large;text-align: left" >Indian<br/>Railway</font></td>
                 <th valign="bottom" align="right" width="20%"><a href="DescriptionPage.jsp" target="middle" style="color: floralwhite; text-decoration: none">Home</a></th>
                 <th valign="bottom" align="centre" width="10%"><a href="RegisterationPage.jsp" target="middle" style="color: floralwhite; text-decoration: none">Register</a></th>
                 <th valign="bottom" align="left" ><a href="LoginPage.jsp" target="middle" style="color: floralwhite; text-decoration: none"> Login</a></th>
             </tr>
             <tr>
                 <th valign="top" align="right"><a href="SearchTrainPage.jsp" target="middle" style="color: floralwhite; text-decoration: none">Search</a></th>
                 <th valign="top"><a href="TicketHistoryPage.jsp" target="middle" style="color: floralwhite; text-decoration: none">History</a></th>
                 <th valign="top" align="left"><a href="DescriptionPage.jsp" target="middle" style="color: floralwhite; text-decoration: none">Contact us</a></th>
 
             </tr>
         </table>
        -->
        <!--
                <nav class="navbar navbar-default" role="navigation" align="right">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a href="">
                                <div class="logo-container">
                                    <div class="logo">
                                        <img src="Images/Indian_Railways_Suburban_Railway_Logo.svg.png" alt="Logo.png" height="55">
                                    </div>
                                </div>
                            </a>
                        </div>
        
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" align="right">
                            <ul class="nav navbar-nav">
                                <li><a href="" style="font-size: large">Indian Railway</a></li>
        
                                <li class="active"><a href="DescriptionPage.jsp" target="middle">Home</a></li>
                                <li><a href="RegisterationPage.jsp" target="middle">Register</a></li>
                                <li><a href="LoginPage.jsp" target="middle">Login</a></li>
                                <li><a href="SearchTrainPage.jsp" target="middle">Search</a></li>
                                <li><a href="TicketHistoryPage.jsp" target="middle">History</a></li>
                                <li><a href="ContactUs.jsp" target="middle">Contact us</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
        -->
        <style>
            ul {

                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            li {
                float: left;
                line-height: 0;
            }

            li a {
                margin-top: 10px;
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover:not(.active) {
                background-color: #111;
            }

            .active {
                background-color: #4CAF50;

            }
            .logobox{
                font-size: larger;
                
                float: left;
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                vertical-align: text-bottom;
                line-height: 0;
            }
            .sepcont{
                margin-left: 600px;
                margin-top: 15px
            }
        </style>

        <ul class="nav navbar-nav">
            <li class="logobox"><img style="padding: 0px 0px;" src="Images/Indian_Railways_Suburban_Railway_Logo.svg.png" alt="logo.png" height="55"/></li>
            <li class="logobox" style="font-size: xx-large"><a href="DescriptionPage.jsp">Indian Railway</a></li>
            <div class="sepcont">
                <li style="width: 20%;float: left;"></li>
                <li><a class="active" href="DescriptionPage.jsp" target="middle">Home</a></li>
                <li><a href="SearchTrainPage.jsp" target="middle">Search</a></li>
                <li><a href="TicketHistoryPage.jsp" target="middle">History</a></li>
                <li><a href="LoginPage.jsp" target="middle">Login/Logout</a></li>
                <li><a href="RegisterationPage.jsp" target="middle">Register</a></li>
                <li><a href="ContactUs.jsp" target="middle">Contact Us</a></li>
            </div>
        </ul>

    </body>
</html>
