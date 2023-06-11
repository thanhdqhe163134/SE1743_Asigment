/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Bike;

/**
 *
 * @author faced
 */
public class BikeDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve bike details from the database using BikeDao and id parameter
        int bikeId = Integer.parseInt(request.getParameter("id"));
        Bike bike = BikeDao.getBikeById(bikeId);
        
        // Pass data to the bike_details.html template
        request.setAttribute("bike", bike);
        RequestDispatcher dispatcher = request.getRequestDispatcher("bike_details.html");
        dispatcher.forward(request, response);
    }
}