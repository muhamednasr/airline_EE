package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fpassenger_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>World Adventures Airlines</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"title\"> Add a Passenger </div>\n");
      out.write("\n");
      out.write("            ");


                if (request.getAttribute("errors") != null) {

            
      out.write("\n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("\n");
      out.write("                <legend> Errors   </legend>\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("\n");
      out.write("                    ");


                        if (request.getAttribute("firstname_error") != null) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"error\"> first name Error </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
    }
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        if (request.getAttribute("lastname_error") != null) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"error\"> last name Error </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
    }
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                        if (request.getAttribute("date_format_error") != null) {

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <li class=\"error\"> date format Error </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
    }
      out.write(" \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("            ");

                }

            
      out.write("\n");
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("\n");
      out.write("                <legend>Passenger Details</legend>\n");
      out.write("\n");
      out.write("                <form action=\"AddPassenger\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        First Name: <input type=\"text\" name=\"first-name\" value=\"");
      out.print( request.getAttribute("first_name"));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        Last Name: <input type=\"text\" name=\"last-name\" value=\"");
      out.print( request.getAttribute("last_name"));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        DOB: <input type=\"text\" name=\"dob\" value=\"");
      out.print( request.getAttribute("dob"));
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        Gender: <select name=\"gender\" >\n");
      out.write("\n");
      out.write("                            <option value=\"male\">male</option>\n");
      out.write("                            <option value=\"female\">female</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"add passenger\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
