package chapter5exercise;

import java.util.Scanner;

public class Chapter5exercise {
    public static void main(String[] args) {
        boolean continueInput = true;
        int max,min;
        
        Scanner input = new Scanner(System.in); // Create Scanner object

        while (continueInput) {
            int[] numbers = new int[3]; 
          
            for (int i = 0; i < 3; i++) { // user enter to enter numbers
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            MaxNumber myMaxNumber = new MaxNumber(); // Create MaxNumber object
            max = myMaxNumber.calcMaxNum(numbers); // Call calcMaxNum method

            MinNumber myMinNumber = new MinNumber(); // Create MinNumber object
            min = myMinNumber.calcMinNum(numbers); // Call calcMinNum method

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        
            System.out.print("Do you want to continue? (yes/no): "); // Ask if the 
            continueInput = input.next().equalsIgnoreCase("yes");    //user wants to continue
        }
        System.out.println("Thank you for using the program!");
        input.close(); // Close Scanner
    }
}









