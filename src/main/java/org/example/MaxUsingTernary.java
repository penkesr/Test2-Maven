package org.example;

import java.util.Scanner;

    public class MaxUsingTernary {
        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Taking user input for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Using ternary operator to find the maximum
            int max = (num1 > num2) ? num1 : num2;

            // Printing the maximum number
            System.out.println("The maximum number is: " + max);

            // Close the scanner
            scanner.close();
        }
    }