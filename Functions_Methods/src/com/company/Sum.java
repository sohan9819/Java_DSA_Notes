package com.company;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
	// write your code here
        //sum();
        //System.out.println(greet());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();
        int ans = sum(num1 , num2);
        System.out.println(ans);
        System.out.println(greet("Sohan"));
    }

    static int sum (int a , int b){
        int sum = a + b;
        return sum;
    }

     static String greet (String name ){
        String greeting = "How are you "  +  name;
        return greeting;
     }
}
