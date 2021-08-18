package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
        System.out.println(isArmstrong(num));
    }

    static  boolean isArmstrong(int num){
        int sum = 0;
        int n = num;
        while ( n > 0){
            int i = n % 10;
            sum += i*i*i ;
            n /= 10;
        }
        return sum == num;
    }


    static boolean isPrime(int num) {
        int i = 2;
        while ( i < num ){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
