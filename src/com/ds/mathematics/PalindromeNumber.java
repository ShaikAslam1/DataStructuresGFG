package com.ds.mathematics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's palindrome or not");
        int x = scanner.nextInt();
        int reverse = 0;
        int n = x;

        while (x > 0) {
            reverse = reverse*10 + x%10;
            x /= 10;
        }

        if (reverse == n) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
