package com.joe;

public class Car {
    String brand;
    String colour;

    public Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public void setColour(String c) {
        this.colour = c;
    }
    public boolean hit(Dog d){
        d.setIsAlive("mops");
        return false;
    }

}
