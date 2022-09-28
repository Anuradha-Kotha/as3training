package org.com.practice;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args){
        HashMap<Student,String> hp = new HashMap<>();
        hp.put(new Student("anu", "radha", 4.5), "anu"+"radha");
        hp.put(new Student("sandhya", "rani", 4.6), "sandhya"+"rani");
        hp.put(new Student("Udaya", "laxmi", 4.2), "udaya"+"laxmi");
        hp.put(new Student("Madhavi", "Latha", 4.4), "madhavi"+"latha");
        hp.put(new Student("Sri", "Sai", 5.0), "sri"+"sai");
        hp.put(new Student("Naga", "radhika", 4.9), "Naga"+"radhika");
        hp.put(new Student("Divya", "jyothi", 3.9), "Divya"+"Jyothi");
        hp.put(new Student("Ravi", "Kiran", 4.3), "Ravi"+"Kiran");

         System.out.println(hp);

    }
}
