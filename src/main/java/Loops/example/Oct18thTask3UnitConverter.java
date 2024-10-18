package Loops.example;
import java.util.Scanner;

public class Oct18thTask3UnitConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Display conversion options
            System.out.println("Choose a conversion:");
            System.out.println("1 - Kilometers to Miles");
            System.out.println("2 - Fahrenheit to Celsius");

            // Input: User's choice
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();

            // Switch statement to handle conversions based on user's choice
            switch (choice) {
                case 1:
                    // Kilometer to Miles conversion
                    System.out.print("Enter distance in kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double miles = kilometers * 0.621371;
                    System.out.println(kilometers + " km is equal to " + miles + " miles.");
                    break;

                case 2:
                    // Fahrenheit to Celsius conversion
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }

            scanner.close();
        }
    }

