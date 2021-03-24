package com.joe;

public class Circle implements Shape {
    double radius;

    // nincs visszateresi tipusa es a neve megeggyezik az osztaly nevevel
    Circle(double r) {
        radius = r;
    }

    @Override
    public double kerulet() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double terulet() {
        return radius * radius * Math.PI;
    }
}
