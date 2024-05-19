package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Drink extends Ingredient{
    
    public Drink(){}
    public Drink(String name, double noOfCalories, double volume, OurColor color){
        super(name, noOfCalories, volume, color);
    }
    
    @Override
    public String getType(){
        return "Drink";
    }
}
