//import java.util.Scanner; //pergi library nama Scanner 
//public class Discountprogram{ //class name
//    public static void main(String[]args){
//        String itemname,colorcode;
//        int quantity;
//        float price,total,discountrate=0,afterprice;
//        
//        Scanner input = new Scanner(System.in);//object nama input bagi scanner
//        
//        System.out.print("Enter item name: ");
//        itemname = input.nextLine();//nextLine,nextInt,NextDouble,nextFloat = input string type
//        
//        //Read a float from the console
//        System.out.print("Enter price: ");
//        price = input.nextFloat();
//        
//        //Read a integer from the console
//        System.out.print("Enter quantity: ");
//        quantity = input.nextInt();
//        
//        //Read a string from the console
//        System.out.print("Enter color code: ");
//        colorcode = input.nextLine();
//        
//        System.out.println("\nDiscount Rate per color:");//display discount
//        System.out.println("1. Red (10%)");
//        System.out.println("2. Blue (30%)");
//        System.out.println("3. Green (50%)");
//        System.out.println("4. Yellow (70%)");
//
//        System.out.print("\nEnter your choice (1-4): ");//read input 
//        int choice = input.nextInt();
//        input.close();
//
//        switch (choice) {//determine discount base on color user input
//            case 1:
//                discountrate = 10f;break; // 10% discount
//            case 2:
//                discountrate = 30f;break; // 30% discount
//            case 3:
//                discountrate = 50f;break; // 50% discount
//            case 4:
//                discountrate = 70f;break; // 70% discount                
//            default:
//                System.out.println("Enter number 1-4.");
//        }
//        
//        total = price * quantity; //calculate total
//        afterprice = total*(100-discountrate)/100;//calculate price after discount
//        
//        System.out.println("\nItem name: " + itemname);//print name
//        System.out.println("Price: RM" + price);//print price
//        System.out.println("Quantity: " + quantity);//print quantity
//        System.out.println("Total price: RM" + total);//print total
//        System.out.println("Discount rate: " + discountrate + "%"); //print rate
//        System.out.println("Price after discount: RM" + afterprice);//print after discount
//    }
//}










import java.util.Scanner; // Import Scanner library

public class Discountprogram { // Class name
    public static void main(String[] args) {
        String itemname, colorcode;
        int quantity = 0; // Initialize quantity to avoid issues if input is invalid
        float price = 0, total, discountrate = 0, afterprice;

        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        // Get item name
        System.out.print("Enter item name: ");
        itemname = input.nextLine(); // Read item name as a string

        // Handle invalid price input using try-catch block
        while (true) {
            try {
                System.out.print("Enter price: ");
                price = input.nextFloat(); // Read price as float
                if (price < 0) {
                    System.out.println("Price cannot be negative. Please enter a valid price.");
                } else {
                    break; // Exit loop if input is valid
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid price.");
                input.nextLine(); // Clear the invalid input
            }
        }

        // Handle invalid quantity input using try-catch block
        while (true) {
            try {
                System.out.print("Enter quantity: ");
                quantity = input.nextInt(); // Read quantity as integer
                if (quantity < 0) {
                    System.out.println("Quantity cannot be negative. Please enter a valid quantity.");
                } else {
                    break; // Exit loop if input is valid
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid quantity.");
                input.nextLine(); // Clear the invalid input
            }
        }


        // Display discount options
        System.out.println("\nDiscount Rate per color:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (30%)");
        System.out.println("3. Green (50%)");
        System.out.println("4. Yellow (70%)");


        int choice = 0;
        while (true) {
            try {
                System.out.print("\nEnter your choice (1-4): ");
                choice = input.nextInt(); // Read the user's discount choice
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
                } else {
                    break; // Exit loop if input is valid
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                input.nextLine(); // Clear the invalid input
            }
        }
        input.close(); // Close the scanner after input is done

        // Determine discount rate based on color choice
        switch (choice) {
            case 1:
                discountrate = 10f; break; // 10% discount
            case 2:
                discountrate = 30f; break; // 30% discount
            case 3:
                discountrate = 50f; break; // 50% discount
            case 4:
                discountrate = 70f; break; // 70% discount                
            default:
                System.out.println("Enter number 1-4.");
        }

        // Calculate total and price after discount
        total = price * quantity; // Calculate total price
        afterprice = total * (100 - discountrate) / 100; // Calculate price after discount

        // Display the results
        System.out.println("\nItem name: " + itemname);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: RM" + total);
        System.out.println("Discount rate: " + discountrate + "%");
        System.out.println("Price after discount: RM" + afterprice);
    }
}

