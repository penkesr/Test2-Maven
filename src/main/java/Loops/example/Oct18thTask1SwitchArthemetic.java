package Loops.example;

import java.util.Scanner;

public class Oct18thTask1SwitchArthemetic {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input: First number
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            // Input: Operator (+, -, *, /, %)
            System.out.print("Enter an operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // Input: Second number
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Switch statement to perform the calculation
            switch (operator) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    } else {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }

            scanner.close();
        }
    }


