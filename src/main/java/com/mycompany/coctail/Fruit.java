package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Fruit extends Ingredient{
    
    
    public Fruit(){}
    public Fruit(String name, double noOfCalories, double volume, OurColor color){
        super(name, noOfCalories, volume, color);
    }
    
    @Override
    public String getType(){
        return "Fruit";
    }
    
}
