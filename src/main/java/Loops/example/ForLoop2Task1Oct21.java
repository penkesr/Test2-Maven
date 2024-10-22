package Loops.example;

public class ForLoop2Task1Oct21 {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        for (; number != 0; number = number / 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}