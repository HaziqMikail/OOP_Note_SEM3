import java.util.Scanner;     //pergi library nama Scanner 
public class ArithmeticOperator {   //class name      
    public static void main(String[] args) {
        float num1,num2,result;
        int choice;
        
        Scanner input = new Scanner(System.in);//object nama input bagi scanner
        
        System.out.println("Arithmetic Operator:");//display choice 1-5
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus: ");
        
        System.out.print("Enter your choice (1-5): ");//pilih operator
        choice = input.nextInt();//nextLine,nextInt,NextDouble,nextFloat = input string type
        
        switch(choice){
            case 1:
                System.out.print("Enter first number: ");//input num1
                num1 = input.nextFloat();

                System.out.print("Enter second number: ");//input num2
                num2 = input.nextFloat();
                
                result = num1 + num2; //tambah nombor
                System.out.println("Result: " + result);break;   
            case 2:
                System.out.print("Enter first number: ");//input num1
                num1 = input.nextFloat();

                System.out.print("Enter second number: ");//input num2
                num2 = input.nextFloat();
                
                result = num1 - num2; //tolak nombor
                System.out.println("Result: " + result);break;
            case 3:
                System.out.print("Enter first number: ");//input num1
                num1 = input.nextFloat();

                System.out.print("Enter second number: ");//input num2
                num2 = input.nextFloat();
                
                result = num1 * num2; //darab nombor
                System.out.println("Result: " + result);break;
            case 4:
                System.out.print("Enter first number: ");//input num1
                num1 = input.nextFloat();

                System.out.print("Enter second number: ");//input num2
                num2 = input.nextFloat();
                
                if (num2 == 0) { //nombor xboleh bahagi dengan 0
                    System.out.println("Number can't be divided by 0");
                } 
                else { //bahagi nombor
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            case 5:
                System.out.print("Enter first number: ");//input num1
                num1 = input.nextFloat();

                System.out.print("Enter second number: ");//input num2
                num2 = input.nextFloat();
                
                result = num1 % num2; //baki lepas bahagi
                System.out.println("Result: " + result);break;
            default: //kalau pilihan bukan 1-5 jadi default
                System.out.println("Choose 1-5");break;
        }
                
    }
}
