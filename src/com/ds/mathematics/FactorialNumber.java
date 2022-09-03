package com.ds.mathematics;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of it");
        int x = scanner.nextInt();

        System.out.println(factorial(x));
    }

    private static int factorial(int x) {
        int factorial = 1;
        if (x == 0 || x == 1)
            return 1;

        while (x > 0) {
            factorial *= x;

            --x;
        }
        return factorial;
    }
}
