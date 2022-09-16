package org.com.practice;

import java.util.Scanner;

import static java.lang.System.*;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        out.println("Enter number:");
        int n = sc.nextInt();

        for( int i=1; i<=n; i++ )

            if (i % 3 == 0 && i % 5 == 0)
                out.println("FizzBuzz");
            else if (i % 3 == 0)
                out.println("Fizz");
            else if (i % 5 == 0)
                out.println("Buzz");

    }
}
