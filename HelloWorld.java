//----------------------OOP SWE2 SEM3------------------------------------//
//import java.util.Scanner;     
//public class displayname {         
//    public static void main(String[] args) {
//      
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Input your first name: ");
//        fname = input.nextLine();       
//    }
//}

//----------------------------P R I N T--------------------------------- 
//public class HelloWorld{  //class name adalah HelloWorld = java name
//    public static void main(String[] args){    //method
//    //xboleh ada lebih dari 1 main method    
//        System.out.println("Hello World!!");}  //diplay output
//    }


//--------------------P R I N T  I N  O N E  L I N E-------------------
//public class HelloWorld {
//    public static void main(String[]args){ 
//        System.out.print("My name is Mikail");         
//        System.out.print("I like reading");
//        System.out.print("My favourite place is Terengganu");
//    }
//}


//-------------------------L I N E  B R E A K-------------------------------
//public class HelloWorld{ 
//    public static void main(String[] args){    
//        System.out.println("Dream salary:RM5000 \nDream job:software Engineer \nFav food:nasi lemak");} 
//    }


//--------------------------A R I T H M E T I C----------------------------
//public class HelloWorld{ 
//    public static void main(String[] args){    
//        
//        int num1 = 5,num2 = 12,num3 = 3,num4 = 1,num5 = 5,num6 = 5,num7 = 12,num8 = 12;
//        
//        int total1 = num1 + num2,total2 = num3 - num4,total3 = num5 / num6,total4 = num7 * num8;
//        
//        System.out.println("===== THIS IS ARTITHMETICS OPERATORS =====\n");
//        System.out.println("          1. 5 + 12 = " + total1);
//        System.out.println("          2. 3 - 1 = " + total2);
//        System.out.println("          3. 5 / 5 = " + total3);
//        System.out.println("          4. 12 X 12 = " + total4);
//        System.out.println("==========================================");
//    }
//}

//--------------------E X C E P T I O N  H A N D L I N G-----------------
import java.util.InputMismatchException;
import java.util.Scanner;
public class HelloWorld{ 
    public static void main(String[] args){    
        
        Scanner scanner = new Scanner(System.in);
        
        try{            
            System.out.println("Enter Number to Divide :");
            int x = scanner.nextInt();
            
            System.out.println("Enter Number to Divide by :");
            int y = scanner.nextInt();
            
            int z = x/y;
            
            System.out.println("Result = " + z);           
        }
        
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Enter number only");
        }catch(Exception e){
            System.out.println("Something is wrong"); //handle all exception
        }
        
        finally{
            System.out.println("This is exception handling");
            scanner.close();
        }    
    }
}















//--------------L A B  T A S K-----------------
//
//import javax.swing.JOptionPane;
//public class GradingSystemMikail {
//
//    // Method to identify grade and update counts
//    private static void identifyGrade(int marks, int[] gradeCounts) { 
//        if (marks >= 80) {
//            gradeCounts[0]++; // Increment grade A count
//        } else if (marks >= 70) {
//            gradeCounts[1]++; // Increment grade B count
//        } else if (marks >= 60) {
//            gradeCounts[2]++; // Increment grade C count
//        } else if (marks >= 50) {
//            gradeCounts[3]++; // Increment grade D count
//        } else {
//            gradeCounts[4]++; // Increment grade F count
//        }
//    }
//
//    // Method to display results using JOptionPane
//    private static void displayResults(int[] gradeCounts, int passCount, int failCount) {
//        String result = "\nGrades Distribution:\n" +
//                        "A: " + gradeCounts[0] + "\n" +
//                        "B: " + gradeCounts[1] + "\n" +
//                        "C: " + gradeCounts[2] + "\n" +
//                        "D: " + gradeCounts[3] + "\n" +
//                        "F: " + gradeCounts[4] + "\n\n" +
//                        "Number of students passed: " + passCount + "\n" +
//                        "Number of students failed: " + failCount + "\n";
//
//        // Display bonus to instructor or not
//        if (passCount > failCount) {
//            result += "\nBonus to instructor!";
//        } else {
//            result += "\nMore effort required.";
//        }
//
//        // Show the final result using JOptionPane
//        JOptionPane.showMessageDialog(null, result, "Grading Summary", JOptionPane.INFORMATION_MESSAGE);
//    }
//
//    public static void main(String[] args) {
//
//        boolean continueProgram = true;
//
//        JOptionPane.showMessageDialog(null, "Welcome to Grading System", "Welcome", JOptionPane.INFORMATION_MESSAGE);
//
//        while (continueProgram) { // loop program
//            
//            // Get the number of students from user
//            String totalInput = JOptionPane.showInputDialog(null, "Enter the number of students:");
//            int TotalofStudent = Integer.parseInt(totalInput);
//
//            int[] gradeCounts = new int[5]; // Array to store counts of grades A, B, C, D, F
//            int passCount = 0, failCount = 0; // Variables to store pass and fail counts
//
//            // Loop through the number of students and get marks
//            for (int i = 0; i < TotalofStudent; i++) {  
//                String marksInput = JOptionPane.showInputDialog(null, "Enter marks for student " + (i + 1) + " (1 - 100):");
//                int marks = Integer.parseInt(marksInput); // Convert string input to integer
//                
//                identifyGrade(marks, gradeCounts); // Identify grade and update counts
//
//                // Count passes and fails
//                if (marks >= 50) {    
//                    passCount++;
//                } else {
//                    failCount++; // <50 = fail
//                }
//            }
//
//            // Display final results using JOptionPane
//            displayResults(gradeCounts, passCount, failCount);
//
//            // Ask user if they want to continue or exit
//            int userResponse = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue?", JOptionPane.YES_NO_OPTION);
//            
//            if (userResponse != JOptionPane.YES_OPTION) { // If "No", end the program
//                continueProgram = false;
//                JOptionPane.showMessageDialog(null, "Thank you for using the program", "Exit", JOptionPane.INFORMATION_MESSAGE);
//            }
//        }
//    }
//}













































