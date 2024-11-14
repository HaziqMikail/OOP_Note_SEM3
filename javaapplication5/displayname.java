//import java.util.Scanner;     
//public class KISmark {         
//    public static void main(String[] args) {
//        
//        
//        Scanner INPUT = new Scanner(System.in);
//        
//        }        
//    }
//}


//import java.util.Scanner; //use input funtion
//
//public class InputExp {
//    public static void main(String[] args){ 
//        
//        String name,student_id;
//        int age;
//        Scanner INPUT = new Scanner(System.in); //"INPUT" boleh nama apa2
//        
//        //Read a single line from the console
//        //and stores into name variable
//        System.out.print("Enter your name: ");
//        name = INPUT.nextLine();
//        
//        //Read a integer from the console
//        //and stores into name variable
//        System.out.print("Enter your age: "); //sebelum int baca string
//        age = INPUT.nextInt();                //string boleh baca nombor
//        
//        INPUT.nextLine();//int xboleh baca alphabet
//                         //change to read string again from integer                    
//        
//        System.out.print("Enter your student id: ");
//        student_id = INPUT.nextLine();
//        INPUT.close();
//        
//        //print name and age to the console
//        System.out.println("Name :" + name);
//        System.out.println("Age  :" + age);
//        System.out.println("Student id  :" + student_id);
//    }
//}

//import java.io.*; //"*" means all
//public class Main{
//    public static void main(String[] args) throws IOException{ //if wrong must be handled
//        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
//                  //converts the byte stream into a character stream
//                  //stdin is custom name
//        int mark;
//        
//        System.out.print("Enter mark: ");
//        mark = Integer.parseInt(stdin.readLine()); //nextline = readline
//    }          //Integer.parseInt() convert to integer
//}

//import javax.swing.JOptionPane;  //POP UP Animate
//public class Addition{
//    public static void main(String[]args){
//        String firstNumber;
//        String secondNumber;
//        int num1,num2,sum;
//        
//        firstNumber = JOptionPane.showInputDialog("Enter first integer");
//        secondNumber = JOptionPane.showInputDialog("Enter second integer");
//        
//        num1 = Integer.parseInt(firstNumber);
//        num2 = Integer.parseInt(secondNumber);
//        sum = num1 + num2;
//        
//        JOptionPane.showMessageDialog(null, "The sum is "+sum,"Results",JOptionPane.PLAIN_MESSAGE);
//        System.exit(0);
//
//    }
//}

//----T a s k  1 ---------------------------
//
//import java.util.Scanner;
//public class ArithmetiProg{ 
//    public static void main(String[] args){ 
//        int num1,num2,Addition,Subtraction,Multiplication,Division,Modulus,Increment,Decrement;
//        
//        Scanner INPUT = new Scanner(System.in);
//        
//        //Read a integer from the console
//        System.out.print("Enter number 1: ");
//        num1 = INPUT.nextInt();
//                
//        //Read a integer from the console
//        System.out.print("Enter number 2: ");
//        num2 = INPUT.nextInt();
//        
//        //formula to calculate
//        Addition = num1 + num2;
//        Subtraction = num1 - num2;
//        Multiplication = num1 * num2;
//        Division = num1 / num2;
//        Modulus = num1 % num2;
//        Increment = ++num1;
//        Decrement = --num2;
//        
//        //print all calculate value
//        System.out.println("Addition: " + Addition);
//        System.out.println("Subtraction: " + Subtraction);
//        System.out.println("Multiplication: " + Multiplication);
//        System.out.println("Division: " + Division);
//        System.out.println("Modulus: " + Modulus);
//        System.out.println("Increment num 1: " + Increment);
//        System.out.println("Decrement num 2: " + Decrement);
//    }
//}   

//----T A S K  2----------------------------------

//import java.util.Scanner;
//public class InputUser {
//    public static void main(String[] args){ 
//        
//        String name,hobby,favourite_food;
//        int age;
//        Scanner INPUT = new Scanner(System.in); 
//        
//        //Read a single line from the console
//        System.out.print("Enter your name: ");
//        name = INPUT.nextLine();
//
//        //Read a integer from the console
//        System.out.print("Enter your age: ");
//        age = INPUT.nextInt();   
//        
//        INPUT.nextLine();//change to read string again
//        
//        //Read a single line from the console
//        System.out.print("Enter your hobby: ");
//        hobby = INPUT.nextLine(); 
//        
//        //Read a single line from the console
//        System.out.print("Enter your favourite food: ");
//        favourite_food = INPUT.nextLine(); 
//        
//        INPUT.close();
//        
//        System.out.println("Name :" + name);//print name
//        System.out.println("Age  :" + age);//print age
//        System.out.println("Hobby  :" + hobby);//print hobby
//        System.out.println("Favourite food  :" + favourite_food);//print food
//    }
//}


//--- T A S K  3 -----------------------------

//import java.util.Scanner;
//public class CalculateAge{
//    public static void main(String[]args){
//        int age,birthyear,currentyear = 2024;
//        
//        Scanner INPUT = new Scanner(System.in);
//
//        //Read a integer from the console
//        System.out.print("Enter your birth year: ");
//        birthyear = INPUT.nextInt();
//        INPUT.close(); 
//
//        age = currentyear - birthyear;//calculate age
//
//        System.out.println("Your age is: " + age);//print age       
//    }
//}

//--- T A S K  4 -----------------------------
//
//import java.util.Scanner;
//public class CalculateMark{
//    public static void main(String[]args){
//        String name,id,subject;
//        float test1,test2,average;
//        Scanner INPUT = new Scanner(System.in);
//
//        //Read a single line from the console
//        System.out.print("Enter your name: ");
//        name = INPUT.nextLine();
//
//        //Read a single line from the console
//        System.out.print("Enter your ID: ");
//        id = INPUT.nextLine();
//
//        //Read a single line from the console
//        System.out.print("Enter your subject: ");
//        subject = INPUT.nextLine();
//        
//        //Read a float from the console
//        System.out.print("Enter Test1 marks (/100): ");
//        test1 = INPUT.nextFloat();
//
//        //Read a float from the console
//        System.out.print("Enter Test2 marks (/100): ");
//        test2 = INPUT.nextFloat();
//        INPUT.close();
//
//        average = (test1 + test2) / 2;//calculate average
//
//        System.out.println("Name: " + name);//print name
//        System.out.println("ID: " + id);//print id
//        System.out.println("Subject: " + subject);//print subject
//        System.out.println("Average Mark: " + average);//print average mark
//    }
//}

//--- T A S K  5 -----------------------------

//import java.util.Scanner;
//public class CalculatePrice{
//    public static void main(String[]args){
//        String itemname;
//        int quantity;
//        float price,discountrate,total,afterprice;
//        
//        Scanner INPUT = new Scanner(System.in);
//        
//        //Read a single line from the console
//        System.out.print("Enter item name: ");
//        itemname = INPUT.nextLine();
//        
//        //Read a float from the console
//        System.out.print("Enter price: ");
//        price = INPUT.nextFloat();
//        
//        //Read a integer from the console
//        System.out.print("Enter quantity: ");
//        quantity = INPUT.nextInt();
//        
//        //Read a float from the console
//        System.out.print("Enter discount rate: ");
//        discountrate = INPUT.nextFloat();
//        INPUT.close();
//        
//        total = price * quantity; //calculate total
//        afterprice = total*(100-discountrate)/100;//calculate price after discount
//        
//        System.out.println("Item name: " + itemname);//print name
//        System.out.println("Price: RM" + price);//print price
//        System.out.println("Quantity: " + quantity);//print quantity
//        System.out.println("Total price: RM" + total);//print total
//        System.out.println("Discount rate: " + discountrate + "%"); //print rate
//        System.out.println("Price after discount: RM" + afterprice);//print after discount
//    }
//}

//--- T A S K  6 -----------------------------

//import java.util.Scanner;
//public class CalculateBMI{
//    public static void main(String[]args){
//        float bmi,weight,height;
//        Scanner INPUT = new Scanner(System.in);
//
//        //Read a float from the console
//        //and stores into name variable
//        System.out.print("Enter your weight in kg: ");
//        weight = INPUT.nextFloat();
//
//        //Read a float from the console
//        //and stores into name variable
//        System.out.print("Enter your height in meters: ");
//        height = INPUT.nextFloat();
//        INPUT.close();
//
//        bmi = weight / (height * height);//calculate BMI
//
//        System.out.println("Your BMI is: " + bmi);//Print BMI
//   }
//}

//--- T A S K  7 -----------------------------

//public class CompoundProg {
//    public static void main(String[] args) {
//        int x = 5;
//        int preIncrement, preDecrement, postIncrement, postDecrement;
//
//        System.out.println("x: " + x);
//
//        preIncrement = ++x;
//        
//        x = 5;// Reset x to 5 for the next operation
//        postIncrement = x++;
//        
//        x = 5;// Reset x to 5 for the next operation
//        preDecrement = --x;
//        
//        x = 5;// Reset x to 5 for the next operation
//        postDecrement = x--;
//
//        //print all the increment and decrement with explaination
//        System.out.println("After Pre-increment : " + preIncrement + ", x = 6");
//        System.out.println("x becomes 6, preIncrement is 6\n");
//        
//        System.out.println("After Post-increment : " + postIncrement + ", x = 6");
//        System.out.println("postIncrement is 5, then x becomes 6\n");
//        
//        System.out.println("After Pre-decrement : " + preDecrement + ", x = 4");
//        System.out.println("x becomes 4, preDecrement is 4\n");
//        
//        System.out.println("After Post-decrement : " + postDecrement + ", x = 4");
//        System.out.println("postDecrement is 5, then x becomes 4\n");
//    }
//}


//-------- I F   E L S E   S W I T C H ----------------------------------------

//import java.util.Scanner;      //use scanner function
//public class KISmark {         //class name is KISmark set to public
//    public static void main(String[] args) {
//        int latenumber = 0,KIS = 10;//integer data type
//        float deductmark = 0.3f, minuskis=0, remainkis=0;//float data type
//        
//        Scanner INPUT = new Scanner(System.in);//add name INPUT to scanner
//        
//        System.out.print("Enter late number: ");//instruction to enter data
//        latenumber = INPUT.nextInt();//keep data in latenumber variable
//        
//        if(latenumber >3){//add condition to if statement
//            minuskis = latenumber*deductmark;//calculate minuskis
//            System.out.println("Total deduct KIS mark : " + minuskis);
//            remainkis = KIS - minuskis;//calculate remainkis
//            System.out.println("Remaining KIS mark : " + remainkis);
//        }        
//    }
//}

	
//import java.util.Scanner;     
//public class ifDemo{         
//    public static void main(String[] args) {
//        int grade;
//        
//         huruf kecil,jgn sama
//                  ⬇️
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter grade: ");
//        grade = input.nextInt();
//        
//        if(grade >=60)   //kalau xjadi buang pagar
//            System.out.println("Passed");
//        else
//            System.out.println("Failed");           
//    }
//}

//import java.util.Scanner;     
// class SwitchDemo{    //xde public means default     
//    public static void main(String[] args) {
//        int month = 4;
//        
//        switch(month){
//            case 1 : System.out.println("January"); break; 
//            case 2 : System.out.println("February"); break; 
//            case 3 : System.out.println("March"); break; 
//            case 4 : System.out.println("April"); break; 
//            case 5 : System.out.println("May"); break; 
//            case 6 : System.out.println("June"); break; 
//            case 7 : System.out.println("July"); break; 
//            case 8 : System.out.println("August"); break;
//            case 9 : System.out.println("September"); break;
//            case 10: System.out.println("October"); break;
//            case 11: System.out.println("November"); break;
//            case 12: System.out.println("December"); break; 
//            default: System.out.println("Invalid month.");break; 
//        }  
//    }
//}






































