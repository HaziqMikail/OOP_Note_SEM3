/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystem.mikail;

/**
 *
 * @author HP
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GradingSystemMikail {

    // Method to identify grade and update counts
    private static void identifyGrade(int marks, int[] gradeCounts) { 
        if (marks >= 80) {
            gradeCounts[0]++; // Increment grade A count
        } else if (marks >= 70) {
            gradeCounts[1]++; // Increment grade B count
        } else if (marks >= 60) {
            gradeCounts[2]++; // Increment grade C count
        } else if (marks >= 50) {
            gradeCounts[3]++; // Increment grade D count
        } else {
            gradeCounts[4]++; // Increment grade F count
        }
    }

    // Method to display results using JOptionPane
    private static void displayResults(int[] gradeCounts, int passCount, int failCount) {
        
        String result = "\nTotal of Result:\n" +
                        "A: " + gradeCounts[0] + "\n" +
                        "B: " + gradeCounts[1] + "\n" +
                        "C: " + gradeCounts[2] + "\n" +
                        "D: " + gradeCounts[3] + "\n" +
                        "F: " + gradeCounts[4] + "\n\n" +
                        "Number of students passed: " + passCount + "\n" +
                        "Number of students failed: " + failCount + "\n";

        // Display bonus to instructor or not
        if (passCount > failCount) {
            result += "\nBonus to instructor!";
        } else {
            result += "\nMore effort required.";
        }

        // Show the final result using JOptionPane
        JOptionPane.showMessageDialog(null, result, "Grading Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) { // main method
        
        String userResponse; // declare variables
        int marks, TotalofStudent;
        boolean continueProgram = true;
        
        Scanner Tanyasoalan = new Scanner(System.in); // create scanner object        
        
        JOptionPane.showMessageDialog(null, "Welcome to Grading System", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        while (continueProgram) { // loop program
            
            System.out.print("Enter the number of students: "); // Ask user how many students
            TotalofStudent = Tanyasoalan.nextInt(); // Read user input
            Tanyasoalan.nextLine(); 

            int[] gradeCounts = new int[5]; // Array to store counts of grades A, B, C, D, F
            int lulus = 0, gagal = 0; // Variables to store pass and fail counts

            // Loop through the number of students and get marks
            for (int i = 0; i < TotalofStudent; i++) {  
                boolean validInput = false; // to check valid input
                
                // Continue asking for marks until a valid number is entered
                while (!validInput) {
                    System.out.print("Enter marks for student " + (i + 1) + " (0 - 100): ");
                    marks = Tanyasoalan.nextInt(); // Read user input
                    Tanyasoalan.nextLine(); 

                    if (marks > 100 || marks < 0) {
                        System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                    } else {
                        validInput = true; // Set boolean to true when input is valid
                        identifyGrade(marks, gradeCounts); // Identify grade and update counts

                        // Count passes and fails
                        if (marks >= 50) {    
                            lulus++;
                        } else {
                            gagal++; // <50 = fail
                        }
                    }
                }
            }

            // Call method to display final results
            displayResults(gradeCounts, lulus, gagal);

            // Ask user if they want to continue or exit
            System.out.print("\nDo you want to continue? (yes/no): ");
            userResponse = Tanyasoalan.nextLine(); // get user input
            
            if (!userResponse.equalsIgnoreCase("yes")) { // If no, end the program
                continueProgram = false;
                System.out.print("Thank you for using the program\n");
            }
        }
        Tanyasoalan.close(); // Close scanner                
    }
}


















































