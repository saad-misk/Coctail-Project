package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Container {
    
    private double capacity;
    private double volume;
    private double noOfCalories;
    private Color color;
    
    public Container(){}
    public Container(double capacity, double volume, double noOfCalories, Color color){
        this.capacity = capacity;
        this.volume = volume;
        this.noOfCalories = noOfCalories;
        this.color = color;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setNoOfCalories(double noOfCalories) {
        this.noOfCalories = noOfCalories;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double getNoOfCalories() {
        return noOfCalories;
    }

    public Color getColor() {
        return color;
    }
    
    
    public String getInfo(){
        return "Hello";
    }
    
}
