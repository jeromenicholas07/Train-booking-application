package BookServ;

import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/ConfirmTicket"})
public class ConfirmTicket extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.print("\n"
                + "        <!-- Latest compiled and minified CSS -->\n"
                + "        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                + "\n"
                + "        <!-- jQuery library -->\n"
                + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                + "\n"
                + "        <!-- Latest compiled JavaScript -->\n"
                + "        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
        
        HttpSession session = request.getSession();
        
        String uname = session.getAttribute("email").toString();
        int tid = Integer.parseInt(session.getAttribute("tid").toString());
        String n = request.getParameter("noOfPassengers");
        int num = Integer.parseInt(n);
        
        try {            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB", "root", "root");
            
            PreparedStatement pst = con.prepareStatement("select * from root.trains where train_id=?");
            pst.setInt(1, tid);
            ResultSet rs;
            rs = pst.executeQuery();
            rs.next();
            int seats = rs.getInt("seats");
            //out.print("num is "+num+" and seats is "+seats);
            if (num <= seats) {
                //PreparedStatement ps = con.prepareStatement("insert into root.bookedseats(TRAIN_ID, PASSENGERS, BOOKER) values(?,?,?)");
                PreparedStatement ps = con.prepareStatement("INSERT INTO ROOT.BOOKEDSEATS(TRAIN_ID, PASSENGERS, BOOKER) VALUES (?, ?, ?)");
                //int uid = Integer.parseInt(UUID.randomUUID().toString());
                //ps.setInt(1, uid);
                ps.setInt(1, tid);
                ps.setInt(2, num);
                ps.setString(3, uname);
                ps.executeUpdate();
                
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB", "root", "root");
                    PreparedStatement prep = conn.prepareStatement("UPDATE ROOT.TRAINS SET SEATS=? WHERE TRAIN_ID=?");
                    prep.setInt(1, (seats - num));
                    prep.setLong(2, tid);
                    int slowbro = prep.executeUpdate();
                    if (slowbro > 0) {
                        out.print("<label class='h2'>Ticket confirmed for " + num + " passengers</label>");
                        //out.print("PNR Number is "+uid);
                    } else {
                        out.print("<label class='h2'>Unable to book ticket... Please try again</label>");
                    }
                    
                    conn.close();
                } catch (Exception ex) {
                    out.print("here");
                    out.print(ex);
                }
            } else {
                out.print("<label class='h2'>Seats not available</label>");
            }
            con.close();
            //wait(1000);
            out.print("<br/>&emsp;<a href=\"WelcomePage.jsp\"><button class='btn btn-success'>Okay</button></a>");
            //RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
            //rd.forward(request, response);
        } catch (Exception ex) {
            out.print("exception found " + ex);
        }
            //rs = st.executeQuery("select * from ROOT.TRAINS where TRAIN_ID='"+tid+"'");
        
    }
    
}
