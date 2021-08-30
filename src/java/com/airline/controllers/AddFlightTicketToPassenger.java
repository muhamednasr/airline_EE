/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.service.PassengerService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhamed S. NasR
 */
public class AddFlightTicketToPassenger extends HttpServlet {

    @EJB
    PassengerService ps;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        
        String pid=request.getParameter("passenger_of_id");
        String fid=request.getParameter("flight_id");
        
        
        ps.addFlightTicketToPassenger(pid, fid);
        
            response.sendRedirect("Passengerss");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
