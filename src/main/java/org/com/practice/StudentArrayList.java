package org.com.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentArrayList {

    public static void main(String[] args){

        ArrayList<Student> studList = new ArrayList<>();
        studList.add(new Student("anu","radha",4.5));
        studList.add(new Student("sri","sai",4.0));
        studList.add(new Student("rudra","rehansh",3.5));
        studList.add(new Student("Gokul","sathwik",3.0));
        studList.add(new Student("sanjana","Devi",2.5));



        Comparator<Student> c = Comparator.comparing(Student::getLastName);
        studList.sort(c);
        System.out.println("After sorting: ");
        for(Student s:studList){
            System.out.println(s.getLastName());

        }


    }


}
