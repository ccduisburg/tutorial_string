package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
//        Baby shiloh=new Baby("Shiloh bla bla",true);
//        System.out.println(shiloh.name);
//        System.out.println(shiloh.numPoops);
//        shiloh.sayHi();
//        shiloh.eat(1);
//        System.out.println(shiloh.weight);

//        Kutu sperk=new Kutu(3,5,7);
//        sperk.hacim();


        Konto konto =new Konto();
        konto.einzahlen(150);
        GiroKonto grKonto=new GiroKonto();
        SparKonto spKonto=new SparKonto();
        System.out.println(spKonto.getKtStand());
        spKonto.ausZahlun(20);
        System.out.println(spKonto.getKtStand());
        grKonto.auszahlen(20);
        System.out.println(spKonto.getKtStand());
        System.out.println(konto.getKtStand());

    }

}
