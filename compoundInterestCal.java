import java.util.Scanner;

public class compoundInterestCal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interrest rate (in %): ");
        rate =scanner.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.println("The amount after " + years + " years is: $" + amount);



        scanner.close();

    }
    
}
