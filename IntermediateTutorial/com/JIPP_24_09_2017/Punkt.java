
package com.JIPP_24_09_2017;
// Projekt z jedną klasą główną

public class Punkt {
    int x;
    int y;
    int kolor=0;

    int getX( ) { return x;}
    int getY( ) { return y;}
    int getKolor( ) { return kolor;}
    void setX(int _x){x=_x;}
    void przesunPunkt(int nowyX, int nowyY)
    {x=nowyX; y = nowyY;}
    void zmienKolor(int nowyKolor){kolor = nowyKolor;}
    boolean isKolor(int color)
    { if(kolor== color) {return true;}
    else {return false;}
    }

}