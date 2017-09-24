package com.OopCompositionChallenge;

public class Room{

    private int furniture;
    private int windows;
    private int floor;

    public Room(int furniture, int windows, int floor) {
        this.furniture = furniture;
        this.windows = windows;
        this.floor = floor;
    }

    public void openWindows(){
        System.out.println("Opening windows...");
        System.out.println(setFurniture(furniture));
    }

    private int setFurniture(int setFurniture){
        this.furniture=setFurniture;
        return furniture;

    }

    private int getFurniture() {
        return furniture;
    }

    private int getWindows() {
        return windows;
    }

    private int getFloor() {
        return floor;
    }
}
