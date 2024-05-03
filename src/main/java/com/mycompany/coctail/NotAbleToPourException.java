package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class NotAbleToPourException extends Exception{
    
    public NotAbleToPourException(){
        super("Please blend the ingredients.");
    }
    
}
