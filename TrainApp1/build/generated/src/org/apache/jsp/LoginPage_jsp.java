package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html align=\"middle\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\"></script>\n");
      out.write("        <link rel=\"canonical\" href=\"http://www.creative-tim.com/product/material-kit\">\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\">-->\n");
      out.write("\n");
      out.write("        <!--     Fonts and icons     \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />-->\n");
      out.write("\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/material-kit.css\" rel=\"stylesheet\"/>\n");
      out.write("        \n");
      out.write("        <script async=\"\" src=\"//www.google-analytics.com/analytics.js\"></script>\n");
      out.write("        <script src=\"https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"middle\">\n");
      out.write("        <br/>\n");
      out.write("        <form method=\"post\" action=\"LoginServlet\">\n");
      out.write("            \n");
      out.write("        <label>Login details</label>\n");
      out.write("<br/>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"form-group label-floating is-empty\">\n");
      out.write("                <label class=\"control-label\">Username</label>\n");
      out.write("                <input name=\"email\" type=\"email\" class=\"form-control\">\n");
      out.write("                <span class=\"material-input\"></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"form-group label-floating is-empty\">\n");
      out.write("                <label class=\"control-label\">Password</label>\n");
      out.write("                <input name=\"password\" type=\"password\" class=\"form-control\">\n");
      out.write("                <span class=\"material-input\"></span>    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"form-group label-floating is-empty\">\n");
      out.write("                <label class=\"control-label\">With Floating Label</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\">\n");
      out.write("                <span class=\"material-input\"></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div align=\"centre\" class=\"g-recaptcha\"\n");
      out.write("             data-sitekey=\"6LflRycTAAAAAPnTLHBE-iT4EHvrJs1RX4h9VwGL\"></div>\n");
      out.write("               \n");
      out.write("        <input type=\"reset\" value=\"Reset\" /></td>\n");
      out.write("        <input type=\"submit\" value=\"Submit\"/>\n");
      out.write("\n");
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
