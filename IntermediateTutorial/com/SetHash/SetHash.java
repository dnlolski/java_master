package com.SetHash;

import java.util.*;

public class SetHash {

    public static void main(String[] args) {

        //HashSet automatically removes duplicates
        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s", list);
        System.out.println();

        Set<String> set = new HashSet<String>(list); //removed duplicates and sorted it
        System.out.printf("%s", set);


    }
}
