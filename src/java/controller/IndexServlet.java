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
import model.Bike;
import dao.BikeDAO;

/**
 *
 * @author faced
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy danh sách các loại xe từ cơ sở dữ liệu
        List<Bike> bikeList = BikeDao.getAllBikes();

        // Gửi danh sách xe lên trang index.html để hiển thị
        request.setAttribute("bikeList", bikeList);
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
