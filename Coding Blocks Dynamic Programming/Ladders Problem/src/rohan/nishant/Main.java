package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[n + 1];
        System.out.println(laddersProblemTopDown(dp, n, k));
    }

    private static int laddersProblemTopDown(int[] dp, int n, int k) {
        if (n == 1)
            return 1;
        if (dp[n] != 0)
            return dp[n];
        int ways = 0;
        for (int i = 1; i <= k; ++i) {
            if ((n - i) >= 1)
                ways += laddersProblemTopDown(dp, n - i, k);
        }
        return dp[n] = ways;
    }
}