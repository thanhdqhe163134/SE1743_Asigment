/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Bike;

/**
 *
 * @author faced
 */
public class BikeDAO {

    public static List<String> getCategories() {
        // Retrieve bike categories from the database
        // Perform SQL query
        // Return list of categories
    }
    
    public static List<Bike> searchBikesByCategory(String category) {
        // Retrieve bikes based on category from the database
        // Perform SQL query
        // Return list of Bike objects
    }
    
    public static Bike getBikeById(int id) {
        // Retrieve bike details from the database based on ID
        // Perform SQL query
        // Return Bike object
    }
    
}
