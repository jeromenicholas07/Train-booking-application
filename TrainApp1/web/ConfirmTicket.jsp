<%@page import="java.io.IOException"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : PrintTicket
    Created on : Jul 28, 2016, 10:56:20 PM
    Author     : admin
--%>

<%@page import="java.util.UUID"%>
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm ticket page</title>
    </head>
    <body>
        <% 
            String uname = (String) session.getAttribute("user");
            int tid = Integer.parseInt(session.getAttribute("tid").toString());
            String n=request.getParameter("noOfPassengers");
            int num = Integer.parseInt(n);
            
        try{    
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB","root","root");
        
            Statement st = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery("select * from ROOT.TRAINS where TRAIN_ID='"+tid+"'");
            int seats=rs.getInt("SEATS");
            
            if(num<=seats){
                PreparedStatement ps = con.prepareStatement("insert into ROOT.bookedseats values(?,?,?,?)");
                ps.setInt(1, 1);
                ps.setInt(2, tid);
                ps.setInt(3, num);
                ps.setString(4, uname);
                ps.executeUpdate();
                
                try{
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB","root","root");
                    PreparedStatement prep = conn.prepareStatement("UPDATE ROOT.TRAINS SET SEATS='"+(seats-1)+"' WHERE TRAIN_ID='"+tid+"'");
                    prep.setInt(1, (seats-1));
                    prep.executeUpdate();

                    out.print("Ticket confirmed for "+num+" passengers");
                    conn.close();
                }
                catch(Exception ex){
                        out.print("here");
                        out.print(ex);
                }
            }
            else{
                out.print("Seats not available");
            }
            con.close();
            
        }
        catch(Exception ex){
            out.print("exception found "+ex);
        }
            //rs = st.executeQuery("select * from ROOT.TRAINS where TRAIN_ID='"+tid+"'");
            
            
            
        %>
    </body>
</html>
