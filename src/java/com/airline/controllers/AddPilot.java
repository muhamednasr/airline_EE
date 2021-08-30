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
public class AddPilot extends HttpServlet {

 
    @EJB
    PilotService ps;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        Pilot p = new Pilot();
        
        
        p.setFirstName("marco");
        p.setLastName("reus");
        
        p.setPilotLicense(1909);
        p.setPilotRank(PilotRank.Captain);
        
        
        ps.addPilot(p);
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
