package com.company;

public class Baby2 {
    String adsoyad;
    static int yas;
    int boy;
    int agirlik;
    static Baby2 bebek1 = new Baby2();
    static Baby2 bebek2 = new Baby2();

    public static void main(String[] args) {
        bebek1.yas=1;
        degistir();
    }
    static void degistir() {
        bebek1.yas=2;
        bebek2.yas=5;
        System.out.println(bebek1.yas);
        System.out.println(bebek2.yas);
    }
}
