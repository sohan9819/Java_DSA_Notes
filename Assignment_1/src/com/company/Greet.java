package com.company;

import java.util.Scanner;

public class Greet {
        public static void main(String[] args) {
            System.out.println("Enter a name : ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            System.out.println("Hello " + name +  ", nice to meet you ."  );

        }


}
