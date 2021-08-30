package com.airline.controllers;

import com.airline.models.Airplane;
import com.airline.models.Flight;
import com.airline.models.FlightDestinations;
import com.airline.service.FlightService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhamed S. NasR
 */
public class AddFlight extends HttpServlet {

    @EJB
    FlightService fs;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Flight f = new Flight();

        String flight_from = request.getParameter("flight_from");
        String flight_to = request.getParameter("flight_to");

        f.setFlightOrigin(FlightDestinations.valueOf(flight_from));
        f.setFlightDestination(FlightDestinations.valueOf(flight_to));

        Calendar cal = Calendar.getInstance();

        int year = Integer.parseInt(request.getParameter("flight_year"));
        Integer month = Integer.parseInt(request.getParameter("flight_month"));
        int day = Integer.parseInt(request.getParameter("flight_day"));
        int hour = Integer.parseInt(request.getParameter("flight_hour"));
        //int minute = Integer.parseInt(request.getParameter("flight_minute"));

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        //cal.set(Calendar.MINUTE, 0);

        Date flightTime = cal.getTime();

        System.out.println(flightTime);

        f.setFlightTime(flightTime);
        
         int price = Integer.parseInt(request.getParameter("flight_price"));
        
        f.setPrice(price);

        Airplane a = new Airplane();
        
        String model=request.getParameter("airplane_model");
        String make=request.getParameter("airplane_make");
        int seating=Integer.parseInt(request.getParameter("airplane_seating"));
        

        a.setModelName(model);
        a.setPlaneMake(make);
        a.setSeatingCapacity(seating);


        f.setAirplaneDetail(a);

        System.out.println(a);
        System.out.println(f);

        fs.addFlight(f, a);
        
        
        response.sendRedirect("Flights");



    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
