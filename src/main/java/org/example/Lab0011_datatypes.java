package org.example;

import org.apache.xpath.operations.Bool;

public class Lab0011_datatypes {
    public static void main(String[] args) {
        //Primitive - System defined
        int i = 2147483647;
        float f = 3.4028235E3F;
        boolean b = true;
        char c = 'S';
        byte by = 127;
        short s = 32767;

        System.out.println("*****The Primitive Datatyes are below once*****");
        System.out.println("1.int value is "+i);
        System.out.println("2.float value is "+f);
        System.out.println("3.boolean value is "+b);
        System.out.println("4.char value is "+c);
        System.out.println("5.byte value is "+by);
        System.out.println("6.short value is "+s);


        System.out.println("*****The Non-Primitive Datatyes are below once-Class- Object-Array-Interface-Enum-String*****");

        // Non Primitive - User defined
        //Class- Object-Array-Interface-Enum-String
        String MyName = "SANDAHYA RANI PENKE";
        System.out.println("1.String Value is "+MyName);
    }
}