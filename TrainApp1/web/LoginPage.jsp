<%-- 
    Document   : LoginPage
    Created on : Jul 23, 2016, 2:42:33 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html align="middle">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script src="https://www.google.com/recaptcha/api.js"></script>
    </head>
    <body style="background-color: inherit;alignment-adjust: middle">
        <br/>
        <!--
                <div class="container-fluid">
                    <div class="col-md-4 col-md-offset-3">
                        <div class="col-md-12">Login</div>
        
                        <div class="row">
                            <div class="col-md-3">
                                <label class="text-primary vertical-align">Username: </label>
                            </div>
                            <div class="col-md-9">
                                <input name="email" type="email" class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
        -->
        <%
            if(session.getAttribute("email")!=null){
                session.setAttribute("email", null);
                
                out.print("<label class='h2'>Logout Successful</label>");
            }
            else{
        %>
        <form method="post" action="LoginServlet">
            <div class="container-fluid">
                <div class="col-md-2 col-md-offset-3">
                     <table width="400" border="0" class="table-condensed">
                        <tr><th colspan="2" class="text-center" style="color: #990099;font-family: Century Gothic;font-size: x-large;">Login details<br/> </th></tr>

                        <tr><td colspan="2" style="color: #990099;font-family: Century Gothic;" align="middle">
                                <div class="col-md-3">
                                    <label class="text" align="left">Username:</label>

                                    <span class="material-input"></span>
                                </div>
                                <div class="col-md-9">
                                    <input name="email" type="email" class="form-control">
                                </div>
                            </td></tr>
                        <tr><td colspan="2" style="color: #990099;font-family: Century Gothic;" align="middle">
                                <div class="col-sm-3">
                                    <label class="text">Password:</label>
                                </div>
                                <div class="col-md-9">
                                    <input name="password" type="password" class="form-control">
                                    <span class="material-input"></span>    
                                </div>

                            </td></tr>

                        <tr><td colspan="2"align="middle">
                                <div class="g-recaptcha"
                                     data-sitekey="6LflRycTAAAAAPnTLHBE-iT4EHvrJs1RX4h9VwGL"></div>
                            </td></tr>

                        <tr>
                            <td>
                                <input class="btn btn-danger" type="reset" value="Reset" />
                            </td>
                            <td>
                                <input class="btn btn-success" type="submit" value="Submit"/>
                            </td>
                    </table>
                </div>
            </div>
        </form>
        <% } %>
    </body>
</html>
