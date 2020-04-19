package com.company;

import java.util.FormatFlagsConversionMismatchException;

public class Main {

    public static void main(String[] args) {
//
       String firstName = "John";
       String lastName = "benim adim cemil";
//       // System.out.println(firstName.concat(lastName));
//
//      //  System.out.print(lastName.trim());
       String newstr=lastName.replace(" ","");
//       // System.out.println(newstr);
//       // System.out.println(lastName.substring(6,10));
//
      Boolean sonuc=lastName.contains("cemil  ");
//        System.out.println(sonuc);

        // anastas mum satsana
        //Ein Neger mit Gazelle zagt im Regen nie!
        String palindrome1="anastas mum satsana";
        String palindrome2="bla bla bla";

        Boolean sonuc2=lastName.equals("benim adim cemil");

//        System.out.println(sonuc2);
////        for (int i = 0; i <palindrome1.length(); i++) {
////            System.out.println(i);
////        }

         String[] cars={"BMW","WV","BMC" };
         System.out.println(cars[0]);

        int[] myNum = {10, 20, 30, 40};

//         for(String i:cars){
//             System.out.println(i);
//         }

    }
}
