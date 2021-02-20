package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] height = new int[n];
            int count = 0;
            for (int i = 0; i < n; ++i)
                height[i] = sc.nextInt();
            int maxHeight = 0;
            for (int i = 0; i < n; ++i) {
                if (height[i] >= maxHeight) {
                    count++;
                    maxHeight = height[i];
                }
            }
            System.out.println(count);
            --t;
        }
    }
}
