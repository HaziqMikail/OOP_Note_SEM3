//----------exercise 2a   1---------------------------
import java.util.Scanner;  
public class passwordsystem {         
    public static void main(String[] args) {
        int maxAttempts = 3,attempts = 0,remainingAttempts = maxAttempts;
        String inputPassword,correctPassword = "password123"; //correct password
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        while (attempts < maxAttempts) {
            System.out.print("Please enter your password: ");
            inputPassword = input.nextLine(); // Read user input
            
            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access granted!"); // Successful login
                break; // Exit the loop
            } else {
                attempts++; // Increment to 'attempt'
                remainingAttempts = maxAttempts - attempts;
                System.out.println("Incorrect password. Please try again."); 
                
                if (remainingAttempts > 0) {
                System.out.println("You have " + remainingAttempts + " attempt(s) left.");
                } else {
                System.out.println("Maximum number of attempts reached. Access denied.");
            }
        }
            
        } 
        input.close(); // Close the scanner
    }
}

//----------exercise 2a  2---------------------------
//import java.util.Scanner;  
//public class examresult {         
//    public static void main(String[] args) {
//        int passedstudent = 0,failedstudent = 0,numberOfStudents;
//        
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number of students: ");
//        numberOfStudents = input.nextInt(); // Read the number of students
//
//        for (int i = 1; i <= numberOfStudents; i++) {
//            System.out.print("Enter score for student " + i + " (0-100): ");
//            int score = input.nextInt(); // Read score from user
//
//            if (score >= 40) { //set failing mark
//                passedstudent++; // Increment passed count
//            } else {
//                failedstudent++; // Increment failed count
//            }
//        }
//        
//        System.out.println("\nTotal students who passed: " + passedstudent);// Display results
//        System.out.println("Total of students who failed: " + failedstudent);
//        
//        if (passedstudent > (numberOfStudents / 2)) {// Check if more than 50% passed
//            System.out.println("Bonus to instructor!");
//        }
//        input.close(); // Close the scanner               
//    }
//}


//----------exercise 2a  3---------------------------
//import java.util.Scanner;
//public class salesmancommission {
//    public static void main(String[] args) {
//        float baseSalary = 600.0f,commissionRate = 0.05f;
//        int keyboards, mouse, monitor;
//        float keyboardPrice = 50.0f, mousePrice = 20.0f, monitorPrice = 100.0f;
//        float grossSales, commission, totalEarnings,monitorsTotal,mouseTotal,keyboardsTotal;
//
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("\nItem Prices:"); //display all item price
//        System.out.printf("Keyboard: RM %.2f\n", keyboardPrice);
//        System.out.printf("Mouse: RM %.2f\n", mousePrice);
//        System.out.printf("Monitor: RM %.2f\n\n", monitorPrice);
//
//        System.out.print("Enter the number of keyboards sold: ");
//        keyboards = input.nextInt();//enter total items sold
//
//        System.out.print("Enter the number of mouse sold: ");
//        mouse = input.nextInt();//enter total items sold
//
//        System.out.print("Enter the number of monitors sold: ");
//        monitor = input.nextInt();//enter total items sold
//
//        keyboardsTotal = keyboards * keyboardPrice;//total price for keyboard
//        mouseTotal = mouse * mousePrice;            //total price for mouse
//        monitorsTotal = monitor * monitorPrice;    //total price for monitor
//
//        grossSales = keyboardsTotal + mouseTotal + monitorsTotal;//calcucalte gross
//        commission = grossSales * commissionRate;//calcucalte commission
//        totalEarnings = baseSalary + commission;//calcucalte total earning
//            
//        System.out.printf("\nBase salary for the week: RM %.2f\n", baseSalary);
//        System.out.printf("Total commission for the week: RM %.2f\n", commission);
//        System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);              
//        input.close();
//    }
//}



//----------exercise 2a  4---------------------------
//import java.util.Scanner;
//public class EvenAndOddNumCounter {
//    public static void main(String[] args) {
//        boolean continueprogram = true;
//        Scanner input = new Scanner(System.in);        
//
//        while (continueprogram == true) {
//            int evenCount = 0,oddCount = 0,totalnum,number;
//            String response;
//
//            System.out.print("\nEnter how many numbers you want to input: ");
//            totalnum = input.nextInt();//input integers
//
//            for (int i = 0; i < totalnum; i++) {//loop to input integers
//                System.out.print("Enter integer " + (i + 1) + ": ");
//                number = input.nextInt(); //number = user input
//                if (number % 2 == 0) { //if divideable by 2 == even 
//                    evenCount++;
//                } else {//if not == odd
//                    oddCount++;
//                }
//            }
//            System.out.println("Number of even integers: " + evenCount);
//            System.out.println("Number of odd integers: " + oddCount);
//            System.out.print("\nDo you want to continue? (yes/no): ");
//            response = input.next();
//            continueprogram = response.equalsIgnoreCase("yes");
//        }
//        input.close();
//    }
//}


//----------exercise 2a  5---------------------------
//import java.util.Scanner;
//public class salesmancommissionPro {
//    public static void main(String[] args) {
//        float baseSalary = 600.0f,commissionRate = 0.05f;
//        int keyboards, mouse, monitor;
//        float keyboardPrice = 50.0f, mousePrice = 20.0f, monitorPrice = 100.0f;
//        float grossSales, commission, totalEarnings,monitorsTotal,mouseTotal,keyboardsTotal;
//        boolean continueprogram = true;
//        String choice;
//        
//        Scanner input = new Scanner(System.in);
//        
//        while (continueprogram) {//loop to keep program run
//            System.out.println("\nItem Prices:"); //display all item price
//            System.out.printf("Keyboard: RM %.2f\n", keyboardPrice);
//            System.out.printf("Mouse: RM %.2f\n", mousePrice);
//            System.out.printf("Monitor: RM %.2f\n\n", monitorPrice);
//
//            System.out.print("Enter the number of keyboards sold: ");
//            keyboards = input.nextInt();//enter total items sold
//
//            System.out.print("Enter the number of mouse sold: ");
//            mouse = input.nextInt();//enter total items sold
//
//            System.out.print("Enter the number of monitors sold: ");
//            monitor = input.nextInt();//enter total items sold
//
//            keyboardsTotal = keyboards * keyboardPrice;//total price for keyboard
//            mouseTotal = mouse * mousePrice;            //total price for mouse
//            monitorsTotal = monitor * monitorPrice;    //total price for monitor
//
//            grossSales = keyboardsTotal + mouseTotal + monitorsTotal;//calcucalte gross
//            commission = grossSales * commissionRate;//calculate commission
//            totalEarnings = baseSalary + commission;//calcucalte total earning
//            
//            System.out.printf("\nBase salary for the week: RM %.2f\n", baseSalary);
//            System.out.printf("Total commission for the week: RM %.2f\n", commission);
//            System.out.printf("Total earnings for the week: RM %.2f\n", totalEarnings);              
//            
//            System.out.print("\nDo you want to continue? (yes/no): ");
//            choice = input.nextLine();
//            
//            if(choice.equalsIgnoreCase("no")){//user choose to continue or exit
//                continueprogram = false;
//            }            
//        }
//        System.out.print("\nThank you for using this system");
//        input.close();
//    }
//}

//----------task 3 - exercise 1----------------------------

//import java.util.Scanner;
//
//public class Fibonacciseries {
//    public static void main(String[] args) {
//        int a = 0, b = 1,limit,nextnum;
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter a number to display up to that number: ");
//        limit = input.nextInt(); // Get the upper limit from the user
//
//        System.out.print("Fibonacci Series up to " + limit + ": ");
//        
//        if (limit < 0) {
//            System.out.println("Please enter a positive number.");//enter positive num only
//        } else if (limit == 0) {
//            System.out.println(a); // If the limit is 0, only print 0
//        } else {
//            // Print the Fibonacci series until that number
//            while (a <= limit) {
//                System.out.print(a + " ");
//                nextnum = a + b; // Calculate the next Fibonacci number
//                a = b; // Update a to b after add
//                b = nextnum; // Update b to 'next number'
//            }
//        }
//        input.close(); // Close the scanner
//    }
//}



//----------task 3 - exercise 2----------------------------

//-----------not interactive------------
//public class FactorialNonInteractive {
//    public static void main(String[] args) {
//        int n = 5,factorial = 1; 
//
//        System.out.print(n + "! = ");
//        for (int i = n; i > 0; i--) {
//            System.out.print(i);
//            if (i > 1) {
//                System.out.print(" * "); // Display multiplication symbol
//            }
//            factorial *= i; // Calculate total factorial
//        }        
//        System.out.println(" = " + factorial);// Display the result
//    }
//}


//----------- interactive------------
//import java.util.Scanner;
//public class FactorialInteractive {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter a positive integer: ");
//        int totalnum = input.nextInt(); // Get user input
//
//        if (totalnum < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            int factorial = 1; // Variable to store the factorial
//
//            // Display the factorial calculation3
//            System.out.print(totalnum + "! = ");
//            for (int i = totalnum; i > 0; i--) {
//                System.out.print(i);
//                if (i > 1) {
//                    System.out.print(" * "); // Display multiplication symbol
//                }
//                factorial *= i; // Calculate factorial
//            }           
//            System.out.println(" = " + factorial);// Display the result
//        }
//        input.close(); // Close the scanner
//    }
//}
