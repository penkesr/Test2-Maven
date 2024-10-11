package org.example;

public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 5;
        //NODMAS rule to calculate the below equations
        System.out.println("+++++++++++++++Arithmetic Operators+++++++++++++++++++++++++++");
        //+: Addition (adds two values)
        System.out.println("Addition: " + (a + b));       // 15
        //-: Subtraction (subtracts one value from another)
        System.out.println("Subtraction: " + (a - b));    // 5
        //*: Multiplication (multiplies two values)
        System.out.println("Multiplication: " + (a * b)); // 50
        //: Division (divides one value by another)
        System.out.println("Division: " + (a / b));       // 2
        //%: Modulus (returns the remainder of a division)
        System.out.println("Modulus: " + (a % b));        // 0

        System.out.println("+++++++++++++++Relational Operators+++++++++++++++++++++++++++");
        int j = 10, k = 5;
        //==: Equal to (checks if two values are equal)
        System.out.println("j == k: " + (j == k)); // false
        //!=: Not equal to (checks if two values are not equal)
        System.out.println("a != b: " + (j != k)); // true
        //>: Greater than (checks if the left value is greater than the right)
        System.out.println("a > b: " + (j > k));   // true
        //<: Less than (checks if the left value is less than the right)
        System.out.println("a < b: " + (j < k));   // false
        //>=: Greater than or equal to
        System.out.println("a >= b: " + (j >= k)); // true
        //<=: Less than or equal to
        System.out.println("a <= b: " + (j <= k)); // false

        System.out.println("+++++++++++++++Logical Operators+++++++++++++++++++++++++++");
        boolean x = true, y = false;
       // &&: Logical AND (returns true if both conditions are true)
        System.out.println("x && y: " + (x && y)); // false
        //||: Logical OR (returns true if at least one condition is true)
        System.out.println("x || y: " + (x || y)); // true
       // !: Logical NOT (reverses the truth value of a condition)
        System.out.println("!x: " + (!x));

        System.out.println("+++++++++++++++Assignment Operators+++++++++++++++++++++++++++");
        int c = 10, d = 5;
        c += d; // c = c + d
        //==: Equal to (checks if two values are equal)
        System.out.println("c += d: " + c); // 15
                c -= d; // a = a - b
        //==: Equal to (checks if two values are equal)
        System.out.println("c -= d: " + c); // 10


        System.out.println("+++++++++++++++Unary Operators+++++++++++++++++++++++++++");
        int e = 10;
        //++: Increment (increases a value by 1)
        System.out.println("++a: " + (++e)); // 11
        System.out.println("a++: " + (e++)); // 11 (post-increment)
        System.out.println("a: " + e);       // 12
        //--: Decrement (decreases a value by 1)
        System.out.println("--a: " + (--e)); // 11
        System.out.println("a--: " + (e--)); // 11 (post-decrement)
        System.out.println("a: " + e);       // 10

        System.out.println("+++++++++++++++Bitwise Operators+++++++++++++++++++++++++++");
        int f = 5, g = 3;
        //&: Bitwise AND (compares each bit and returns 1 if both are 1)
        System.out.println("f & g: " + (f & g)); // 1
        //|: Bitwise OR (compares each bit and returns 1 if at least one is 1)
        System.out.println("f | g: " + (f | g)); // 7
       // ^: Bitwise XOR (returns 1 if the bits are different)
        System.out.println("f ^ g: " + (f ^ g)); // 6
        //~: Bitwise NOT (inverts the bits of a number)
        System.out.println("~f: " + (~f));       // -6

        System.out.println("+++++++++++++++Ternary Operators+++++++++++++++++++++++++++");
        int h = 10, i = 20;
        //? :: Ternary (returns a value based on a condition in the format condition ? value1 : value2)
        // Using ternary operator to find the maximum of two numbers
        int max = (h > i) ? h : i;
        System.out.println("The maximum value is: " + max);

        System.out.println("+++++++++++++++New Operators+++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++Explained in future classes+++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++InstanceOf Operators+++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++Explained in future classes+++++++++++++++++++++++++++");

    }
}

