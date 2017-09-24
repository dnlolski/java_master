package com.OopInheritance;

public class OOP_1 {

    public static void main(String[] args) {
        Car porshe = new Car();
        Car holden = new Car();

        porshe.setModel("Carrera");
        System.out.println("Model is " + porshe.getModel());

        holden.setModel("Holden");
        System.out.println("Model is " + holden.getModel());
    }
}
