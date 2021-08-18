package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        int ans = 0;
        int mult = 10;

        while ( n > 0) {
            int rem = n % 10;
//            ans *= mult;
//            ans += rem;
            ans = (ans * mult) + rem;
            n = n / 10;
        }

        System.out.println(ans);

    }
}
