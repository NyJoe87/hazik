package com.joe;

public class Circle {
    double radius;

    // nincs visszateresi tipusa es a neve megeggyezik az osztaly nevevel
    Circle(double r) {
        radius = r;
    }

    public double kerulet() {
        return 2 * radius * Math.PI;
    }

    public double terulet() {
        return radius * radius * Math.PI;
    }
}
