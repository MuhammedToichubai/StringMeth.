package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String myStr = "Muhammed Hello Muhammed";
        System.out.println(myStr.contentEquals("Muhammed Hello Muhammed"));  // true
        System.out.println(myStr.contentEquals("Muhammed Hello"));      // false
        System.out.println(myStr.contentEquals("Hi"));     // false

    }
    static  String compareto1(String...vararges){
        final int[] result = {0};
        for (String a : vararges) {
            result[0] = a.compareTo(String.valueOf(vararges));
        }
        return String.valueOf(result[0]);//System.out.println(compareto1("Muhammed","MuhammedToichubai","Muh","M"));konsol-14
    }
    static int codePointBefore(String str) {
        int newStr = str.codePointBefore(1);
        return newStr;
    }
    static int codePointCount() {
        String myStr = "Hello";
        int result = myStr.codePointCount(0, 5);
        return result;
    }
    static int compareTo(){
         String myStr = " HELLO";
         String myStr1 = " Hello";
         int result = myStr.compareTo(myStr1);


        return result;
    }
    static int compareToIgnorCase(){
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        int result = myStr1.compareToIgnoreCase(myStr2);

        return result;
    }
}
