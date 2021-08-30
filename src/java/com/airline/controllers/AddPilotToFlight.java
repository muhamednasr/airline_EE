/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.service.FlightService;
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
public class AddPilotToFlight extends HttpServlet {

    
    @EJB
    FlightService fs;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pid=request.getParameter("pid");
        String fid=request.getParameter("fid");
        
        fs.addPilotToFlight(pid, fid);
        
        
        
       
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
