package com.joe;

public class MainAccount {
    public static void main(String[] args) {
        Account client1 = new Account("01223","Tom",1000);
        Account client2 = new Account("129875","Judith",1200);

        client1.transferMoney(100,client2);
        client1.withdraw(125);
        client2.withdraw(235);
        client2.transferMoney(200,client1);
        System.out.println(Account.setNumbersOfAccount(5));
    }
}
