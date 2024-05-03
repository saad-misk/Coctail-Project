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
    
    public void setColor(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public static Color mixColors(Color a, Color b){
        int Red = (a.getRed() + b.getRed()) / 2;
        int Green = (a.getGreen() + b.getGreen()) / 2;
        int Blue = (a.getBlue() + b.getBlue()) / 2;
        
        return new Color(Red, Green, Blue);
    }
    
    public static String convertToMainColor(int red, int green, int blue) {
        int max = Math.max(red, Math.max(green, blue));
        int min = Math.min(red, Math.min(green, blue));
        int delta = max - min;
        int hue;

        if (delta == 0) {
            hue = 0;
        } else if (max == red) {
            hue = ((green - blue) / delta) % 6;
        } else if (max == green) {
            hue = ((blue - red) / delta) + 2;
        } else {
            hue = ((red - green) / delta) + 4;
        }

        hue *= 60;

        if (hue < 0) {
            hue += 360;
        }

        if (hue >= 330 || hue < 30) {
            return "Red";
        } else if (hue >= 30 && hue < 90) {
            return "Yellow";
        } else if (hue >= 90 && hue < 150) {
            return "Green";
        } else if (hue >= 150 && hue < 210) {
            return "Cyan";
        } else if (hue >= 210 && hue < 270) {
            return "Blue";
        } else if (hue >= 270 && hue < 330) {
            return "Magenta";
        } else {
            return "Unknown";
        }
    }
    
    public String getInfo(){
        return convertToMainColor(red, green, blue);
    }
    
}
