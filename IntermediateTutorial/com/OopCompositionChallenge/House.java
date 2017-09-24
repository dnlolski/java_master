package com.OopCompositionChallenge;

public class House {

    private String wallMaterial;
    //private String typeOfHeating;
   //private int numberOfFloors;

    private Room theRoom;

    public House(Room theRoom) {
        this.theRoom = theRoom;
    }

    public void openWindows(){
       theRoom.openWindows();
    }

    //private String setWallMaterial(){

    //}

}
