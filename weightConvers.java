import java.util.Scanner;

public class weightConvers {
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM
        
        //Declering variables
        //welcome message
        //prompt for user choice
        //option 1 convert lbs to kgs
        //option 2 convert kgs to lbs
        //else print not a invalid choice

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();
    
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs: %2f", newWeight);

    } else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs: %2f", newWeight);
    }
    else{
        System.out.println("That is not a valid input");
    
    }

    scanner.close();
}
}
