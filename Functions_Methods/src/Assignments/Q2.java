package Assignments;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (Even(num)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    private static boolean Even(int num) {
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
}
