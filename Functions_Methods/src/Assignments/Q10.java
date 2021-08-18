package Assignments;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (isPalidrome(num)){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not a Palidrome");
        }
    }

    private static boolean isPalidrome(int num) {
        int ans = 0;
        int n = num;
        while (n > 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return num == ans ;
    }
}
