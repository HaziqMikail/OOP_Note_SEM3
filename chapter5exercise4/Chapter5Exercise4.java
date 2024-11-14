/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5exercise4;

/**
 *
 * @author Haziq Mikail
 */


import java.util.Scanner;

public class Chapter5Exercise4 {
    public static void main(String[] args) {
        int userChoice = -1;  // Initialize a value to keep loop running
        float inputValue, convertResult;
        
        Scanner input = new Scanner(System.in);  // Using Scanner input
        
        Menu myMenu = new Menu();  // Create Menu object
        Converter myConverter = new Converter();  // Create Converter object

        while (userChoice != 0) {
            myMenu.ConvertOption();  // Display menu options
            userChoice = input.nextInt();  // Receive input from user

            switch (userChoice) {
                case 1:  // Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertCelsiusToFahrenheit(inputValue);  // Call conversion method
                    System.out.println("Fahrenheit: " + convertResult);//print result
                    break;
                    
                case 2:  // Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertFahrenheitToCelsius(inputValue);  // Call conversion method
                    System.out.println("Celsius: " + convertResult);//print result
                    break;
                    
                case 3:  // Kilograms to Grams
                    System.out.print("Enter weight in kilograms: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertKilogramsToGrams(inputValue);  // Call conversion method
                    System.out.println("Grams: " + convertResult);//print result
                    break;
                    
                case 4:  // Grams to Kilograms
                    System.out.print("Enter weight in grams: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertGramsToKilograms(inputValue);  // Call conversion method
                    System.out.println("Kilograms: " + convertResult);//print result
                    break;
                    
                case 5:  // Meters to Centimeters
                    System.out.print("Enter length in meters: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertMetersToCentimeters(inputValue);  // Call conversion method
                    System.out.println("Centimeters: " + convertResult);//print result
                    break;
                    
                case 6:  // Centimeters to Meters
                    System.out.print("Enter length in centimeters: ");
                    inputValue = input.nextFloat(); //receive input from user
                    
                    convertResult = myConverter.convertCentimetersToMeters(inputValue);  // Call conversion method
                    System.out.println("Meters: " + convertResult); //print result
                    break;
                    
                case 0:
                    System.out.println("Exiting the program.");
                    break;                    
                default:
                    System.out.println("Invalid choice, enter a number between 0 and 6.");
            }
        }
        input.close();
    }
}


