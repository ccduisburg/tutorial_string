package com.company;

public class Konto {
    private int ktnummer;
    private static double ktStand;

    public double getKtStand() {
        return ktStand;
    }

    public static void setKtStand(double ktStand) {
        Konto.ktStand = ktStand;
    }

    public  void einzahlen(double miktar){
        setKtStand(this.getKtStand()+miktar);
    }

    public Konto() {
    }
}
