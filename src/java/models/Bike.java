/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author faced
 */
public class Bike {
    public int ID;
    public String Name;
    public String Type;
    public String Engine;
    public String Technique;
    public String Description;
    public String IMG;
    public Double Price;

    public Bike() {
    }

    public Bike(int ID, String Name, String Type, String Engine, String Technique,String Description, String IMG, Double Price) {
        this.ID = ID;
        this.Name = Name;
        this.Type = Type;
        this.Engine = Engine;
        this.Technique = Technique;
        this.Description = Description;
        this.IMG = IMG;
        this.Price = Price;
    }

    Bike(String Name, String Type, String Engine, String Technique, String Description , String pictures, Double Price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters và setters cho các thuộc tính

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public String getTechnique() {
        return Technique;
    }

    public void setTechnique(String Technique) {
        this.Technique = Technique;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String pictures) {
        this.IMG = pictures;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
    
    

    
}
