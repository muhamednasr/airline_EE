/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muhamed S. NasR
 */
public class FancyForms extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("first_name", "");
        request.setAttribute("last_name", "");
        request.setAttribute("dob", "");
        
         RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/fancy_forms.jsp");

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
