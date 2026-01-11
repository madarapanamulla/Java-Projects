import java.util.Scanner;


public class tempApp {
    public static void main(String[] args){

        //Temparature conversion program using ternary operator

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        //(condition) ? true : false;

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);

       // System.out.println(temp);
        //System.out.println(unit);

        scanner.close();


    }
    
 }
