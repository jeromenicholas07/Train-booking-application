package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HeaderPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Header Page</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/material-kit.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!--\n");
      out.write("        <table border=\"0\" width=\"100%\" align=\"centre\" style=\"font-family: Century Gothic;padding: 0\" >\n");
      out.write("            <tr>\n");
      out.write("                <td rowspan=\"2\" width=\"10%\" align=\"left\"><img height=\"75\" src=\"Images/Indian_Railways_Suburban_Railway_Logo.svg.png\" alt=\"Logo.png\" ></td>\n");
      out.write("                <td rowspan=\"2\" align=\"left\" valign=\"centre\" width=\"45%\"><font style=\"font-family: Century gothic; font-size: x-large;text-align: left\" >Indian<br/>Railway</font></td>\n");
      out.write("                <th valign=\"bottom\" align=\"right\" width=\"20%\"><a href=\"DescriptionPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\">Home</a></th>\n");
      out.write("                <th valign=\"bottom\" align=\"centre\" width=\"10%\"><a href=\"RegisterationPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\">Register</a></th>\n");
      out.write("                <th valign=\"bottom\" align=\"left\" ><a href=\"LoginPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\"> Login</a></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th valign=\"top\" align=\"right\"><a href=\"SearchTrainPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\">Search</a></th>\n");
      out.write("                <th valign=\"top\"><a href=\"TicketHistoryPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\">History</a></th>\n");
      out.write("                <th valign=\"top\" align=\"left\"><a href=\"DescriptionPage.jsp\" target=\"middle\" style=\"color: floralwhite; text-decoration: none\">Contact us</a></th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\" align=\"right\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <div class=\"logo-container\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <img src=\"Images/Indian_Railways_Suburban_Railway_Logo.svg.png\" alt=\"Logo.png\" height=\"55\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\" align=\"right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"\" style=\"font-size: large\">Indian Railway</a></li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"active\"><a href=\"DescriptionPage.jsp\" target=\"middle\">Home</a></li>\n");
      out.write("                        <li><a href=\"RegisterationPage.jsp\" target=\"middle\">Register</a></li>\n");
      out.write("                        <li><a href=\"LoginPage.jsp\" target=\"middle\">Login</a></li>\n");
      out.write("                        <li><a href=\"SearchTrainPage.jsp\" target=\"middle\">Search</a></li>\n");
      out.write("                        <li><a href=\"TicketHistoryPage.jsp\" target=\"middle\">History</a></li>\n");
      out.write("                        <li><a href=\"ContactUs.jsp\" target=\"middle\">Contact us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
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
