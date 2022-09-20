package org.com.practice;

public class Student {
        String name;
        String firstName;
        String lastName;
         Double   GPA;

    public Student(String firstName, String lastName, Double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
