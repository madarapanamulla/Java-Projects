import java.util.Random;



public class generate {
    public static void main(String[] args) {
        // This is a placeholder for the Random class.
        System.out.println("This is the Random class.");

        Random random = new Random();

        int number1;
        int number2;
        int number3;


        boolean isHeads;

        isHeads = random.nextBoolean();

      if(isHeads){
            System.out.println("It's HEADS");
        }else{
            System.out.println("It's TAILS");
        }


        number1 = random.nextInt(1, 100);
        number2 = random.nextInt(1, 250);
        number3 = random.nextInt(1, 6);
        System.out.println("Random number: " + number1);
        System.out.println("Random number: " + number2);
        System.out.println("Random number: " + number3);

    }
       

}
