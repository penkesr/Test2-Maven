package Loops.example;

//Typecasting -changing a variable from one datatype to another datatype is called typecasting
public class TypeCasting {
    public static void main(String[] args) {
        //Widening - Implicit , Explicit -lossless
        //Narrowing - Implicit,Explicit (with data type ,loss

        //Widening - Converting small data type to large datatype
        byte b = 10;
        int a = b; // Valid -Implicit Casting - JVM
        int a1 = (int)b; //Valid - Explicit Casting - JVM

        //Narrowing -Converting Large Data type to small
        int val1 = 200;
        //byte b2=val; // Invalid -Implicit -JVM
        byte b3 = (byte)val1; //Invalid - Explicit Casting - User
    }
}
