package org.com.practice;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<String> a = new ArrayList<>();
        a.add("Hi");
        a.add("Hello");
        System.out.println("Before swapping,values of Arraylist are: " + a);

        String firstIndexValue = a.get(0);
        String secondIndexValue = a.get(1);

        a.set(0,secondIndexValue);
        a.set(1,firstIndexValue);
        System.out.println("After swapping,values of Arraylist are: " + a);



    }
}
