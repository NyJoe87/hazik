package com.joe;

public class MainInvoice {
    public static void main(String[] args) {
        Customer cust1 = new Customer(2223,"Tom",21);
        Invoice Inv1 = new Invoice(1234,cust1,889);
        System.out.println("Customer name: " + Inv1.getCustomerName());
        System.out.println("Invoice after discount: " + Inv1.getAmountAfterDiscount());
    }
}
