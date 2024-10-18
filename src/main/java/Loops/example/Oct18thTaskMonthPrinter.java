package Loops.example;
import java.util.Scanner;

public class Oct18thTaskMonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Month number (1-12)
        System.out.print("Enter a number (1-12) for the month: ");
        int month = scanner.nextInt();

        // Switch statement to print the corresponding month name
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
             default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
    }
}
