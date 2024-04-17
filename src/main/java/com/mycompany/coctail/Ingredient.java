package com.mycompany.coctail;

/**
 *
 * @author user
 */

public class Ingredient {
    
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
    
    public String getInfo(){
        return "hello";
    }
    
}
