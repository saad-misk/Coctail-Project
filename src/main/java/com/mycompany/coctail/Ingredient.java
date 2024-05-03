package com.mycompany.coctail;

/**
 *
 * @author user
 */

public abstract class Ingredient {
    
    private String name;
    private double noOfCalories;
    private double volume;
    private Color color;
    
    public Ingredient(){}
    public Ingredient(String name, double noOfCalories, double volume, Color color){
        this.name = name;
        this.noOfCalories = noOfCalories;
        this.volume = volume;
        this.color = color;
    }
    

    public String getName() {
        return name;
    }

    public double getNoOfCalories() {
        return noOfCalories;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfCalories(double noOfCalories) {
        this.noOfCalories = noOfCalories;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public String getInfo(){
        return "Name: " + this.name + ", Number Of Calories: " + this.noOfCalories + ", Volume: "
                + this.volume + ", Color = " + this.color.getInfo();
    }
    
}
