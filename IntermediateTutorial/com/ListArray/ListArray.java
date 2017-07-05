package com.ListArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListArray {

    public static void main(String[] args) {
        //holds references to another objects - dynamic array(like array)
        String[] things ={"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for (String x: things) //saves every element of things to x and then x to list1
            list1.add(x);

        System.out.print("List1: ");

        for(int i =0; i<list1.size();i++) {

            System.out.printf("%s ", list1.get(i));

        }

        String[] moreThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        for (String y: moreThings) //saves every element of things to x and then x to list1
            list2.add(y);

        System.out.print("\nList2: ");

        for(int i =0; i<list2.size();i++){

            System.out.printf("%s ", list2.get(i));
        }

        editlist(list1,list2);
        System.out.print("\nEdited list1: ");

        for(int i =0; i<list1.size();i++) {

            System.out.printf("%s ", list1.get(i));

        }
    }

    public static void editlist(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator(); //iterator walks through list1
        while(it.hasNext()){ //iterate through list till hasNext() points to null
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }
}
