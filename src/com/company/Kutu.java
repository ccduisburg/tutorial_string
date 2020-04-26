package com.company;

public class Kutu {
    double en;
    double boy;
    double yukseklik;

    void hacim(){
        System.out.println(en*boy*yukseklik);
    }

    Kutu(Kutu ob) {
        en = ob.en;
        boy = ob.boy;
        yukseklik = ob.yukseklik;
    }

    Kutu(double e, double b, double y) {

        en = e;
        boy = b;
        yukseklik = y;

    }
}
