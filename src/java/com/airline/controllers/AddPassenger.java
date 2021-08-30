/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.models.Gender;
import com.airline.models.Passenger;
import com.airline.models.Passengers;
import com.airline.service.PassengerService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhamed S. NasR
 */
public class AddPassenger extends HttpServlet {

    @EJB
    PassengerService ps;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        request.setAttribute("first_name", "");
        request.setAttribute("last_name", "");
        request.setAttribute("dob", "");

        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_passenger.jsp");

        view.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("errors", false);


        Passengers p = new Passengers();





        String fname = request.getParameter("first-name");

        if (fname.length() < 1) {

            System.out.println("firstname Error");

            request.setAttribute("errors", true);
            request.setAttribute("firstname_error", true);

            request.setAttribute("first_name", "");




        } else {

            System.out.println("firstname ok");
            p.setFirstName(fname);
            request.setAttribute("first_name", fname);



        }


        String lname = request.getParameter("last-name");


        if (lname.length() == 0) {

            System.out.println("lastname_Error");

            request.setAttribute("errors", true);
            request.setAttribute("lastname_error", true);
            request.setAttribute("last_name", "");


        } else {

            p.setLastName(lname);
            request.setAttribute("last_name", lname);


        }


        String dob = request.getParameter("dob");
        String dobArray[] = dob.split("\\/");


        //pattern and matching pattern that's new ...

        String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(dob);

        if (m.find()) {

            String month = dobArray[0];
            String day = dobArray[1];
            String year = dobArray[2];

            Calendar cal = Calendar.getInstance();

            cal.set(Calendar.YEAR, Integer.parseInt(year));
            cal.set(Calendar.MONTH, Integer.parseInt(month));
            cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));

            Date Dob = cal.getTime();

            System.out.println(Dob);

            p.setDob(Dob);

            request.setAttribute("dob", dob);

        } else {

            System.out.println("invalid date of birth");

            request.setAttribute("errors", true);
            request.setAttribute("date_format_error", true);
            request.setAttribute("dob", "");


        }

        String gender = request.getParameter("gender");
        p.setGender(Gender.valueOf(gender));

        if ((Boolean) request.getAttribute("errors")) {

            RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/fancy_forms.jsp");
            view.forward(request, response);

        } else {

            ServletContext sc = this.getServletContext();



            // Threading something .........  XDXD
            synchronized (this) {
                // ArrayList<Passengers> plist = (ArrayList<Passengers>) sc.getAttribute("passengers");

                // plist.add(p);

                //sc.setAttribute("passengers", plist);


                ps.addPassenger(p);




            }
            response.sendRedirect("Passengerss");

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";


    }
}
