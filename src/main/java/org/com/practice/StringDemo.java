package org.com.practice;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        if( sentence.contains(word) ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }





    }




}
