//--------------- W H I L E  S T A T E M E N T ------------------------
//public class WhileLoopDemo {         
//    public static void main(String[] args) {
//        int count = 1;
//        System.out.println("Printing number from 1 - 10");
//        while(count<=10){
//            System.out.println(count++);
//        }
//    }
//}

//-------------- D O  W H I L E  S T A T E M E N T ------------------------
//public class WhileLoopDemo {         
//    public static void main(String[] args) {
//        int count = 5;
//        System.out.println("Printing number from 1 - 100");
//        do{
//            System.out.println(count++);}        
//        while(count<=100);}   //value 10 kali              
//    }

//------------- F O R  S T A T E M E N T ------------------------
//public class LoopDemo {         
//    public static void main(String[] args) {
//        System.out.println("Printing number from 1 - 10");
//        for(int count = 10; count >= 1; count--){
//            System.out.println(count);
//        }
//          
//    }
//}

//public class LoopDemo {         
//    public static void main(String[] args) {
//        System.out.println("Printing number from 1 - 10");
//        int count = 1;
//        while(count<=10){
//            System.out.println(count);
//            count++;
//        }
//    }
//}

//----------------- T R A N S F E R  S T A T E M E N T -------------------------
//--------B R E A K ----------------
//public class BreakDemo {         
//    public static void main(String[] args) {
//        System.out.println("Printing number from 1 - 10");
//        for(int i = 1; i <=10;i++){
//            if(i==5)
//                break;//break loop at 5
//            System.out.println(i + "\t");//  "\t" untuk jarak
//            System.out.println("Broke out of loop at i=" + i);
//        }
//    }
//}

//------------C O N T I N U E --------------------------
//public class BreakDemo {         
//    public static void main(String[] args) {
//        System.out.println("Printing number from 1 - 10");
//        for(int i = 1; i <=10;i++){
//            if(i==5){
//                continue;//skip remaining code in loop at 5
//            System.out.println(i + "\t");}
//            System.out.println("Skip printing 5");
//        }
//    }
//}
        
//----------F I N D  N U M ---------------------------------------------------
//public class BreakDemo {         
//    public static void main(String[] args) {
//        String searchMe = ("Susie works in a shoeshine shop. Where she shines she sits, and where she sits she shines.");
//        int max = searchMe.length();
//        int numSs = 0,numEs = 0;
//        for(int i = 0;i< max;i++){//interested in S only
//            if(searchMe.charAt(i) != 's' && searchMe.charAt(i) != 'S')
//                continue;
//            numSs++;
//        }
//        for(int i = 0;i< max;i++){//interested in E only
//            if(searchMe.charAt(i) != 'e' && searchMe.charAt(i) != 'E')
//                continue;
//            numEs++;
//        }
//        System.out.println(max);
//        System.out.println("Found " + numSs + " S's in the string.");
//        System.out.println("Found " + numEs + " E's in the string.");
//    }
//}    

//        for(int i = 0;i< max;i++){//interested in S only
//            if(searchMe.charAt(i) != 's' && searchMe.charAt(i) != 'S'){
//            numSs++;}
//            if(searchMe.charAt(i) != 'e' && searchMe.charAt(i) != 'E'){                
//            numEs++;}          
//        }           
//        System.out.println(max);
//        System.out.println("Found " + numSs + " S's in the string.");
//        System.out.println("Found " + numEs + " E's in the string.");

//----------------------------R E T U R N  S T A T E M E N T ----------------------------------
//public class BreakDemo {         
//    public static void main(String[] args) {
//        int result;
//        for(int i = 1;i <=10;i++){
//            result = square(i);
//            System.out.println("The square of " + i + " is = " + result + "\n");
//        }
//    }
//    public static int square(int y){
//        return y*y;//return square of y
//    }
//}

//---------------N E S T E D  L O O P -------------------------
//public class BreakDemo {         
//    public static void main(String[] args) {
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(i);
//            }
//        System.out.println();
//        }
//    }
//}

//public class PyramidExample {  
//    public static void main(String[] args) {  
//        for(int i=1;i<=5;i++){         //outer loop baca row    ⬇
//            for(int j=1;j<=i;j++){     //inner loop baca column️ ➡️
//            System.out.print("* ");  
//            }  
//        System.out.println();//new line  
//        }  
//    }  
//}  

//public class PyramidExample2 { //reverse pyramid 
//    public static void main(String[] args) {  
//        int term=6;  
//        for(int i=1;i<=term;i++){  
//            for(int j=term;j>=i;j--){  
//            System.out.print("* ");  
//            }  
//        System.out.println();//new line  
//        }  
//    }  
//}  

//------------full pyramid-----------------------------
//        for(int a=1;a<=5;a++){         
//            for(int b=1;b<=a;b++){     
//            System.out.print("* ");  
//            }  
//        System.out.println();} 
//        
//        int term = 6;
//        for(int k=1;k<=term;k++){  
//            for(int l=term;l>=k;l--){  
//            System.out.print("* ");  
//            }  
//        System.out.println();

//public class PyramidExample {  
//    public static void main(String[] args) {  
//        int height = 4,width = 9,rows =5;  
//
//        for (int a = 1; a <= rows; a++) {
//            for (int s = rows; s > a; s--) {
//                System.out.print(" ");
//            }
//            for (int d = 1; d <= (2 * a - 1); d++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // for body
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= width; j++) {
//                if (i == 1 || i == height || j == 1 || j == width) {
//                    System.out.print("*"); //if same print *
//                } else {
//                    System.out.print(" ");//if not same print empty space
//                }
//            }
//            System.out.println();  
//        }  
//    }  
//} 





//----------------exercise 1----------------------------

//public class IntegersLoops {
//    public static void main(String[] args) {
//        // For loop
//        System.out.println("\nFor loop 1 - 10:");
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(" " + i);
//        }
//
//        // While loop
//        System.out.println("\n\nWhile loop 1 - 10:");
//        int j = 1;
//        while (j <= 10) {
//            System.out.print(" " + j);
//            j++;
//        }
//
//        // Do-while loop
//        System.out.println("\n\nDo while loop 1 - 10:");
//        int k = 1;
//        do {
//            System.out.print(" " + k);
//            k++;
//        } while (k <= 10);
//    }
//}


//----------exercise 2------------------------------

//public class SumIntegersForLoop {
//    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println("Sum for loop: " + sum);
//
//        sum = 0;
//        int j = 1;
//
//        while (j <= 10) {
//            sum += j;
//            j++;
//        }
//        System.out.println("Sum while loop: " + sum);
//
//        sum = 0;
//        int k = 1;
//
//        do {
//            sum += k;
//            k++;
//        } while (k <= 10);
//        System.out.println("Sum do while loop: " + sum);
//    }
//}


//--------------EXERCISE CHAPTER 4------------------------

//---------exercise 3     
//public class oddevennumber {         
//    public static void main(String[] args) {
//        int sumofeven = 0,sumofodd = 0;
//
//        System.out.println("Even and Odd numbers from 1-10 :\n");
//        
//        System.out.println("Even");
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {//boleh bahagi 2 = genap
//                sumofeven += i; //tambah nombor genap ke "sumofeven"
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println("\nSum of Even numbers: " + sumofeven);
//        
//        System.out.println("\nOdd ");
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0){//xboleh bahagi 2 = ganjil
//                sumofodd += i;//tambah nombor ganjil ke "sumofeven"
//                System.out.print(i + " ");
//            }
//        }
//                System.out.println("\nSum of Odd numbers: " + sumofodd);       
//    }
//}


//----------exercise 4---------------------------
   
//public class powerofintegers{
//    public static void main(String[] args) {
//        int power,sumofpower = 0;
//
//        System.out.println("Power of 2 of integers from 1 to 10:");
//
//        for (int i = 1; i <= 10; i++) {
//            power = i * i; //number times itself exp: 1x1 2x2 3x3
//            sumofpower += power; //add powered number to 'sumofpower'
//
//            System.out.println("power(" + i + ")² = " + power);
//        }
//
//        System.out.println("\nSum of squares from 1 to 10: " + sumofpower);//print total of squares
//    }
//}

            
//----------exercise 5---------------------------
   
//public class loopsequence {         
//    public static void main(String[] args) {
//        System.out.println("Number sequence:");
//
//        for (int i = 99; i >= 11; i -= 11){//start from 99,if i>=11, -11
//            System.out.print(i + " ");//print output
//        }
//    }
//}





//----------exercise 2a   1---------------------------
//import java.util.Scanner;  
//public class passwordsystem {         
//    public static void main(String[] args) {
//        int maxAttempts = 3,attempts = 0,remainingAttempts = maxAttempts;
//        String inputPassword,correctPassword = "password123"; //correct password
//        
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome!");
//
//        while (attempts < maxAttempts) {
//            System.out.print("Please enter your password: ");
//            inputPassword = input.nextLine(); // Read user input
//            
//            if (inputPassword.equals(correctPassword)) {
//                System.out.println("Access granted!"); // Successful login
//                break; // Exit the loop
//            } else {
//                attempts++; // Increment to 'attempt'
//                remainingAttempts = maxAttempts - attempts;
//                System.out.println("Incorrect password. Please try again."); 
//                
//                if (remainingAttempts > 0) {
//                System.out.println("You have " + remainingAttempts + " attempt(s) left.");
//                } else {
//                System.out.println("Maximum number of attempts reached. Access denied.");
//            }
//        }
//            
//        } 
//        input.close(); // Close the scanner
//    }
//}

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
import java.util.Scanner;
public class FactorialInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int totalnum = input.nextInt(); // Get user input

        if (totalnum < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1; // Variable to store the factorial

            // Display the factorial calculation3
            System.out.print(totalnum + "! = ");
            for (int i = totalnum; i > 0; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * "); // Display multiplication symbol
                }
                factorial *= i; // Calculate factorial
            }           
            System.out.println(" = " + factorial);// Display the result
        }
        input.close(); // Close the scanner
    }
}

//class Chapter5 {
//    public static void main(String[] args) {
//        Chapter5 note = new Chapter5(); 
//        note.init(); 
//    }
//
//    public void init() {
//        double max = maximum();
//        System.out.println("Maximum value = " + max); 
//    }
//
//    public double maximum() {
//        double x = 2.0, y = 3.0, z = 7.0; 
//        
//        return Math.max(x, Math.max(y, z));
//    }
//}
































