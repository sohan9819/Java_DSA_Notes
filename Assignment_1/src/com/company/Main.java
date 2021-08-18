package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 1;

        for(int i=1 ; i<= num ; i++ ){
            ans *= i;
        }

        System.out.println("Factorial : " + ans );
    }
}
