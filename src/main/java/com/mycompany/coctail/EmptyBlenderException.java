package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class EmptyBlenderException extends Exception{
    
    public EmptyBlenderException(){
        super("The Blender is Empty!");
    }
    
}
