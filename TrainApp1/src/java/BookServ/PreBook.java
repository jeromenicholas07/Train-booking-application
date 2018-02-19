
package BookServ;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class PreBook extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       out.print("<head><!-- Latest compiled and minified CSS -->\n"
                    + "        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                    + "\n"
                    + "        <!-- jQuery library -->\n"
                    + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                    + "\n"
                    + "        <!-- Latest compiled JavaScript -->\n"
                    + "        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script></head>");
       
       
       
       String str =request.getParameter("train");
       String split[] = str.split("~");
       Long tid= Long.parseLong(split[0]);
       String tname = split[1];
       String source = split[2];
       String dtime = split[3];
       String destn = split[4];
       String atime = split[5];
       String dura = split[6];
       int price = Integer.parseInt(split[7]);
       
       HttpSession session = request.getSession();
       session.setAttribute("tid", tid);
       
       
       out.print("<br/><div class='col-md-10'>");
       out.print("<table class='table table-condensed'>");
       out.print("<thead><tr><th>Train No.</th><th>Train Name</th><th>Source</th><th>Departure Time</th><th>Destination</th><th>Arrival Time</th><th>Travel Time</th><th>Price</th></tr></thead>");
       out.print("<tbody><tr><td>"+tid+"</td><td>"+tname+"</td><td>"+source+"</td><td>"+dtime+"</td><td>"+destn+"</td><td>"+atime+"</td><td>"+dura+"</td><td>"+price+"</td></tr></tbody>");
       out.print("</table></div>");
       
       out.print("<div class='col-md-4'>");
       out.print("<form action=\"ConfirmTicket\" method=\"POST\"><br/>"
               + "<div class='col-md-3'><label class='text'>Number of passengers </label></div>"
               + "<div class='col-md-3'><select name=\"noOfPassengers\" class='form-control'></div>\n" +
                "<option>1</option>\n" +
                "<option>2</option>\n" +
                "<option>3</option>\n" +
                "<option>4</option>\n" +
                "<option>5</option>\n" +
                "<option>6</option>\n" +
                "</select>");
       
       out.println("<br/><input type=\"submit\" value=\"Confirm Ticket\" class='btn btn-success'>");
       out.print("</form></div>");
    }
}
