package Assignments;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        MinMax(a , b, c);
    }

    private static void MinMax(int a, int b, int c) {
        int max = Math.max(Math.max(a, b),c);
        int min = Math.min(Math.min(a , b),c);
        System.out.println("Max : " + max + " Min : " + min);
    }
    }

