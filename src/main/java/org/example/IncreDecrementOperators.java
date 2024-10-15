package org.example;

public class IncreDecrementOperators {
    public static void main(String[] args) {
        System.out.println("***********PRE Increment*****************");
        int i = 5;
        int result = ++i;  // i is incremented to 6, then result = 6
        System.out.println("i: " + i + ", result: " + result);  // Output: i: 6, result: 6

        //Post increment
        System.out.println("***********POST Increment*****************");
        int j = 5;
        int result4 = j++;  // result = 5, then i is incremented to 6
        System.out.println("j: " + j + ", result4: " + result4);  // Output: i: 6, result: 5

        //Pre-Decrement
        System.out.println("***********Pre Decrement*****************");
        int l = 5;
        int result1 = --l;  // i is decremented to 4, then result = 4
        System.out.println("l: " + l + ", result1: " + result1);  // Output: i: 4, result: 4

        //Post-Decrement
        System.out.println("***********Post Decrement*****************");
        int k = 5;
        int result2 = --k;  // i is decremented to 4, then result = 4
        System.out.println("i: " + k + ", result2: " + result2);  // Output: i: 4, result: 4

        int a = 10, b = 20, c = 15;

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);



        //

    }
}
