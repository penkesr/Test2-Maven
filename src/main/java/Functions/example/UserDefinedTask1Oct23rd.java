package Functions.example;
import java.util.Scanner;

public class UserDefinedTask1Oct23rd {
              public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Taking user input for the first and second numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calling all the functions with user inputs
            // 1. Without Parameters and Without return Type
            add(num1, num2);

            // 2. Without Parameters and with return Type
            String result = sub(num1, num2);
            System.out.println(result);

            // 3. With Parameters and Without return Type
            multiply(num1, num2);

            // 4. With Parameters and With return Type
            int divisionResult = divide(num1, num2);
            System.out.println("Division Result: " + divisionResult);

            // Close the scanner
            scanner.close();
        }

        // 1. Without Parameters and Without return Type
        static void add(int a, int b) {
            int c = a + b;
            System.out.println("Value of a + b is: " + c);
        }

        // 2. Without Parameters and with return Type
        static String sub(int a, int b) {
            int c = a - b;
            return "Value of a - b is: " + c;
        }

        // 3. With Parameters and Without return Type
        static void multiply(int a, int b) {
            int result = a * b;
            System.out.println("Multiplication of a * b is: " + result);
        }

        // 4. With Parameters and With return Type
        static int divide(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
        }
    }
