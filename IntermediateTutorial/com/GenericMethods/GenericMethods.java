package com.GenericMethods;

import java.util.*;

public class GenericMethods {

    public static void main(String[] args) {

        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b','u','c','y'};

        printMe(iray);
        printMe(cray);

    }
    ///////////////////////overloaded methods - the same name of method, but different set od data
    /*public static void printMe(Integer[] i){

        for(Integer x : i)
            System.out.printf("%s", x);
        System.out.println();

    }

    public static void printMe(Character[] i){

        for(Character x : i)
            System.out.printf("%s", x);
        System.out.println();

    }*/

    //////////////////////////generic methods - accepts any type of data
    public static <T> void printMe(T[] x){ //T is a generic abstract type of data - it accepts every data
        for(T b : x)
            System.out.printf("%s", b);
        System.out.println();
    }

}
