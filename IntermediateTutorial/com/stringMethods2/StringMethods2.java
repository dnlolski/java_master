package com.stringMethods2;


public class StringMethods2 {
    public static void main(String args[]) {

        String s = "buckyrobertsbuckyroberts";

        System.out.println(s.indexOf('k', 5)); // will ignore first 5, returns index of first found letter k

        System.out.println(s.indexOf("rob")); // will ignore first 5, returns index of first found letter k

        String a = "Bacon ";
        String b = "            monster           ";

//        System.out.println(a.concat(b)); - adds two strings
//        System.out.println(a.replace('B','F')); - changes B to F
//        System.out.println(b.toUpperCase());

        System.out.println(b.trim()); // deletes whitespaces in monster before and after the word

    }


}
