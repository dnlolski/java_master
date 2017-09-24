package com.OopEncapsulation;

public class Main {

    public static void main(String[] args) {
//
//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damages = 10;
//        player.health= 200;
//
//        player.loseHealth(damages);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Tim",50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        player.loseHealth(10);
        System.out.println("Health: " + player.getHealth());


    }
}
