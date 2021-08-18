package Assignments;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println(isPalidrome(n1 , n2 , n3));
    }

    private static boolean isPalidrome(int n1 , int n2 , int n3) {
        int h = Math.max(Math.max(n1 , n2 ), n3);
        return h*h == n1*n1 + n2*n2 + n3*n3 - h*h;

    }
}
