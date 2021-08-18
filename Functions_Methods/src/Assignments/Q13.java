package Assignments;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Prime(a , b);
    }

    private static void Prime(int a, int b) {
        for (int j = a ; j <= b ; j++){
            if ( isPrime(j)) System.out.println(j);
        }
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
