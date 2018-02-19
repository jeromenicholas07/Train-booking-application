package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/material-kit.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("        <script async=\"\" src=\"//www.google-analytics.com/analytics.js\"></script>\n");
      out.write("        <script src=\"https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <br/>\n");
      out.write("        <style>\n");
      out.write("            .headtexts{\n");
      out.write("                font-family: century gothic;\n");
      out.write("                font-size: large;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <form action=\"reg\" method=\"POST\">  \n");
      out.write("        <table border=\"0\" align=\"middle\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\" class=\"text-center\" style=\"color: #990099;font-family: Century Gothic;font-size: x-large;\">Registration Details</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">First Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"fn\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">Last Name</th>\n");
      out.write("                    <td><input type=\"text\" name=\"ln\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">Date of birth</th>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">Email ID</th>\n");
      out.write("                    <td><input type=\"email\" name=\"email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">Gender </th>\n");
      out.write("                    <td><input type=\"radio\" name=\"gender\" value=\"Male\" />Male<input type=\"radio\" name=\"gender\" value=\"Female\" />Female</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th class=\"headtexts\">Password</th>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"middle\"><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                    <td align=\"middle\"><input type=\"reset\" value=\"Reset\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
