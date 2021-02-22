package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt(), flag = 0;
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextLong();
                if (arr[i] > 0)
                    flag = 1;
            }
            if (flag == 0) {
                Arrays.sort(arr);
                System.out.println(arr[n - 1]);
            } else
                System.out.println(maxSumSubarray(arr, n));
            --t;
        }
    }

    private static long maxSumSubarray(long[] arr, int n) {
        long maxSum = Long.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < n; ++i) {
            currentSum += arr[i];
            if (currentSum < 0)
                currentSum = 0;
            if (currentSum > maxSum)
                maxSum = currentSum;
        }
        return maxSum;
    }
}
