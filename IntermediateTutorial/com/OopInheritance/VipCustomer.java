package com.OopInheritance;


public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default",1000.00,"default@default.com");
        System.out.println("Empty constructor called");

    }
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@unknown.com");
        System.out.println("second constructor");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("third constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

