package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        if ((n % 2) != 0) {
            int x = (n / 2);
            ans[x] = 0;
            for (int i = 0; i < x; ++i)
                ans[i] = (-1 * x) + i;
            for (int i = (x + 1); i < n; ++i)
                ans[i] = i - x;
        } else {
            int x = (n / 2);
            for (int i = 0; i < x; ++i)
                ans[i] = (-1 * x) + i;
            for (int i = x; i < n; ++i)
                ans[i] = i - x + 1;
        }
        for (int i : ans)
            System.out.print(i + " ");
    }
}
