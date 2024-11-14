
//---------------Exercise 1-------------------------------------
//import java.util.Scanner;     
//public class displayname {         
//    public static void main(String[] args) {
//        String fname,lname;
//      
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Input your first name: ");
//        fname = input.nextLine();
//        
//        System.out.print("Input your last name: ");
//        lname = input.nextLine();
//           
//        System.out.print("Hello");
//        System.out.print("\n" + fname +" "+ lname);
//        
//    }
//}

//----------------Exercise 2---------------------------------------
//import java.util.Scanner;     
//public class calculations {         
//    public static void main(String[] args) {
//       int calc1,calc2,calc3,calc4;
//       
//       calc1 = (-5 + 8 * 6);
//       calc2 = ((55 + 9) % 9);
//       calc3 = (20 + -3 * 5 / 8);
//       calc4 = (5 + 15 / 3 * 2 - 8 %3);
//
//       System.out.print("\nHere are some calculations\n");
//       
//       System.out.print("\n-5 + 8 * 6             : " + calc1);
//       System.out.print("\n(55 + 9) % 9           : " + calc2);
//       System.out.print("\n20 + -3 * 5 / 8        : " + calc3);
//       System.out.print("\n5 + 15 / 3 * 2 - 8 % 3 : " + calc4 + "\n");             
//    }
//}

//-----------------Exercise 3---------------------------------------
import java.util.Scanner;     
public class miniprogram {         
    public static void main(String[] args) {
        int choice = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Converter available :");
        System.out.print("\n1. Currency converter (MYR - YEN)");
        System.out.print("\n2. Mass converter (kg- grams)");
        System.out.print("\n3. Temperature converter (C - F)");        
        System.out.print("\nChoose your converter : ");
        choice = input.nextInt();       
        
        switch(choice){
            case 1:
                float sum,total;

                System.out.print("Insert Amount/Quantity : RM ");
                sum = input.nextFloat();                
                
                total = sum * 32.35f;
                
                System.out.print("RM" + sum + " = " + total + " JPY\n");

                break;
                
            case 2:
                float grams,kg = 0;
                
                System.out.print("Insert Amount/Quantity :  ");
                kg = input.nextFloat(); 
                
                grams = kg * 1000;
                
                System.out.print(kg + " kilograms = " + grams + " grams\n");
                break;
                
            case 3:
                float Cel,Far;
                
                System.out.print("Insert Amount/Quantity :  ");
                Cel = input.nextFloat();                
                
                Far = (Cel * 9/5) + 32;
                
                System.out.print(Cel + " celsius = " + Far + " fahrenheit\n");
                break;
                
            default:
                System.out.println("Invalid choice. Please select 1-3 only.");
                break;
        }                 
    }
}























