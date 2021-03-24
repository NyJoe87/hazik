package com.joe;

// altalam letrehozott uj tipus
public class Tort {
    //mezok
    int szamlalo;
    int nevezo;

    //olyan kodreszlet ami letrehozaskor fut le
    Tort(int sz, int n) {
        szamlalo = sz;
        nevezo = n;
    }

    public double oszt() {
        return (double) szamlalo / (double) nevezo;
    }

    public Tort add(Tort other) {
        int a = this.szamlalo;
        int b = this.nevezo;
        int c = other.szamlalo;
        int d = other.nevezo;
        Tort result = new Tort(a * b + c * d,d * b);
        return result;
    }
}
