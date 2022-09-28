package org.com.practice;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        hm.put("anu", new Student("anu", "radha", 4.5));
        hm.put("sandhya", new Student("sandhya", "rani", 4.6));
        hm.put("Udaya", new Student("Udaya", "laxmi", 4.2));
        hm.put("Madhavi", new Student("Madhavi", "Latha", 4.4));
        hm.put("Sri", new Student("Sri", "Sai", 5.0));
        hm.put("Naga", new Student("Naga", "radhika", 4.9));
        hm.put("Divya", new Student("Divya", "jyothi", 3.9));
        hm.put("Ravi", new Student("Ravi", "Kiran", 4.3));

        System.out.println(hm);
    }}