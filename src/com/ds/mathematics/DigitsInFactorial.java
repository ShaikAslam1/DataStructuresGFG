package com.ds.mathematics;

import java.util.Scanner;

public class DigitsInFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number below");
        int x = scanner.nextInt();

        if (x <= 0) {
            System.out.println("number of digits in the factorial number is: " + 1);
            System.exit(1);
        }
        double digits = 0;

        for (int i=2; i<=x; i++)
            digits += Math.log10(i);

        int i = (int) (Math.floor(digits)) + 1;
        System.out.println("number of digits in the factorial number is: " + i);
    }
}
