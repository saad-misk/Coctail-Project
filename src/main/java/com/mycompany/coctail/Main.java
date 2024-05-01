package com.mycompany.coctail;

/**
 *
 * @author user
 */
public class Main {
        
    public static void main(String args[]){
        
        Logger myLogger = new MyLogger();
        Logger fileLogger = new FileLogger("test.txt");
        
        myLogger.log("Logging message using MyLogger.");
        fileLogger.log("Logging message using FileLogger.");
        
        if(fileLogger instanceof FileLogger){
            ((FileLogger) fileLogger).close();
        }
    }
    
}
