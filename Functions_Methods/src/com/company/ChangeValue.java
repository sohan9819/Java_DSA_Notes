package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1 , 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
