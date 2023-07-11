/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import models.Bike;
import models.BikeDAO;


/**
 *
 * @author faced
 */
@WebServlet(name = "BikeServlet", urlPatterns = {"/bikes"})
public class BigBikeServlet extends HttpServlet {
    private BikeDAO BikeDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        BikeDAO = new BikeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Bike> BikeList = BikeDAO.getAllBike();
        request.setAttribute("Bike", BikeList);
        request.getRequestDispatcher("bike-list.jsp").forward(request, response);
    }

    // Các phương thức khác theo yêu cầu của ứng dụng
}