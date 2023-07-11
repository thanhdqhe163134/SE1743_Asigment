import models.Bike;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import models.BikeDAO;

public class BikeServlet extends HttpServlet {

    public BikeDAO bikeDAO;

    @Override
    public void init() {
        bikeDAO = new BikeDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        List<Bike> bikeList;

        if (type != null) {
            bikeList = bikeDAO.getBikesByType(type);
        } else {
            bikeList = bikeDAO.getAllBikes();
        }

        request.setAttribute("bikeList", bikeList);
        request.getRequestDispatcher("/Bike.jsp").forward(request, response);
    }
}
