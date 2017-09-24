package com.OopInheritance;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) { //setting a value of variable
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("holden")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel() { // getting a value of set variable
        return this.model;
    }
}
