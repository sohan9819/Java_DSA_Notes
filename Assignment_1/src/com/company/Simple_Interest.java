package com.company;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Principle : ");
        int p = input.nextInt();
        System.out.println("Enter a Principle : ");
        int t = input.nextInt();
        System.out.println("Enter a Principle : ");
        int r = input.nextInt();

        int si = (p*r*t) / 100 ;
        System.out.println("Simple Interest : " + si);
    }
}
