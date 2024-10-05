package org.example;

public class JavaMath {
    public static void main(String[] args) {
        System.out.println("*** Max of two Numbers [5,10] ***\n");
        System.out.println(Math.max(5, 10));
        System.out.println("*** Min of two Numbers [5,10] ***\n");
        System.out.println(Math.min(5, 10));
        System.out.println("*** SqaureRoot of a Numbers [64] ***\n");
        System.out.println(Math.sqrt(64));
        System.out.println("*** Absolute Value of a Number [4.7] ***\n");
        System.out.println(Math.abs(-4.7));
        System.out.println("*** Random Number ***\n");
        System.out.println(Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
