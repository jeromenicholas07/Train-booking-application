<%-- 
    Document   : SearchTrainPage
    Created on : Jul 23, 2016, 2:43:17 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            if (session.getAttribute("email") == null) {
        %>
        <script>
            alert("Login first!!");
            window.location ="LoginPage.jsp";
            
        </script>

        <%
            
        } else {
        %>
        <form action="Search" method="POST">
            <br/>
            <div class="container">
                <div class="col-md-4 col-md-offset-3">
                    <div class="col-md-12">
                        <label class="h3">Travel Details</label>
                    </div>
                    <div class="col-md-3">
                        <label class="text-primary" style="margin-top: 5px">Source</label>
                    </div>
                    <div class="col-md-9"><input type="text" name="source" placeholder="source" class="form-control"style="margin-bottom: 5px"/></div>
                    <div class="col-md-3">
                        <label class="text-primary" style="margin-top: 5px">Destination</label>
                    </div>
                    <div class="col-md-9"><input type="text" name="destination" placeholder="destination" class="form-control" style="margin-bottom: 8px"/></div>
                    <div class="col-md-12 col-md-offset-6"><input type="submit" value="Search" class="btn btn-success"/></div>
                </div>
            </div>
            <br/>
        </form>
        <!--
            <table border="0">
                <thead>
                    <tr>
                        <th colspan="2">Travel Details</th>

                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Source: </td>
                        <td><input type="text" name="source" value="" /></td>
                    </tr>
                    <tr>
                        <td>Destination</td>
                        <td><input type="text" name="destination" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="middle"><input type="submit" value="Search" /></td>
                    </tr>
                </tbody>
            </table>

        </form>-->
        <% }%>
    </body>
</html>
