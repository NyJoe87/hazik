package com.joe;

public class Customer {
    private int id;
    public String name;
    public int discount;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "name id: " + id +
                ", name: " + name  +
                ", discount: " + discount +"%";
    }
}


