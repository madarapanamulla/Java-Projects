import java.util.Scanner;


public class exercise {
    public static void main(String[] args){

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        Scanner scanner = new Scanner(System.in);

    double result= 0;
    double a;
    double b;
    double c;

    System.out.println("Math examples:");
        System.out.println("Power: " + Math.pow(2, 5));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("Absolute: " + Math.abs(-15));
        System.out.println("Ceil: " + Math.ceil(4.2));
        System.out.println("Floor: " + Math.floor(4.7));
        System.out.println("Max: " + Math.max(5, 10));
        System.out.println("Min: " + Math.min(5, 10));
        System.out.println("Round: " + Math.round(4.6));



    System.out.println(result);

    System.out.println("Enter the leangth of side A: ");
    a = scanner.nextDouble();

    System.out.println("Enter the lenght of side B: ");
    b = scanner.nextDouble();

    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    System.out.println("The lenght of the side C is: " + c);

        scanner.close();


    }
}
