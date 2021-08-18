package Assignments;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Factorial(num));
    }

    private static int Factorial(int num) {
        int ans=1 ;
        if ( num == 0){
            return 1;
        }
        else {
            for ( int i = 1 ; i <= num ; i++){
                ans *= i;
            }
            return ans;
        }
    }
}
