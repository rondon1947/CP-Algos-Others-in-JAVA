package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; ++i)
                s[i] = sc.next();
            Arrays.sort(s);
            for (int i = (n - 1); i >= 0; --i)
                System.out.print(s[i]);
            System.out.println();
            --t;
        }
    }
}
