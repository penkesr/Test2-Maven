package org.example;

public class NonPremitiveDatatype {
    public static void main(String[] args) {
        System.out.println("***First NonPremistive DataType***");
        String fullname = "\n*********Sandhya Rani Penke***********";
        System.out.println("The value of $$string$$ variable is fullname: " + fullname);


        //        Classes (Objects)
        // Syntax: class ClassName { // properties and methods }

        System.out.println("\n ***Second NonPremistive DataType***");
        int[] numbers = {1, 2, 3, 4, 5};
        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nThe Array list are numbers[i]"+ numbers[i]);
        }
    }
}