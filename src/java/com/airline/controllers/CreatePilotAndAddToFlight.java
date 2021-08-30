/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.models.Pilot;
import com.airline.models.PilotRank;
import com.airline.service.PilotService;
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
public class CreatePilotAndAddToFlight extends HttpServlet {
    
    @EJB
    PilotService ps;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fname = request.getParameter("pilot_first_name");
        
        String lname = request.getParameter("pilot_last_name");
        
        int license = Integer.parseInt(request.getParameter("pilot_license"));
        
        String rank = request.getParameter("pilot_rank");
        
        
        int fid = Integer.parseInt(request.getParameter("pilot_id"));
        
        Pilot p = new Pilot();
        
        p.setFirstName(fname);
        p.setLastName(lname);
        p.setPilotRank(PilotRank.valueOf(rank));
        p.setPilotLicense(license);

        //ps.addNewPilotToFlight(p, fid);
        
        ps.addNewPilotToFlight(p, fid);
        
        response.sendRedirect("Flights");
        
        
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
