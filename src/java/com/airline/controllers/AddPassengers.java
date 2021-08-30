package com.airline.controllers;

import com.airline.models.FlightClass;
import com.airline.models.Gender;
import com.airline.models.Passengers;
import com.airline.service.PassengerService;
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

public class AddPassengers extends HttpServlet {
    
    @EJB
    PassengerService ps;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         
        Passengers p = new Passengers();
        
        String fname = request.getParameter("first-name");
        String lname = request.getParameter("last-name");
        String dob_raw = request.getParameter("dob");
        String gender = request.getParameter("gender");
        
        
        p.setFirstName(fname);
        p.setLastName(lname);
        
         String[] dobarr = dob_raw.split("\\/");
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(dobarr[2]));
        cal.set(Calendar.MONTH, Integer.parseInt(dobarr[0]));
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dobarr[1]));
        
       Date dob = cal.getTime();
        
        p.setDob(dob);
        
        p.setGender(Gender.valueOf(gender));
        
        System.out.println(p);
        
        ps.addPassenger(p);
        
        response.sendRedirect("Passengerss");
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
