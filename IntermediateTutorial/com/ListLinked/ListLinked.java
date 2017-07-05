package com.ListLinked;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListLinked {
    public static void main(String[] args) {

        String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();

        for(String x : things) //x is temporal var
            list1.add(x);

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();

        for(String y : things2)
            list2.add(y);

        list1.addAll(list2); // adding all elements from list2 to list1
        list2 = null; //deletes elements in list2


        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);

    }

    //printMe method
    private static void printMe(List<String> l){

        for(String b : l )
            System.out.printf("%s ", b);
        System.out.println();
    }

    //removeStuff method
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear(); // takes specified list and clears/deletes it from
    }

    //reverseMe method
    private static void reverseMe(List<String> l){

        ListIterator<String> bobby =  l.listIterator(l.size()); //l.size specifies last item
        while(bobby.hasPrevious())
            System.out.printf("%s ", bobby.previous());

    }
}
