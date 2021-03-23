package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        if (circularLoopArray(arr, n))
            System.out.println("1");
        else
            System.out.println("0");
    }

    private static boolean circularLoopArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i) {
            int slow = 0, fast = 0;
            if (arr[i] == 0)
                continue;
            while ((arr[slow] * arr[nextIndex(arr, slow)]) > 0 &&
                    (arr[fast] * arr[nextIndex(arr, fast)]) > 0 &&
                    (arr[fast] * arr[nextIndex(arr, nextIndex(arr, fast))]) > 0) {
                slow = nextIndex(arr, slow);
                fast = nextIndex(arr, nextIndex(arr, fast));
                if (slow == fast)
                    return (slow != nextIndex(arr, slow));
            }
            slow = i;
            int val = arr[slow];
            while (val*arr[slow] > 0) {
                int x = slow;
                slow = nextIndex(arr, slow);
                arr[x] = 0;
            }
        }
        return false;
    }

    private static int nextIndex(int[] arr, int i) {
        return ((i + arr[i] + arr.length) % arr.length);
    }
}
