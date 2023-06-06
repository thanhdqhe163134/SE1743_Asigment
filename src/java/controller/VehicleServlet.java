/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.VehicleDAO;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Vehicle;

/**
 *
 * @author faced
 */
@WebServlet("/vehicles")
public class VehicleServlet extends HttpServlet {
    private VehicleDAO vehicleDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        vehicleDAO = new VehicleDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Vehicle> vehicles = vehicleDAO.getAllVehicles();
        request.setAttribute("vehicles", vehicles);
        request.getRequestDispatcher("/WEB-INF/views/vehicle_list.jsp").forward(request, response);
    }
}

