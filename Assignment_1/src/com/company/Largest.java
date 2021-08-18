package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 nos : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        if ( a > b){
//            if ( a > c){
//                System.out.println("Largest number : " + a);
//            }
//            else {
//                System.out.println("Largest number : " + c);
//            }
//        }
//        else {
//            if ( b > c){
//            System.out.println("Largest number : " + b);
//            }
//            else {
//            System.out.println("Largest number : " + c);
//            }
//        }

        // Another method

//        int max = Math.max(a,b);
//        max = Math.max(max , c);
//        System.out.println(max);

        //optimising the above code

        int max = Math.max(c , Math.max(a ,b));
        System.out.println(max);
    }
}
