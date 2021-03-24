package com.joe;

public class TortTeszt {
    public static void main(String[] args) {
        // itt tortenik a konstruktor hivasa
        // itt hozzuk letre a peldanyt
        // peldany = konkret dolog
        // osztaly = absztrakcio
        //tipus-peldany nev- new kulcsszo-konstruktor meghivasa
        // "."=tal hivatkozook a fuggvenyre es a mezore is
        Tort t1 = new Tort(4,6);
        System.out.println(t1.szamlalo+"/"+t1.nevezo);
        // fuggveny meghivasa
        System.out.println(t1.oszt());

        Tort t2 = new Tort(5,8);
        System.out.println(t2.oszt());

        System.out.println(t1.add(t2));

    }
}
