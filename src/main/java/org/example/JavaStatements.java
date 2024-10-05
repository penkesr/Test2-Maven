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
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
