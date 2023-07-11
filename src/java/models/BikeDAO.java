package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBUtil;

public class BikeDAO {
    private Connection connection;

    public BikeDAO() {
        connection = DBUtil.getConnection();
    }

    public List<Bike> getBikesByType(String type) {
        List<Bike> bikeList = new ArrayList<>();
        String query = "SELECT * FROM Bike WHERE Type = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, type);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String Name = resultSet.getString("Name");
                String Type = resultSet.getString("Type");
                String Engine = resultSet.getString("Engine");
                String Technique = resultSet.getString("Technique");
                String Description = resultSet.getString("Description");
                String IMG = resultSet.getString("IMG");
                Double Price = resultSet.getDouble("Price");

                Bike bike = new Bike(ID, Name, Type, Engine, Technique, Description, IMG, Price);
                bikeList.add(bike);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bikeList;
    }

    public List<Bike> getAllBikes() {
        List<Bike> bikeList = new ArrayList<>();
        String query = "SELECT * FROM Bike";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String Name = resultSet.getString("Name");
                String Type = resultSet.getString("Type");
                String Engine = resultSet.getString("Engine");
                String Technique = resultSet.getString("Technique");
                String Description = resultSet.getString("Description");
                String IMG = resultSet.getString("IMG");
                Double Price = resultSet.getDouble("Price");

                Bike bike = new Bike(ID, Name, Type, Engine, Technique, Description, IMG, Price);
                bikeList.add(bike);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bikeList;
    }
}
