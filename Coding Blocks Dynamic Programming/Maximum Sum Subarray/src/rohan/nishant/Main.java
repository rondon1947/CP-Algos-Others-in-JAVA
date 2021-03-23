package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            arr[i] = sc.nextInt();
        long maxSumSoFar = Long.MIN_VALUE;
        long[] dp = new long[n + 1];
        for (int i = 1; i <= n; ++i) {
            long temp = dp[i - 1] + arr[i];
            if (temp < 0)
                dp[i] = 0;
            else
                dp[i] = temp;
            maxSumSoFar = Math.max(maxSumSoFar, dp[i]);
        }
        System.out.println(maxSumSoFar);
    }
}
