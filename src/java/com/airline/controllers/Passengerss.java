/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.models.Passengers;
import com.airline.service.PassengerService;
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

public class Passengerss extends HttpServlet {

 @EJB
    PassengerService ps;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Passengers> plist = (List<Passengers>) ps.getPassengers();

        request.setAttribute("passengers_list", plist);

    
       // PrintWriter out = response.getWriter();
        
        //out.println("list will be displayed");
           
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/passengers_list.jsp");
       view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
  
}
