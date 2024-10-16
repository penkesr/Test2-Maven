package org.example;

public class Task216Oct {

    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            System.exit(1);  // Exit with non-zero status indicating an error
        }

        try {
            // Parse the arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Use ternary operator to find the maximum number
            int max = (num1 > num2) ? num1 : num2;

            // Print the maximum number
            System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + max);

        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as arguments.");
            System.exit(1);  // Exit with non-zero status indicating an error
        }
    }
}

