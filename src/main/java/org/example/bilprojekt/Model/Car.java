package org.example.bilprojekt.Model;

public class Car {
    String brand;
    int modelYear;
    String type;
    String colour;
    String licensePlate;
    String image;
    int id;

    public Car(String brand, int modelYear, String type, String colour, String licensePlate, String image, int id) {
        this.brand = brand;
        this.modelYear = modelYear;
        this.type = type;
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.image = image;
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }
}
