package org.example;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.println("+++++++++++++++Ternary Operators+++++++++++++++++++++++++++");
        int h = 10, i = 20;
        //? :: Ternary (returns a value based on a condition in the format condition ? value1 : value2)
        // Using ternary operator to find the maximum of two numbers
        int max = (h > i) ? h : i;
        System.out.println("The maximum value is: " + max);
    }
}