/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
//        int y = 10;
//        int x = 2;     
//        try {
//            int z = x / y;  
//            System.out.println("after division : " + z);
//        } catch (ArithmeticException e) {
//            System.out.println("Attempt to divide by 0");
//            System.out.println("After catch");
            
int a = 0, b = 1, limit, nextnum;
        
        Scanner input = new Scanner(System.in);
        
        // Get the upper limit from the user with exception handling
        while (true) {
            try {
                System.out.print("Enter a number to display up to that number: ");
                limit = input.nextInt(); // Read user input
                
                // Check if the input is a valid positive number
                if (limit < 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    break; // Exit loop if input is valid
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.nextLine(); // Clear the invalid input
            }
        }

        // Print Fibonacci Series up to the entered limit
        System.out.print("Fibonacci Series up to " + limit + ": ");
        
        if (limit == 0) {
            System.out.println(a); // If the limit is 0, only print 0
        } else {
            // Print the Fibonacci series until that number
            while (a <= limit) {
                System.out.print(a + " ");
                nextnum = a + b; // Calculate the next Fibonacci number
                a = b; // Update a to b after add
                b = nextnum; // Update b to 'next number'
            }
        }
        
        input.close(); // Close the scanner       

        }       
    }







