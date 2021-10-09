package com.company;

public class Main {

    public static void main(String[] args) {

    CustomerManager customerManager=new CustomerManager();
    Customer customer=new Customer(1,"Mehmet",4000);
    customerManager.add(customer);

    }
}
