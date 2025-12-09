import java.util.Scanner;

public class MathLib {
    public static void main (String[] args){

        //MathLib game

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter one last adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("Here is your story: ");
        System.out.println("Once upon a time, there was a " + adjective1 + " " + noun1 + ".");
        System.out.println("Every day, it would " + adjective2 + verb1 + "  with its friends.");
        System.out.println("They all lived happily in a " + adjective3 + " land.");
         
scanner.close();
    }
}



