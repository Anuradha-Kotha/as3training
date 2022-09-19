package org.com.practice;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        Scanner sc        = new Scanner(System.in);
        System.out.print("Entered name: ");
        String enteredStr = sc.nextLine();
        System.out.println("The vowels are in the given String are: ");

        for( int i=0; i<enteredStr.length(); i++ ){

            if(     enteredStr.charAt(i) == 'a' ||
                    enteredStr.charAt(i) == 'e' ||
                    enteredStr.charAt(i) == 'i' ||
                    enteredStr.charAt(i) == 'o'||
                    enteredStr.charAt(i) == 'u'
            ){
                System.out.print(enteredStr.charAt(i));

            }

        }

        }}