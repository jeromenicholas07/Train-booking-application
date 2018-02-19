package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin: 0 ;padding:0;background-color: white\">\n");
      out.write("        <script>\n");
      out.write("            function iframeLoaded(iframe) {\n");
      out.write("                iframe.height = iframe.contentWindow.document.documentElement.offsetHeight + \"px\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            iframe {\n");
      out.write("\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                border: 0;\n");
      out.write("                line-height: 0;\n");
      out.write("                float: left;\n");
      out.write("                display: block;\n");
      out.write("                border-bottom-width: 0;\n");
      out.write("            }\n");
      out.write("            .left\n");
      out.write("            {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("\n");
      out.write("                float: left;\n");
      out.write("                font-family: Courier New;\n");
      out.write("                display: block;\n");
      out.write("                border-style: solid;\n");
      out.write("                border-spacing: 0;\n");
      out.write("                border-right: thick groove #003333;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .header\n");
      out.write("            {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("\n");
      out.write("                float: left;\n");
      out.write("                font-family: Courier New;\n");
      out.write("                background-color: white;\n");
      out.write("                    \n");
      out.write("                display: block;\n");
      out.write("                //border-style: solid;\n");
      out.write("                //border-bottom: thick groove #003333;\n");
      out.write("            }\n");
      out.write("            .right{\n");
      out.write("\n");
      out.write("                margin-left: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                width: available;\n");
      out.write("\n");
      out.write("                display: block;\n");
      out.write("                font-family: Courier New;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .foot{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                display: block;\n");
      out.write("                float: bottom;\n");
      out.write("                clear: both;\n");
      out.write("                font-family: Courier New;\n");
      out.write("\n");
      out.write("                border-style: solid;\n");
      out.write("                border-top: thick groove #003333;\n");
      out.write("            }\n");
      out.write("            .font1{\n");
      out.write("                font-family: Century Gothic;\n");
      out.write("                color: darkcyan;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <iframe class=\"header\" frameborder=\"0\" id=\"header\" align=\"top\" name=\"top\" src=\"HeaderPage.jsp\" width=\"100%\" onload=\"this.height = this.contentWindow.document.documentElement.offsetHeight;\" seamless></iframe>\n");
      out.write("        <!--<iframe class=\"left\" frameborder=\"0\" id=\"left\" align=\"left\" name=\"left\" src=\"LeftPane.jsp\" width=\"20%\" seamless></iframe>-->\n");
      out.write("        <iframe class=\"right\" frameborder=\"0\" onload=\"iframeLoaded(this)\" id=\"middle\" align=\"centre\" name=\"middle\" src=\"DescriptionPage.jsp\" width=\"100%\" seamless></iframe>\n");
      out.write("        <iframe class=\"foot\" frameborder=\"0\" id=\"foot\" align=\"bottom\" name=\"foot\" src=\"Footer.jsp\" width=\"100%\" height=\"70\" seamless></iframe>\n");
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
