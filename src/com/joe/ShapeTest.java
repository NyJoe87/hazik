package com.joe;

public class ShapeTest {
    public static void main(String[] args) {
        printShapeDetails(new Circle(5.3));
        printShapeDetails(new Square(3.6));
    }

    public static void printCircleDetails(Circle circle){
        System.out.println(circle.terulet());
        System.out.println(circle.kerulet());
    }

    public static void printSquareDetails(Square square){
        System.out.println(square.terulet());
        System.out.println(square.kerulet());
    }

    public static void printShapeDetails(Shape shape){
        System.out.println(shape.terulet());
        System.out.println(shape.kerulet());
    }
}
