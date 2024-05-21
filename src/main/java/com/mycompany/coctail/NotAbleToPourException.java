package com.mycompany.coctail;


public class NotAbleToPourException extends Exception{
    
    public NotAbleToPourException(){
        super("Please blend the ingredients.");
    }
    
}
