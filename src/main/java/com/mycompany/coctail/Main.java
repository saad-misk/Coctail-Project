package com.mycompany.coctail;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
        
    private static final Blender blender = new Blender(1000, 0, 0, false);
    private static final ArrayList<Cup> cups = new ArrayList<>();
    private static String name;
    private static double volume = 0, calories = 0;
    private static int red = 0, green = 0, blue = 0;
    private static Scanner input = new Scanner(System.in);
    private static int choice, typeOfIngrdient;
    private static boolean anExceptionHappened = false;
    
    public static void main(String args[]){
        
        
        while(true){
            
            
            printList();
            readChoice();
            
            switch (choice){
                case 1 -> {
                    System.out.println("""
                                       Choose ingredient type:
                                       \t1.Fruit
                                       \t2.Drink
                                       \t3.Extra
                                       """);
                    readTypeOfIngrdient();
                    if( anExceptionHappened ){
                        anExceptionHappened = false;
                        break;
                    }
                    readIngredient();
                    if( anExceptionHappened ){
                        anExceptionHappened = false;
                        break;
                    }
                    switch (typeOfIngrdient) {
                        case 1 -> {
                            Fruit f = new Fruit(name, calories, volume, new Color(red, green, blue));
                            try{
                                blender.add(f);
                            }catch(BlenderOverFlowException e){
                                System.out.println(e.getMessage());
                            }
                        }
                        case 2 -> {
                            Drink d = new Drink(name, calories, volume, new Color(red, green, blue));
                            try{
                                blender.add(d);
                            }catch(BlenderOverFlowException e){
                                System.out.println(e.getMessage());
                            }
                        }
                        default -> {
                            Extra extra = new Extra(name, calories, volume, new Color(red, green, blue));
                            try{
                                blender.add(extra);
                            }catch(BlenderOverFlowException e){
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    blender.setBlended(false);
                    break;
                }
                case 2 -> {
                    blender.printIngredients();
                    break;
                }
                case 3 -> {
                    try{
                        blender.blend();
                        blender.setBlended(true);
                    }catch(EmptyBlenderException e){
                        System.out.println( e.getMessage());
                    }
                    
                    break;
                }
                case 4 -> {
                    System.out.println("Enter your the size of your cup: ");
                    int cupSize = input.nextInt();
                    Cup newCup = new Cup(cupSize, 0, 0);
                    try{
                        blender.pour(newCup);
                    }catch(EmptyBlenderException e1){
                        System.out.println(e1.getMessage());
                    }catch(NotAbleToPourException e2){
                        System.out.println("you can not pour! " + e2.getMessage());
                    }
                    cups.add(newCup);
                    break;
                }
                case 5 -> {
                    System.out.print("Enter the size of your cup:");
                    int sz = input.nextInt(); input.nextLine();
                    System.out.println(blender.getVolume() / sz);
                    break;
                }
                case 6 -> {
                    printCups();
                    break;
                }
                case 7 -> {
                    return;
                }
                default -> {
                    System.out.println("Enter a valid choice");
                    break;
                }
            }
            System.out.println("************************************************");
        }         
        
    }

    public static void readChoice(){
        try{
            choice = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid input.");
        }
        input.nextLine();
    }
    
    public static void readTypeOfIngrdient(){
        try{
            typeOfIngrdient = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid input.");
            anExceptionHappened = true;
        }
        input.nextLine();
    }
    
    public static void printList(){
        System.out.println("""
                           1.Add an ingredient
                           2.Print ingredients
                           3.Blend
                           4.Pour a cup
                           5.How many cups you can pour?
                           6.Print cups info
                           7.Exit the program""");
    }
    
    public static void readIngredient(){
        try{
            System.out.print("\tEnter name: ");
                name = input.nextLine();
            System.out.print("\tEnter number of calories: ");
                calories = input.nextDouble();input.nextLine();
            System.out.print("\tEnter volume: ");
                volume = input.nextDouble();input.nextLine();
            System.out.print("\tEnter the color in rgb:\n\tred = ");
                red = input.nextInt();input.nextLine();
                System.out.print("\tgreen = ");
                green = input.nextInt();input.nextLine();
                System.out.print("\tblue = ");
                blue = input.nextInt();input.nextLine();
        }catch(Exception e){
            System.out.println("Invalid input. Please enter a valid input.");
            anExceptionHappened = true;
        }
        
    }
    
    public static void printCups(){
        if( cups.isEmpty() ){
            System.out.println("There are no cups yet, make some coctail and pour some cups:)");
        }
        for(int i = 0; i < cups.size(); i++){
            System.out.println( "cup " + i + ": " + cups.get(i).getInfo());
        }
    }
    
}
