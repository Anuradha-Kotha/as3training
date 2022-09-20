package org.com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo  {

    public static void main(String[] args){

        Student[] stud = new Student[8];
        stud[0] = new  Student("anu","radha",4.0);
        stud[1] = new  Student("rehansh","vicky",4.5);
        stud[2] = new  Student("ravi","kiran",3.0);
        stud[3] = new  Student("manasa","sri",3.5);
        stud[4] = new  Student("sai","Siri",3.7);
        stud[5] = new  Student("rama","kanth",3.8);
        stud[6] = new  Student("phani","kiran",3.9);
        stud[7] = new  Student("suman","ganta",2.5);

          Comparator<Student> c = Comparator.comparing(Student::getGPA);
        System.out.println("Sorting objects in Student array ");
        Arrays.sort(stud,c);


        for(Student sortStud:stud){
            System.out.println(sortStud.GPA);
        }

    }



}
