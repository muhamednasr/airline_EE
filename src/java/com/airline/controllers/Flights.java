/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.models.Flight;
import com.airline.service.FlightService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhamed S. NasR
 */
public class Flights extends HttpServlet {

    @EJB
    FlightService fs;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Flight> flist = (List<Flight>) fs.getFlightP();

        request.setAttribute("flight_list", flist);

        
        /*PrintWriter out = response.getWriter();
        out.println("list of flight wil be displayed here  ");
        * */
        
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/flight_list.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
