/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import com.airline.models.Passenger;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class AirlineListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {

        ServletContext sc = event.getServletContext();

        ArrayList<Passenger> plist = (ArrayList<Passenger>) sc.getAttribute("passengers");

        if (plist == null) {

            System.out.println("passengers list is null ");

            plist = new ArrayList<Passenger>();

            sc.setAttribute("passengers", plist);




        }


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
