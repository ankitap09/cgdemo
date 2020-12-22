package com.capgemini.training.day2.service;
public class Balance {
    private String name;
    private double balance;

 

    public Balance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
 
    public void show() {
        if(balance<0) 
            System.out.print("-->> ");
            System.out.println(name + ": $" + balance);
    }
}