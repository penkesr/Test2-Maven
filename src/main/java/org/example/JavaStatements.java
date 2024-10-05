package org.example;

public class JavaStatements {
    public static void main(String[] args) {

        // *** Practicing If -else Statement *** //
        System.out.println("*** Practicing If-else Statement *** ");
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("20 is greater than 18");
        } else
            System.out.println("18 is greater than 20");

        System.out.println("*** Practicing Switch Statement- As day is 4 it is ***");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println("*** Practicing While-Do Statement- Print 0 to 4 ***");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("*** Practicing Do-While Statement- Print 0 to 5 ***");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 6);

        System.out.println("*** Practicing Do-While Statement- Print 10 to 14 ***");
        for (int k = 10; k < 15; k++) {
            System.out.println(k);

            System.out.println("*** Practicing Nested Loops ***");
            // Outer loop.
            for (int a = 100; a <= 102; a++) {
                System.out.println("Outer: " + a); // Executes 2 times

                // Inner loop
                for (int b = 103; b <= 105; b++) {
                    System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)

                    System.out.println("*** Practicing For-Each Loop ***");
                    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                    for (String Carname : cars) {
                        System.out.println(Carname);

                        System.out.println("*** Practicing Break-Continue statements ***");
                        for (int p = 40; p < 45; p++) {
                            if (p == 45) {
                                break;
                            }
                            System.out.println(p);

                            System.out.println("*** Practicing Arrays ***");
                            String[] arraycars = {"Volvo", "BMW", "Ford", "Mazda"};
                            System.out.println(arraycars.length);
                        }
                    }
                }
            }
        }
    }
}