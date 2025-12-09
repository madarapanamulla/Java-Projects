import java.util.Scanner;


public class shoppingcart { 
    public static void main(String[] args) {
        //shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy");
        item = scanner.nextLine();

        System.out.println("How much for a each");
        price = scanner.nextDouble();
    
        System.out.println("How many would you like to buy");
        quantity = scanner.nextInt();


        total = price * quantity;


        System.out.println("\nYou have ordered  " + quantity + " " + item + "(s) at a price of " + price + " " + currency);
        
        System.out.println("Your total is " + total + " " + currency);

        scanner.close();
    
    }

}
