/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faced
 */
public class BigBikeDAO {
    private Connection connection;

    public BigBikeDAO() {
        // Thiết lập kết nối với cơ sở dữ liệu
        connection = DBUtil.getConnection();
    }

    // Phương thức để lấy danh sách xe từ cơ sở dữ liệu
    public List<BigBike> getAllBigBike() {
        List<BigBike> bigbikeList = new ArrayList<>();
        String query = "SELECT * FROM BigBike";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                String name = resultSet.getString("name");                
                String decription = resultSet.getString("decription");
                double price = resultSet.getDouble("price");
                String pictures = resultSet.getString("pictures");

                BigBike bike = new BigBike(id, brand, name, decription, price, pictures);
                bigbikeList.add(bike);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bigbikeList;
    }

    // Phương thức để lấy thông tin chi tiết xe dựa trên id
    public BigBike getByBrand(String brand) {
        String query = "SELECT * FROM BigBike WHERE brand = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, brand);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String decription = resultSet.getString("decription");
                double price = resultSet.getDouble("price");
                String pictures = resultSet.getString("pictures");

                BigBike bike = new BigBike( brand, name, decription, price, pictures);
                resultSet.close();
                preparedStatement.close();
                return bike;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
