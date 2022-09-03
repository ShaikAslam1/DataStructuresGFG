package com.ds.mathematics;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            ArrayList<Integer> ans = quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }

    private static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        double d = ((b * b) - (4 * a * c));

        if (d < 0) {
            result.add(-1);
            return result;
        }

        if (d >= 0) {
            double PositiveResult = ((-b + Math.sqrt(d)) / (2 * a));
            double NegativeResult = ((-b - Math.sqrt(d)) / (2 * a));

            if (PositiveResult > NegativeResult) {
                result.add((int) Math.floor(PositiveResult));
                result.add((int) Math.floor(NegativeResult));
            } else {
                result.add((int) Math.floor(NegativeResult));
                result.add((int) Math.floor(PositiveResult));
            }
        }
        return result;
    }
}
