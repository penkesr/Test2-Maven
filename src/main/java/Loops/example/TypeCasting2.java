package Loops.example;

public class TypeCasting2 {
    public static void main(String[] args) {


        System.out.println("******Widening example*****");
        //Widening example
        int num = 10;
        double d = num;  // Automatic casting from int to double
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + d);

      //Narrowing example
        System.out.println("******Narrowing example*****");
                double e = 9.7;
                int num1 = (int) d;  // Explicit casting from double to int
                System.out.println("Double value: " + e);
                System.out.println("Integer value (after casting): " + num1);
            }
        }
