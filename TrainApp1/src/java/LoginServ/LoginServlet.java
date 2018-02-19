
package LoginServ;

import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.net.ssl.HttpsURLConnection;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String emailid = request.getParameter("email");
        String pass = request.getParameter("password");
        String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
        VerifyRecaptcha vr = new VerifyRecaptcha();
        boolean verify = vr.verify(gRecaptchaResponse);
        
//        if(emailid.equals("jero") && pass.equals("nick")){
//            HttpSession session = request.getSession();
//            session.setAttribute("email", emailid);
//            
//            RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
//            rd.forward(request, response);
//        }
        
        
        
        try {
            HttpSession session = request.getSession();
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DemoDB","root","root");
            
            
            Statement st = con.createStatement();
            ResultSet rs;
            
            rs=st.executeQuery("select * from members where email='"+emailid+"' and pass='"+pass+"'"); 
            
            
            if(rs.next() && verify){
                out.print("Login succesful for "+emailid);
                session.setAttribute("email", emailid);
                
            }
            else{
                out.println("<a href='LoginPage.jsp'> Try again.</a> ");
            }
        } catch (ClassNotFoundException|SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            
        }
    }
    
    public class VerifyRecaptcha{
        public static final String url = "https://www.google.com/recaptcha/api/siteverify";
	public static final String secret = "6LflRycTAAAAADYY-2DM9FiRhHuPpj1I59xxzTXY";
        
        private final static String USER_AGENT = "Mozilla/5.0";

        public boolean verify(String gRecaptchaResponse) throws IOException {
		if (gRecaptchaResponse == null || "".equals(gRecaptchaResponse)) {
			return false;
		}
		
		try{
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		// add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String postParams = "secret=" + secret + "&response="
				+ gRecaptchaResponse;

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(postParams);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + postParams);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
		
		//parse JSON response and return 'success' value
		JsonReader jsonReader = Json.createReader(new StringReader(response.toString()));
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();
		
		return jsonObject.getBoolean("success");
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
    }
}
