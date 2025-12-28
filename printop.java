public class printop {
    public static void main(String[] args){


        //printf() = is a method used to print formatted text to the console
        //%[flags][precision][width][.precision][specifier-character]
        //[flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in parentheses
        // space = leave a space before positive numbers, display minus sign if negative


        String name = "Garfield";
        char firstLetter = 'G';
        int age = 5;
        double height = 30.25;
        boolean isLazy = true;

        System.out.printf("Hello %S\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Lazy: %b\n", isLazy);


        System.out.printf("%s is %d years old", name, age);

        //[width]
        // 0 = zero padding
        // number = right justified padding spaces
        // negative number = left justified padding spaces

        String id1 = "*";
        String id2 = "**";
        String id3 = "***";
        String id4 = "****";

        System.out.printf("%4s\n", id1);
        System.out.printf("%4s\n", id2);
        System.out.printf("%4s\n", id3);
        System.out.printf("%4s\n", id4);

    }
}
