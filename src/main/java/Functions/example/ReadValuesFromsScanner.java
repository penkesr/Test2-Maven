package Functions.example;
import java.util.Scanner;

public class ReadValuesFromsScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read integer
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        //Read String
        System.out.println("Enter a String: ");
        String string = scanner.next();
        System.out.println("You entered: " + string);

        //Read Double
        System.out.println("Enter a Double: ");
        double doublevalue = scanner.nextDouble();
        System.out.println("You entered: " + doublevalue);

        //Read Float
        System.out.println("Enter a Float: ");
        Float floatvalue = scanner.nextFloat();
        System.out.println("You entered: " + floatvalue);
   }
}
