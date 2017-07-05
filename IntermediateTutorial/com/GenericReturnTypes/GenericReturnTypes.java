package com.GenericReturnTypes;

import java.util.*;

public class GenericReturnTypes {

    public static void main(String[] args) {

        System.out.println(max(23,42,1));
        System.out.println(max("apples","tots","chicken")); //returns tots cos T is the highest ASCII value
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;

        if(b.compareTo(a) > 0) //compare return negative number, 0 or positive number. IF positive then b is greater than a
            m = b;

        if(c.compareTo(m) > 0)
            m = c;

        return m;
    }

}
