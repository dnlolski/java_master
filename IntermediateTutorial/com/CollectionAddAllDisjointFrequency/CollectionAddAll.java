package com.CollectionAddAllDisjointFrequency;

import java.util.*;

public class CollectionAddAll {

    public static void main(String[] args) {

        //convert stuff array to a list
        String[] stuff = {"apples", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");

        for(String x : list2)
            System.out.printf("%s ", x);

///////////////////////////////AddAll////////////////////////////////////
        Collections.addAll(list2, stuff); //from stuff to list 2

        System.out.println();
        for(String x : list2)
            System.out.printf("%s ", x);

///////////////////////////////Frequency////////////////////////////////
        System.out.println();
        System.out.println(Collections.frequency(list2, "digg")); // checks if digg is in list2 and how frequent, returns number

//////////////////////////////Disjoint/////////////////////////////////
        boolean tof = Collections.disjoint(list1, list2); //returns true if collections dont have anything in common
        System.out.println(tof); // false cos list1 and list2 have some elements in common

        if(tof) //if tof is true else...
            System.out.println("these lists dont have anything in common");
        else
            System.out.println("Lists have something in common");
    }


}
