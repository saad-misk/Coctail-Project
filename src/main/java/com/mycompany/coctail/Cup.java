package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Cup extends Container {
    
    public static int cups = 0;
    
    public Cup(){}
    public Cup(double capacity, double volume, double noOfCalories){
        super( capacity, volume, noOfCalories);
    }
    
}
