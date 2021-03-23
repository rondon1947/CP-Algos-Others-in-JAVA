package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        int left = 0, right = (n-1);
        long area = 0;
        while (left < right) {
            area = Math.max(area, (long) Math.min(arr[left], arr[right]) * (right - left));
            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }
        System.out.println(area);
    }
}
