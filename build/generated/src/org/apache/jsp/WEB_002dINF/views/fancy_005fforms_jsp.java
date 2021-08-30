package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fancy_005fforms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"Stylesheet\" href=\"resources/styles.css\"/>\n");
      out.write("        <title> World Adventures Airlines  </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add A Passenger </h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"title\">  </div>\n");
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
      out.write("                            <option value=\"Male\">male</option>\n");
      out.write("                            <option value=\"Female\">female</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"add passenger\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                     \n");
      out.write("                      <hr  />\n");
      out.write("                    \n");
      out.write("                        <form action=\"Passengerss\">\n");
      out.write("                            <input type=\"submit\" value=\"Existing Passengers\" />\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write(" <fieldset>\n");
      out.write("            <form method=\"POST\" action=\"AddFlight\">\n");
      out.write("               \n");
      out.write("                    <legend>Flight/Plane Details</legend>\n");
      out.write("\n");
      out.write("                    <h1> Add a Flight and a Plane  </h1>\n");
      out.write("\n");
      out.write("                    From :<select name=\"flight_from\">\n");
      out.write("                        <option value=\"San_Francisco\">San Francisco</option>\n");
      out.write("                        <option value=\"Los_Angles\">Los Angles</option>\n");
      out.write("                        <option value=\"New_York\">New York</option>\n");
      out.write("                        <option>London</option>\n");
      out.write("                        <option>Rome</option>\n");
      out.write("                        <option>Cairo</option>\n");
      out.write("                        <option value=\"Amesterdam\">Amsterdam</option>\n");
      out.write("                        <option>Dortmund</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    TO :<select name=\"flight_to\">\n");
      out.write("                        <option value=\"San_Francisco\">San Francisco</option>\n");
      out.write("                        <option value=\"Los_Angles\">Los Angles</option>\n");
      out.write("                        <option value=\"New_York\">New York</option>\n");
      out.write("                        <option>London</option>\n");
      out.write("                        <option>Rome</option>\n");
      out.write("                        <option>Cairo</option>\n");
      out.write("                        <option value=\"Amesterdam\">Amsterdam</option>\n");
      out.write("                        <option>Dortmund</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <br  /><br  />\n");
      out.write("\n");
      out.write("                    <b>Time of The Flight</b>\n");
      out.write("\n");
      out.write("                    <hr  />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <br  />\n");
      out.write("\n");
      out.write("                    year :<select name=\"flight_year\">\n");
      out.write("                        <option>2018</option>\n");
      out.write("                        <option>2019</option>\n");
      out.write("                        <option>2020</option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    Month :<select name=\"flight_month\">\n");
      out.write("                        <option value=\"0\">Jan </option>\n");
      out.write("                        <option value=\"1\">Feb </option>\n");
      out.write("                        <option value=\"2\">Mar </option>\n");
      out.write("                        <option value=\"3\"> Apr</option>\n");
      out.write("                        <option value=\"4\">May </option>\n");
      out.write("                        <option value=\"5\"> Jun</option>\n");
      out.write("                        <option value=\"6\">Jul </option>\n");
      out.write("                        <option value=\"7\">Aug </option>\n");
      out.write("                        <option value=\"8\">Sep </option>\n");
      out.write("                        <option value=\"9\">Oct </option>\n");
      out.write("                        <option value=\"10\"> Nov</option>\n");
      out.write("                        <option value=\"11\"> Dec </option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    Day :<input type=\"text\" name=\"flight_day\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Hour :<input type=\"text\" name=\"flight_hour\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Minute :<input type=\"text\" name=\"flight_minute\" value=\"\" />\n");
      out.write("\n");
      out.write("                    <br  />  <br  />\n");
      out.write("                    <hr  />\n");
      out.write("                    Price :<input type=\"text\" name=\"flight_price\" value=\"\" />\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <b>AirPlane </b>\n");
      out.write("\n");
      out.write("                    <hr  />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    AirPlane Make :<input type=\"text\" name=\"airplane_make\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    AirPlane Model :<input type=\"text\" name=\"airplane_model\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Seating:<input type=\"text\" name=\"airplane_seating\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <hr />\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"Add\" />\n");
      out.write("                    </div>\n");
      out.write("                               </form>\n");
      out.write("     \n");
      out.write("      <hr  />\n");
      out.write("                    \n");
      out.write("                        <form action=\"Flights\">\n");
      out.write("                            <input type=\"submit\" value=\"Existing Flights\" />\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write(" <fieldset>\n");
      out.write("            <form method=\"POST\" action=\"CreatePilotAndAddToFlight\">\n");
      out.write("               \n");
      out.write("                    <legend>Details</legend>\n");
      out.write("\n");
      out.write("                    <h1> Add Pilot to Flight  </h1>\n");
      out.write("\n");
      out.write("                    First Name :<input type=\"text\" name=\"pilot_first_name\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Last Name :<input type=\"text\" name=\"pilot_last_name\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    License :<input type=\"text\" name=\"pilot_license\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Flight ID :<input type=\"text\" name=\"pilot_id\" value=\"\" />\n");
      out.write("                    <br>\n");
      out.write("                    Pilot Rank :<select name=\"pilot_rank\">\n");
      out.write("                        <option>Captain</option>\n");
      out.write("                        <option value=\"First_Officer\">First Officer</option>\n");
      out.write("                        <option value=\"Junior_Officer\">Junior Officer</option>\n");
      out.write("                    \n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"add Pilot to Flight\" />\n");
      out.write("                    </div>\n");
      out.write("                 </form>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"AddPassengerToFlight\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Details</legend>\n");
      out.write("\n");
      out.write("                    <h1> Add Passenger to Flight  </h1>\n");
      out.write("\n");
      out.write("                    Passenger ID :<input type=\"text\" name=\"passenger_id\" value=\"\" />\n");
      out.write("\n");
      out.write("                    To the Flight of ID :<input type=\"text\" name=\"flight_of_id\" value=\"\" />\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"add passenger to Flight\" />\n");
      out.write("                    </div>\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"AddFlightTicketToPassenger\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Details</legend>\n");
      out.write("\n");
      out.write("                    <h1> Add Flight To Passenger</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    Flight ID :<input type=\"text\" name=\"flight_id\" value=\"\" />\n");
      out.write("\n");
      out.write("                    The Passenger of ID :<input type=\"text\" name=\"passenger_of_id\" value=\"\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"inputfield\">\n");
      out.write("                        <input type=\"submit\" value=\"add Ticket to Passenger \" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("                 \n");
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
