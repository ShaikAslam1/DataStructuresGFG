package com.ds.mathematics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to count the digits");
        int x = scanner.nextInt();
        int count = 0;

        if (x==0)
            count = 1;

        while (x > 0) {
            count++;
            x /= 10;
        }
        System.out.println("Number of digits in the number is: " + count);
    }
}
