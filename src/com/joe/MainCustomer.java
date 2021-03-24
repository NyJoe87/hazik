package com.joe;

public class MainCustomer {
    public static void main(String[] args) {
        Customer client1 = new Customer(45288,"Tom",23);
        System.out.println(client1.toString());
        Customer client2 = new Customer(2234,"Jenny",43);
        System.out.println(client2.toString());
    }
}
