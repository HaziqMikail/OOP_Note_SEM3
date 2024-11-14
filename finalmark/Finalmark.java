import java.util.Scanner;     //pergi library nama Scanner 
public class Finalmark{  //class name       
    public static void main(String[] args) {
        int mark;   //integer data type
        char grade; //char data type
        
        Scanner input = new Scanner(System.in);//object nama input bagi scanner
        
        System.out.print("Enter mark: ");//user enter mark
        mark = input.nextInt(); //keep user input in 'mark' variables , nextLine,nextInt,NextDouble,nextFloat = input string type
        
        if(mark >=80)     //if >=80 grade set to A
            grade = 'A';
        else if(mark >=70)//if >=70 grade set to B
            grade = 'B';
        else if(mark >=60)//if >=60 grade set to C
            grade = 'C';
        else if(mark >=50)//if >=50 grade set to D
            grade = 'D';
        else if(mark >=40)//if >=40 grade set to E
            grade = 'E';
        else
            grade = 'F';  //if <40 grade set to F
               
        System.out.println("Your grade is: " + grade);//print statement
    }
}
