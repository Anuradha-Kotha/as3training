package org.com.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputStr = sc.nextLine();
        StringBuilder sb = new StringBuilder(inputStr);
        String reverseStr = sb.reverse().toString();
        int i = Integer.parseInt(inputStr);
        int j = Integer.parseInt(reverseStr);
        if(i==j){
            System.out.println("Given number is Palindrome");
        }else{
            System.out.println("Given number is not Palindrome");
        }

    }
}