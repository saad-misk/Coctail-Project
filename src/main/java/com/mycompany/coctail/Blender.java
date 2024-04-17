package com.mycompany.coctail;

import java.util.ArrayList;

/**
 *
 * @author user
 */

public class Blender extends Container {
    
    private ArrayList<Ingredient> ingredients;
    private double caloriesPerVolume;
    
    public Blender(){}
    public Blender(double capacity, double volume, double noOfCalories, Color color){
        super( capacity, volume, noOfCalories, color);
    }
    
    public void blend(){
        Color c = new Color();
        
        //this.setColor(c);
    }
    
    public void add(Ingredient x){
        
    }
    
    public void pour(){
        
    }
    
}
