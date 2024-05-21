package com.mycompany.coctail;

import java.util.ArrayList;

/**
 *
 * @author user
 */

public class Blender extends Container {
    
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private boolean blended;
    public Blender(){}
    public Blender(double capacity, double volume, double noOfCalories, boolean blended){
        super( capacity, volume, noOfCalories);
        this.blended = blended;
    }

    public void setBlended(boolean blended) {
        this.blended = blended;
    }

    public boolean isBlended() {
        return blended;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
    
    public void blend() throws EmptyBlenderException{
        
        if( this.getVolume() == 0 ){
            throw new EmptyBlenderException();
        }
        int totRed = 0, totGreen = 0, totBlue = 0;
        int a = 0, b = 0, c = 0;
        double volume = 0, calories = 0;
        for(Ingredient i : ingredients){
            volume += i.getVolume();
            calories += i.getNoOfCalories();
            double v = i.getVolume();
            totRed += i.getColor().getRed()*v;
            totGreen += i.getColor().getGreen()*v;
            totBlue += i.getColor().getBlue()*v;
            a += v;
            b += v;
            c += v;
        }
        OurColor col = new OurColor(totRed/a, totGreen/b, totBlue/c);
        Coctail coctail = new Coctail("coctail", calories, volume, col);
        
        ingredients.clear();
        ingredients.add(coctail);
    }
    
    public void add(Ingredient x) throws BlenderOverFlowException{
        
            if( x.getVolume() + this.getVolume() > this.getCapacity() ){
                throw new BlenderOverFlowException();
            }
            ingredients.add(x);
            this.setVolume(x.getVolume() + this.getVolume());
            this.setNoOfCalories(x.getNoOfCalories() + this.getNoOfCalories());
    }
    
    public void pour(Cup x) throws EmptyBlenderException, NotAbleToPourException{
        
        if( this.getVolume() == 0 ){
            throw new EmptyBlenderException();
        }
        if( !this.isBlended() ){
            throw new NotAbleToPourException();
        }
        if( x.getCapacity() < this.getVolume() ){
            x.setVolume(x.getCapacity());
            double cal = (x.getVolume() / this.getVolume()) * ingredients.get(0).getNoOfCalories();
            this.setVolume(this.getVolume() - x.getCapacity());
            ingredients.get(0).setVolume(this.getVolume());
            this.setNoOfCalories(this.getNoOfCalories() - cal);
            ingredients.get(0).setNoOfCalories(this.getNoOfCalories());
            x.setNoOfCalories(cal);
        }else{
            x.setVolume(this.getVolume());
            x.setNoOfCalories(this.getNoOfCalories());
            this.setNoOfCalories(0);
            this.setVolume(0);
            ingredients.clear();
        }
        
    }
    public void printIngredients(){
        if( ingredients.isEmpty() && this.getVolume() == 0 ){
            System.out.println("there is no ingredients, please add some.");
        }else if( ingredients.isEmpty() ){
            System.out.println("The blender contains coctail!");
        }else{
            for(Ingredient i : ingredients){
                System.out.println(i.getInfo());
            }
        }
    }
    
}
