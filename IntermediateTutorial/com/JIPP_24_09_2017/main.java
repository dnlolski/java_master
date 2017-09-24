package com.JIPP_24_09_2017;

public class main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt( );
        p1.przesunPunkt(1, 2);
        Punkt p2 = new Punkt( );
        int kolor =  p2.getKolor( );

        Punkt p3 = new Punkt();
        boolean isKolor3 = p3.isKolor(3);

        System.out.println(isKolor3);

        System.out.println("Wspólrzędne pierwszego punktu wynoszą [" +
                p1.getX() +"," + p1.getY()+"]  kolor drugiego punktu: " + kolor);

        Punkt p4 = new Punkt2(3, 4,5);

        System.out.println("Wspólrzędne czwartego punktu wynoszą [" +
                p4.getX() +"," + p4.getY()+"]  kolor czwartego punktu: " + p4.getKolor());

    }
}
