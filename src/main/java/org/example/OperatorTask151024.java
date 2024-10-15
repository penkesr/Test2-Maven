package org.example;

public class OperatorTask151024 {
    public static void main(String[] args) {

        System.out.println("**************Max amoung 2 numbers using Ternary Operator*****");
        int x =10;
        int y = 20;
        String result = "(x>y) ? x is greater than y : x is less than y ";
        System.out.println(result);

        //Max value amoung 3 numbers
        System.out.println("**************Max amoung 3 numbers using Ternary Operator*****");
        int a = 10, b = 20, c = 15;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max: " + max);

        //Grades of Students
        System.out.println("**************Grades of Students*****");
        int marks = 85;
        String grade = (marks >= 90) ? "A" :
                        (marks >= 80) ? "B" :
                        (marks >= 70) ? "C" :
                        (marks >= 60) ? "D" : "F";

        System.out.println("My Grade is: " + grade);
    }
}
