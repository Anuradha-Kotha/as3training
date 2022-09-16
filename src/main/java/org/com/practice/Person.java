package org.com.practice;
import java.util.Scanner;
import static java.lang.System.*;

public class Person {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();

        if((age>=13) && (age<=19))
            out.println("teen");
        else if(age<13)
            out.println("kid");
       // else if(age>19)
            else
            out.println("adult");



    }
}
