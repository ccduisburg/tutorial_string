package com.company;

public class SparKonto extends Konto {

    void ausZahlun(double miktar){
     setKtStand(getKtStand()-miktar);
    }


}
