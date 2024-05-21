package com.mycompany.coctail;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println("MyLogger: " + message);
    }
}
