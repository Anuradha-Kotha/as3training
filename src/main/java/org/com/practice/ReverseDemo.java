package org.com.practice;

import java.util.Scanner;

public class ReverseDemo {

    public static void main(String[] args){

                    Scanner sc         = new Scanner(System.in);
                    System.out.println("Enter String: ");
                    String inputString = sc.nextLine();
                    try {
                        for (int i = inputString.length()-1; i >= 0; i--)
                            System.out.print(inputString.charAt(i));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
        }


    }
}
