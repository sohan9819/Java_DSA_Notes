package Assignments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (Eligible(age)){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    private static boolean Eligible(int age) {
        return age >= 18 ;
    }
}
