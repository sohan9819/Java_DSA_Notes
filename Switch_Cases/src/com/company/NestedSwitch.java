package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sohan Shetty");
            case 2 -> System.out.println("Developper");
            case 3 -> {
                System.out.println("Employee number 3 ");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No deparment");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
