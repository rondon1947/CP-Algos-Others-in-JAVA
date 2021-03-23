package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n + 1];
        for (int i = 0; i <= n; ++i)
            cost[i] = sc.nextInt();
        System.out.println(matrixChainMultiplication(cost));
    }

    private static int matrixChainMultiplication(int[] cost) {
        int n = cost.length - 1;
        int[][] dpMinimumCost = new int[n][n];
        for (int i = 1; i < n; ++i) {
            int r = 0, c = i;
            while (c < n) {
                int minCost = Integer.MAX_VALUE;
                for (int pivot = r; pivot < c; ++pivot)
                    minCost = Math.min(minCost, (dpMinimumCost[r][pivot] + dpMinimumCost[pivot + 1][c]
                            + (cost[r] * cost[pivot + 1] * cost[c + 1])));
                dpMinimumCost[r][c] = minCost;
                ++r;
                ++c;
            }
        }
        return dpMinimumCost[0][n - 1];
    }
}