import java.util.Scanner;


public class exercise {
    public static void main(String[] args){

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        Scanner scanner = new Scanner(System.in);

    double result;
    double a;
    double b;
    double c;

    result = Math.pow(2.0, 5.0);
    result = Math.sqrt(25);
    result = Math.abs(-15);
    result = Math.ceil(4.2);
    result = Math.floor(4.7);
    result = Math.max(5, 10);
    result = Math.min(5, 10);
    result = Math.round(4.6);


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
