package org.com.practice;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        a.add("anu");
        a.add("sai");
        a.add("Anu");
        a.add("anitha");
        a.add("Anvitha");
        a.add("udaya");
        a.add("sandhya");
        a.add("radha");

        a.stream().sorted().filter(b-> (b.charAt(0)=='a') && (b.length()==3)).forEach(System.out::println);

    }
}
