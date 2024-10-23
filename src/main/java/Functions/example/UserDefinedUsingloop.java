package Functions.example;

public class UserDefinedUsingloop {
    public static void main(String[] args) {
        // Calling all the functions
        // 1. Without Parameters and Without return Type
        forloop();

        // 2. Without Parameters and with return Type
       int result = whileloop();
        System.out.println("******WhileLoop******: " + result);

        // 3. With Parameters and Without return Type
        //multiply(20, 30);

        // 4. With Parameters and With return Type
       // int divisionResult = divide(100, 20);
       // System.out.println("Division Result: " + divisionResult);
    }
    // 1. Without Parameters and Without return Type
    static void forloop() {
        int i = 0;
        for (i = 0; i <= 5; i++) {
            System.out.println("***The series of numbers using for loop is " + i);
        }
    }
        // 2. Without Parameters and with return Type
        static int whileloop() {
        int j = 0;
        while (j <= 5) {
            System.out.println("The series of numbers j using while loop: " + j);
            j++;  // Incrementing inside the loop
        }
        return j;
    }

    }

