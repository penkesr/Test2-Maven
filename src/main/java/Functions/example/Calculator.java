package Functions.example;
import java.util.Scanner;

public class Calculator {
           // Function to perform addition
        public static void sum(int a, int b) {
            System.out.println("Sum: " + (a + b));
        }

        // Function to perform subtraction
        public static void sub(int a, int b) {
            System.out.println("Subtraction: " + (a - b));
        }

        // Function to perform multiplication
        public static void mul(int a, int b) {
            System.out.println("Multiplication: " + (a * b));
        }

        // Function to perform division
        public static void div(int a, int b) {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();

            // Calling the functions with parameters
            sum(a, b);
            sub(a, b);
            mul(a, b);
            div(a, b);

            scanner.close();
        }
    }

