package org.example;

public class SpecialCharacters {

           public static void main(String[] args) {
               System.out.println("+++++++++\n NewLine++++++++++++");
               String txt = "Sandhya\nRani\nPenke!";
               System.out.println(txt);
               System.out.println("+++++++\r Carriage Return++++++");
               //\r	Carriage Return
               String txt1 = "Sandhya\rRani\rPenke!";
               System.out.println(txt1);

               System.out.println("+++++++\\t\tTab++++++++");
               //\t	Tab
               String txt2 = "Sandhya\tRani\tPenke!";
               System.out.println(txt2);

               System.out.println("+++++++++\\b\tBackspace++++++++++++");
               //\b	Backspace
               String txt3 = "sAN\bDHYA pENKE!";
               System.out.println(txt3);

               System.out.println("++++++\\f\tForm Feed++++++");
               String txt4 = "sAN\fDHYA\fpENKE!";
               System.out.println(txt4);

           }
               }

