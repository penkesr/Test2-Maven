package org.example;

public class InstanceVariables {
           // Instance variable
          int x = 50;

        public static void main(String[] args) {
            InstanceVariables obj1 = new InstanceVariables();
            InstanceVariables obj2 = new InstanceVariables();
            System.out.println("Instance variable x (obj1): " + obj1.x);
            System.out.println("Instance variable x (obj2): " + obj2.x);

            // Modify instance variable of obj1
            obj1.x = 60;

            System.out.println("Modified instance variable x (obj1): " + obj1.x);
            System.out.println("Instance variable x (obj2): " + obj2.x);
        }
    }

