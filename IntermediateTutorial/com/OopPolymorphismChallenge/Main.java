package com.OopPolymorphismChallenge;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getName() + " -> accelerate()";
    }

    public String accelerate() {
        return getName() + " -> accelerate()";
    }

    public String brake(){
        return getName() + " -> brake()";
}
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

    Car car = new Car(8, "Base Car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi(4, "Mitsubishi");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

    Ford ford = new Ford(4, "Ford");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

    }
}
