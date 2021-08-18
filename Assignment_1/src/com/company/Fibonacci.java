package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        int ans = 0 ;

        for (int i = 0; i <= n-2 ; i++) {
            ans = a + b;
            a = b;
            b = ans ;
            System.out.println(ans);
        }

        System.out.println(" Ans : " + ans);

    }
}
