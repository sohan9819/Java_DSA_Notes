package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        fruit = fruit.toLowerCase();

        switch (fruit){
            case "mango" -> System.out.println("King of fruit");
            case"apple" -> System.out.println("Sweet red fruit");
            case  "orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
