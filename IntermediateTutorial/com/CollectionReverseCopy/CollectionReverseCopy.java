package com.CollectionReverseCopy;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionReverseCopy {
    public static void main(String[] args) {

        //create an array and convert to list
        Character[] ray ={'p', 'w', 'n'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("List is: ");
        output(l);

        //reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);

        //creates new array and a new list
        Character[] newRay = new Character[l.size()];
        List<Character> listCopy = Arrays.asList(newRay);

        //Copy contents of list into listcopy
        Collections.copy(listCopy, l);
        System.out.println("Copy of list: ");
        output(listCopy);

        //fill collection with crap
        Collections.fill(l, 'X');
        System.out.println("After filling the list: ");
        output(l);
    }
    //output method
    private static void output(List<Character> thelist){

        for(Character thing : thelist)
            System.out.printf("%s ", thing);

        System.out.println();

    }
}
