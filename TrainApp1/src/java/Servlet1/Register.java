package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
import javax.swing.JOptionPane;

public class Register extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.print("<!-- Latest compiled and minified CSS -->\n"
                + "        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                + "\n"
                + "        <!-- jQuery library -->\n"
                + "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                + "\n"
                + "        <!-- Latest compiled JavaScript -->\n"
                + "        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
//        out.print("haha");
        String fn = request.getParameter("fn");
        String ln = request.getParameter("ln");
        String date = request.getParameter("dob");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String pass = request.getParameter("password");
//        RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
//        rd.forward(request, response);
//        
//        
        try {
            //out.print("here");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB", "root", "root");
            PreparedStatement ps = con.prepareStatement("insert into root.members values (?,?,?,?,?,?)");
            ps.setString(1, fn);
            ps.setString(2, ln);
            ps.setString(3, date);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setString(6, pass);
            int i = ps.executeUpdate();
            //String[] split=date.split("/");
            //ps.setDate(3, new Date(Integer.parseInt(split[2]),Integer.parseInt(split[0]),Integer.parseInt(split[1])));

            //Statement st = con.createStatement();
            //int i = st.executeUpdate("insert into members(first_name, last_name, date, email, gender, pass) values ('" + fn + "','" + ln + "','" + date + "','" + email + "','" +  gender + "','"+ pass+"')");
            //out.print("here");
            if (i > 0) {
                //out.print("<label class='h2'>Registration Succesfull!!</label>");
                
                HttpSession session = request.getSession();
                session.setAttribute("email", null);
                
                //out.println("<html><body onload=\"alert('Registration Successful!!')\"></body></html>");
                RequestDispatcher rd = request.getRequestDispatcher("RedirectPage.jsp");
                rd.forward(request, response);
            } else {
                out.print("<label class='h2'>Not Sucessful bro...</label>");
            }
            ps.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.print("<br/><a class='h2' href='LoginPage.jsp' target='middle'>Not Sucessful....sad...wanna Login now.</a>");
            
        }
        
    }
    
}
