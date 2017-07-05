package com.ConvertingListsToArrays;


import java.util.Arrays;
import java.util.LinkedList;

public class ConvertingListsToArrays {
    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelon", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpkin");
        thelist.addFirst("firstthing"); //adding elements like its list, you dont need to save it as list - converse

        //convert back to array
        stuff = thelist.toArray(new String[thelist.size()]);

        for(String x : stuff)
            System.out.printf("%s ", x);
    }
}
