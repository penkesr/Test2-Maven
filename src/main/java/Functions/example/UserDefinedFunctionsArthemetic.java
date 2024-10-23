package Functions.example;

public class UserDefinedFunctionsArthemetic {
    public static void main(String[] args) {
        // Calling all the functions
        // 1. Without Parameters and Without return Type
        add();

        // 2. Without Parameters and with return Type
        String result = sub();
        System.out.println("Subtraction Result: " + result);

        // 3. With Parameters and Without return Type
        multiply(10, 5);

        // 4. With Parameters and With return Type
        int divisionResult = divide(100, 20);
        System.out.println("Division Result: " + divisionResult);
    }

    // 1. Without Parameters and Without return Type
    static void add() {
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println("Value of a + b is: " + c);
    }

    // 2. Without Parameters and with return Type
    static String sub() {
        int a = 30;
        int b = 20;
        int c = a - b;
        return "Value of a - b is: " + c;
    }

    // 3. With Parameters and Without return Type
    static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of a * b is: " + result);
    }

    // 4. With Parameters and With return Type
    static int divide(int a, int b) {
        return a / b;
    }
}
