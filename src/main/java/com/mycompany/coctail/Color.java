package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Color {
    
    private int red, green, blue;
    public Color(){}
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() { return red; }

    public int getGreen() { return green; }

    public int getBlue() { return blue; }

    public void setRed(int red) { this.red = red; }

    public void setGreen(int green) { this.green = green; }

    public void setBlue(int blue) { this.blue = blue; }
    
    public String getInfo(){
        return "(" + red + ", " + green + ", " + blue + ")";
    }
    
}
