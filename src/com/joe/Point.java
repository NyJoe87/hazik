package com.joe;

import com.sun.source.tree.BreakTree;

public class Point {
    int x;
    int y;


    public Point(int x, int y) {
        // ebben az esetben this. a mezore mutat
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        //ebben a esetben this. az az obiektum amin meghivtak a fuggvenyt
        double a = p.x - this.x;
        double b = p.y - this.y;
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

}
