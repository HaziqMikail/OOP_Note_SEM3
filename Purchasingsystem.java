import java.util.Scanner; //pergi library nama Scanner 
public class Purchasingsystem { //class name
    public static void main(String[] args) {
        String itemName = "",confirmation;        
        int quantity,productChoice;            
        float pricePerItem = 0,totalCost = 0;                   

        Scanner input = new Scanner(System.in);//object nama input bagi scanner

        System.out.println("Welcome to the PakMat Shop!");        
        System.out.println("\nAvailable Food:");// Display available products
        System.out.println("1. Chicken chop - RM20.00 each");
        System.out.println("2. Lamb Chop - RM28.50 each");
        System.out.println("3. Chicken Grill - RM23.50 each");
        System.out.println("4. Mushroom soup - RM8.00 each");

        System.out.print("\nEnter the product number to purchase (1-4): ");//enter choice
        productChoice = input.nextInt();//nextLine,nextInt,NextDouble,nextFloat = input string type

        System.out.print("Enter the quantity: ");//enter quantity
        quantity = input.nextInt();

        switch (productChoice) { //assign price based on choice
            case 1:
                itemName = "Chicken chop";    //if itemname = "Chicken chop"
                pricePerItem = 20.00f;break;  //price = 20.00
            case 2:
                itemName = "Lamb Chop";       //if itemname = "Chicken chop"
                pricePerItem = 28.50f;break;  //price = 28.510 
            case 3:
                itemName = "Chicken Grill";   //if itemname = "Chicken chop"
                pricePerItem = 23.50f;break;  //price = 23.50
            case 4:
                itemName = "Mushroom soup";   //if itemname = "Chicken chop"
                pricePerItem = 8.00f;break;   //price = 8.00               
            default:
                System.out.println("Enter number 1-4");break;
        }

        totalCost = pricePerItem * quantity; // Calculate total cost

        System.out.println("\nOrder Summary:");
        System.out.println("Product: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per item: RM%.2f\n", pricePerItem); 
        System.out.printf("Total cost: RM%.2f\n", totalCost); 

        System.out.print("\nDo you want to proceed with the purchase? (yes/no): ");
        confirmation = input.next();//purchase conformation
        input.close();//close input

        if(confirmation.equalsIgnoreCase("yes"))
            System.out.println("Thank you for your purchase!");        
        else
            System.out.println("Order has been cancelled.");      
    }
}
