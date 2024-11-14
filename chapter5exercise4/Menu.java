/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5exercise4;

/**
 *
 * @author Haziq Mikail
 */

import java.util.Scanner;
public class Menu {
    private Scanner input = new Scanner(System.in);  // Create Scanner object for user input

    // Method to display conversion options
    public void ConvertOption() {
        System.out.println("\n-------------------------------------");
        System.out.println("Select a unit conversion option:");
        System.out.println("1. Celsius to Fahrenheit (c -> F)");
        System.out.println("2. Fahrenheit to Celsius (F -> C)");
        System.out.println("3. Kilograms to Grams    (KG -> G)");
        System.out.println("4. Grams to Kilograms    (G -> KG)");
        System.out.println("5. Meters to Centimeters (M -> CM)");
        System.out.println("6. Centimeters to Meters (CM -> M)");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");
        System.out.print("Enter your choice: ");
    }
}

