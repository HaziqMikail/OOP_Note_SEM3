/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5exercise5;

/**
 *
 * @author Haziq Mikail
 */

import java.util.Scanner;

public class Chapter5Exercise5 {
    public static void main(String[] args) {
        float[] averages = {0.0f, 0.0f, 0.0f};//average for three student
        float[] marks = {0.0f, 0.0f, 0.0f};  //mark for three student
        float average, highestAverage;  

        Scanner scanner = new Scanner(System.in);  // Create Scanner object for user input
        
        AverageCalculator myAverageCalculator = new AverageCalculator();  // Create AverageCalculator object
        HighestAverageCalculator myHighestAverageCalculator = new HighestAverageCalculator();  // Create HighestAverageCalculator object
        
        for (int i = 0; i < 3; i++) { //first loop to display instruction for each student
            System.out.println("Enter marks for Student " + (i + 1) + " :");
                                                                            
            for (int j = 0; j < 3; j++) { // Input marks from user
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = scanner.nextFloat();  // Read user input
            }
           
            average = myAverageCalculator.calculateAverage(marks); // Calculate and display average
            System.out.printf("Average for Student %d: %.2f\n", (i + 1), average);  // Display average with 2 decimal points
            averages[i] = average;  // Store average value in array
        }
       
        highestAverage = myHighestAverageCalculator.calculateHighestAverage(averages[0], averages[1], averages[2]); // Calculate and display the highest average
        System.out.printf("\nHighest Average: %.2f", highestAverage);  // Display highest average 

        scanner.close();  // Close the Scanner
    }
}

