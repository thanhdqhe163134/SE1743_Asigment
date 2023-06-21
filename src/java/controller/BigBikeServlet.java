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
import models.BigBike;
import models.BigBikeDAO;


/**
 *
 * @author faced
 */
@WebServlet(name = "BigBikeServlet", urlPatterns = {"/bigbikes"})
public class BigBikeServlet extends HttpServlet {
    private BigBikeDAO bigBikeDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        bigBikeDAO = new BigBikeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BigBike> bigBikeList = bigBikeDAO.getAllBigBike();
        request.setAttribute("bigBikes", bigBikeList);
        request.getRequestDispatcher("bigbike-list.jsp").forward(request, response);
    }

    // Các phương thức khác theo yêu cầu của ứng dụng
}