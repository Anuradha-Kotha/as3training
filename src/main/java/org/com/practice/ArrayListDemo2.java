package org.com.practice;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){

        ArrayList<String> b = new ArrayList<>();
        b.add("Prabhas");
        b.add("NTR");
        b.add("Charan");
        b.add("arjun");
        b.add("chaitanya");
        b.add("Mike");

        System.out.println("Before removing last element from Arraylist are "+b);

        //removing last object from arraylist
        b.remove(b.size()-1);
        System.out.println("After removing last element from Arraylist are "+b);

    }

}
