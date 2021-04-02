package com.joe;

/**
 * az osztalyok custom tipusok
 * Dog implements Animal-> a kutya egy allat relaciot fejezi ki(is a relationship)
 */
public class Dog implements Animal {
    private String tipus;

    public Dog(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String tipus() {
        return tipus;
    }

    @Override
    public String voice() {
        return "wau wau";
    }

    public void setTipus(String t){
        this.tipus = t;
    }
}

