package com.company;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + "  " + b);

        /*
        Swapping
        int temp = a;
        a = b;
        b = temp;
        */
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }


}
