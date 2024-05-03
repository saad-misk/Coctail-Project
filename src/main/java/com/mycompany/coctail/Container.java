package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Container {
    
    private double capacity;
    private double volume;
    private double noOfCalories;
    
    public Container(){}
    public Container(double capacity, double volume, double noOfCalories){
        this.capacity = capacity;
        this.volume = volume;
        this.noOfCalories = noOfCalories;
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

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double getNoOfCalories() {
        return noOfCalories;
    }
    
    public String getInfo(){
        return "Capacity: " + this.capacity + ", Volume: " + this.volume + ", Number OF Calories: "
                + this.noOfCalories;
    }
    
}
