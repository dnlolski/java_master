package com.OopCompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Room theRoom = new Room(5,2,7);

        House theHouse = new House(theRoom);

        theHouse.openWindows();


    }

}
