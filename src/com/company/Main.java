package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
////
//       String firstName = "John";
//       String lastName = "benim adim cemil";
////       // System.out.println(firstName.concat(lastName));
////
////      //  System.out.print(lastName.trim());
//       String newstr=lastName.replace(" ","");
////       // System.out.println(newstr);
////       // System.out.println(lastName.substring(6,10));
////
//      Boolean sonuc=lastName.contains("cemil  ");
////        System.out.println(sonuc);
//
//        // anastas mum satsana
//        //Ein Neger mit Gazelle zagt im Regen nie!
//        String palindrome1="anastas mum satsana";
//        String palindrome2="bla bla bla";
//
//        Boolean sonuc2=lastName.equals("benim adim cemil");
//
////        System.out.println(sonuc2);
//////        for (int i = 0; i <palindrome1.length(); i++) {
//////            System.out.println(i);
//////        }

//         String[] cars={"BMW","PKW","VW","PKW","BMC","LKW"};
//     //    System.out.println(cars[1][0][0]);
//        System.out.println(cars);
//        int[][][] myNum = {{{10, 20},{12}}, {{30, 40}}};
//        //System.out.println(myNum[0][0][1]);
//         for(String i:cars){
//             System.out.println(i);
//         }

//        // Instantiate a Date object
//        Date date = new Date();
//
//        // display time and date using toString()
//        System.out.println(date.toString());
     Person pr1=new Person(11,"cemil","kabakci",new Date(1980));

//
//        System.out.println(pr1.getAdi());
//        System.out.println(pr1.getDogumtarihi());
//        System.out.println(pr1.getSoyadi());
//        System.out.println(pr1.getAdi());
        System.out.println(pr1.toString());


    }


}
