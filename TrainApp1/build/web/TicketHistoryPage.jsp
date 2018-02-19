<%-- 
    Document   : TicketHistoryPage
    Created on : Jul 23, 2016, 2:45:00 PM
    Author     : DELL
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket History Page</title>

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
            window.location = "LoginPage.jsp";
        </script>

        <%
        } else {

            String user = (String) session.getAttribute("email");
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB", "root", "root");

                PreparedStatement pst = con.prepareStatement("select * from root.bookedseats where booker=?");
                pst.setString(1, user);
                ResultSet rs;

                rs = pst.executeQuery();
        %>
        <div class="col-md-8" style="margin: 15px;">
            <table class="table table-striped">
                <thead><tr><th>PNR No.</th><th>Train No.</th><th>Number of passengers</th></tr></thead><tbody>
                            <%
                                while (rs.next()) {
                                    int pnr = rs.getInt("pnr");
                                    int tid = rs.getInt("train_id");
                                    int num = rs.getInt("passengers");

                                    out.print("<tr><td>" + pnr + "</td><td>" + tid + "</td><td>" + num + "</td></tr>");

                }%>
                </tbody>
            </table></div>
            <%
                    } catch (Exception ex) {
                        out.print(ex);
                    }
                }
            %>

    </body>
</html>
