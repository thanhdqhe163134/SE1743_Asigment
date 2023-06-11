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
import java.util.List;
import model.Bike;

/**
 *
 * @author faced
 */
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve search results from the database using BikeDao and category parameter
        String category = request.getParameter("category");
        List<Bike> bikes = BikeDao.searchBikesByCategory(category);
        
        // Pass data to the search.html template
        request.setAttribute("bikes", bikes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("search.html");
        dispatcher.forward(request, response);
    }
}