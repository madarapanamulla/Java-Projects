public class ternaryOp {

    public static void main(String[] args){

        //Ternary operator? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 50;
        int number = 3;
        int hours = 13;
        int income = 3000;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        String evenOrOdd = (number %2 == 0) ? "Even" : "Odd";
        double taxRate = (income >=4000) ? 0.25 : 0.15;

        System.out.println(evenOrOdd);
        System.out.println(passOrFail);
        System.out.println(timeOfDay); 
        System.out.println(taxRate);




    }
    
}
