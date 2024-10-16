package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingInputsTypes {
    public static void main(String[] args) throws IOException {

        System.out.println("************Read Inputs using Scanner********");
        Scanner scanner = new Scanner(System.in);

        // Taking an integer input by using Scanner
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Taking a string input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("You entered: " + number + " and " + text);

        scanner.close(); // Close the scanner

        System.out.println("************Read Inputs using Arguments********");
        if (args.length > 0) {
            // Print command-line arguments
            System.out.println("First argument: " + args[0]);
            if (args.length > 1) {
                System.out.println("Second argument: " + args[1]);
            }
        } else {
            System.out.println("No arguments provided.");
        }
        System.out.println("************Read Inputs using Console********");
        // Creating console object
        java.io.Console console = System.console();

        if (console != null) {
            // Taking input from the console
            String username = console.readLine("Enter your name: ");
            char[] password = console.readPassword("Enter your password: ");

            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(password));
        } else {
            System.out.println("No console available.");
        }
        System.out.println("************Read Inputs using BufferedReader********");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Taking input as a string
        System.out.print("Enter a string: ");
        String input = reader.readLine();

        // Converting string to an integer
        System.out.print("Enter a number: ");
        int number1 = Integer.parseInt(reader.readLine());

        System.out.println("You entered: " + input + " and " + number1);
    }
}
