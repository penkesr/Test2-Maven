package org.example;

public class TernaryOperators14 {
    public static void main(String[] args) {
        int a=10;
        int b=11;
        int c=12;
        int result = (a >= b && a >= c) ? a : (b >=c ? b : c);
        System.out.println("The largest number is: " + result);

    }
}
