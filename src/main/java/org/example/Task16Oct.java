package org.example;
import java.util.Scanner;

public class Task16Oct {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for Name, Age, and Salary
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Salary: ");
        double salary = scanner.nextDouble();

        // Printing the user input values
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);

        // Close the scanner

        scanner.close();
        }
    }

