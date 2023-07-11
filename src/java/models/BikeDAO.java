/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.lang.ProcessBuilder.Redirect.Type;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

/**
 *
 * @author faced
 */
public class BikeDAO {
    private Connection connection;

    public BikeDAO() {
        // Thiết lập kết nối với cơ sở dữ liệu
        connection = DBUtil.getConnection();
    }

    // Phương thức để lấy danh sách xe từ cơ sở dữ liệu
    public List<Bike> getAllBike() {
        List<Bike> bigbikeList = new ArrayList<>();
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
                String Description = resultSet.getString("Decription");
                String IMG = resultSet.getString("IMG");
                Double Price = resultSet.getDouble("Price");
                

                Bike bike = new Bike(ID, Name, Type, Engine, Technique, Description, IMG, Price);
                bigbikeList.add(bike);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bigbikeList;
    }

   
    
    
}
