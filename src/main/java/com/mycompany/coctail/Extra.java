package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Extra extends Ingredient{
    
    public Extra(){}
    public Extra(String name, double noOfCalories, double volume, OurColor color){
        super(name, noOfCalories, volume, color);
    }
    
    @Override
    public String getType(){
        return "Extra";
    }
}
