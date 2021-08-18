package Assignments;

import java.awt.geom.Area;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        Circle(r);
    }

    private static void Circle(int r) {
        double pi = 3.14;
        double circum = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("Circumference : " + circum + " Area : " + area);
    }

}
