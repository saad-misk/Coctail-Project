package com.mycompany.coctail;
import java.io.FileWriter;
import java.io.IOException;


public class FileLogger implements Logger {
    private FileWriter fileWriter;

    public FileLogger(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message) {
        try {
            fileWriter.write("FileLogger: " + message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
