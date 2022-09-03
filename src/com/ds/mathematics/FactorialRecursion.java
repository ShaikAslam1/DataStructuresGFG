package com.ds.mathematics;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(factorial(x));
    }

    private static int factorial(int x) {
        if (x > 0)
            return x * factorial(x - 1);
        else
            return 1;
    }
}
