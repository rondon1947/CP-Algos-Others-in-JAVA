package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int x = a[n - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= x; ++i)
            ans.add(0);
        for (int i = 0; i < n; ++i) {
            int temp = ans.get(a[i]);
            ans.set(a[i], temp + 1);
        }
        int count = 0;
        for (int i = 0; i <= x; ++i) {
            if (ans.get(i) > 0)
                count++;
        }
        System.out.println(Math.min((n / 2), count));
    }
}
