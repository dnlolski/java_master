package com.Queue;

import java.util.*;

public class Queue {

    public static void main(String[] args) {

        //in queue first thing you enter has highest priority

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s", q);
        System.out.println();

        System.out.printf("%s", q.peek()); // looking at element of highest priority and returning it
        System.out.println();

        q.poll(); // removing element of highest priority

        System.out.printf("%s", q);
    }
}
