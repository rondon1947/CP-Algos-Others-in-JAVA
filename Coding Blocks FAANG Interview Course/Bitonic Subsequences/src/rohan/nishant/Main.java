package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        System.out.println(bitonicSubsequences(arr, n));
    }

    private static int bitonicSubsequences(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 0;
        for (int i = 1; i < n; ++i) {
            int x = 1;
            for (int j = 0; j < i; ++j) {
                if (arr[i] > arr[j])
                    x = Math.max(x, left[j] + 1);
            }
            left[i] = x;
        }
        for (int i = (n - 2); i >= 0; --i) {
            int x = 1;
            for (int j = (i + 1); j < n; ++j) {
                if (arr[i] > arr[j])
                    x = Math.max(x, right[j] + 1);
            }
            right[i] = x;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i)
            ans = Math.max(ans, (left[i] + right[i] - 1));
        return ans;
    }
}