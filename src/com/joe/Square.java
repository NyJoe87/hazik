package com.joe;

/**
 * implementaljuk a shape interface-t
 * emiatt kotelezoen megvalositjuk a kerulet es terulet metodusokat
 */
public class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    /**
     * az override annotacio nem kotelezo
     * de jelzi hogy override-olunk/felulirunk egy metodust
     * @return
     */
    @Override
    public double kerulet() {
        return 4 * a;
    }

    @Override
    public double terulet() {
        return a * a;
    }
}
