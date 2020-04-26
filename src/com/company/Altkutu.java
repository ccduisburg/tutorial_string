package com.company;

public class Altkutu extends Kutu {
    double agr;

    Altkutu(double e, double b, double y, double agr) {
        super(e, b, y);
        en = e;
        boy = b;
        yukseklik = y;
        agr = agr;
    }
    void alanHesaple(){
        System.out.println(6*en*boy);
    }
}
