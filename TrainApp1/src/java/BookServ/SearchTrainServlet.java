package BookServ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchTrainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String src = request.getParameter("source");
        String dest = request.getParameter("destination");
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB", "root", "root");
            
            Statement st = con.createStatement();
            ResultSet rs;
            
            out.print("<style>td{padding:5px;}</style>");
            
            rs = st.executeQuery("select * from ROOT.TRAINS where source='" + src + "' and destination='" + dest + "'");
            out.print("<head><!-- Latest compiled and minified CSS -->\n"
                    + "        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                    + "\n"
                    + "        <!-- jQuery library -->\n"
                    + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                    + "\n"
                    + "        <!-- Latest compiled JavaScript -->\n"
                    + "        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script></head>");
            out.print("<form action=\"PreBook\" method=\"POST\"><br/>");
            out.print("<div class='col-md-10 col-me-offset-1'>");
            out.print("<label class='h2'>Available Trains:</label>");
            out.print("<table class='table table-condensed' style='border-spacing: 3px;'>");
            out.print("<thead><tr><th style='padding:3px'>Select</th>"
                    + "<th style='padding:3px'>Train No.</th><th>Train Name</th>"
                    + "<th style='padding:3px'>Source</th><th>Departure Time</th>"
                    + "<th style='padding:3px'>Destination</th><th>Arrival Time</th>"
                    + "<th style='padding:3px'>Available seats</th><th>Travel Time</th>"
                    + "<th style='padding:3px'>Price</th></tr></thead><tbody>");
            
            while (rs.next()) {
                Long tid = rs.getLong("TRAIN_ID");
                
                HttpSession session = request.getSession();
                
                
                String tname = rs.getString("TRAIN_NAME");
                String source = rs.getString("SOURCE");
                Time dtime = rs.getTime("DEPARTURETIME");
                String destn = rs.getString("DESTINATION");
                Time atime = rs.getTime("ARRIVALTIME");
                String seats = rs.getString("SEATS");
                String dura = rs.getString("DURATION");
                int price = rs.getInt("price");
                
                out.print("<tr><td style='padding:3px'><input type=\"radio\" name=\"train\" value=\"" + tid + "~" + tname + "~" + source + "~" + dtime + "~" + destn + "~" + atime + "~" + dura + "~" + price + "\" id=\"myRadio\" checked=\"checked\"/></td>"
                        + "<td style='padding:3px'>" + tid + "</td>"
                        + "<td style='padding:3px'>" + tname + "</td>"
                        + "<td style='padding:3px'>" + source + "</td>"
                        + "<td style='padding:3px'>" + dtime + "</td>"
                        + "<td style='padding:3px'>" + destn + "</td>"
                        + "<td style='padding:3px'>" + atime + "</td>"
                        + "<td style='padding:3px'>" + seats + "</td>"
                        + "<td style='padding:3px'>" + dura + "</td>"
                        + "<td style='padding:3px'>" + price + "</td></tr>");
            }
            
            out.print("<tr><th align=\"middle\" colspan=\"10\"><input type=\"submit\" value=\"Book\" id=\"submitbutton\" class='btn btn-success'/></th></tr>");
            out.print("</tbody></div>");
            out.print("</table></form>");
            //out.print("<script>if(!(document.getElementById(\"myRadio\").value.equals(null))){document.getElementById(\"submitbutton\").disabled = false;}</script>");
            
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}
