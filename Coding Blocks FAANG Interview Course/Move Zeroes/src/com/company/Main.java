package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");
            else
                count++;
        }
        for (int i = 1; i < count; ++i)
            System.out.print("0 ");
        System.out.println("0");
    }
}
