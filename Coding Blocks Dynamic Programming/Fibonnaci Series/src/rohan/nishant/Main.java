package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dpTopDown = new int[n+1];
        dpTopDown[1] = 0;
        dpTopDown[2] = 1;
        System.out.println(fibonacciSeriesTopDown(n, dpTopDown));
        int[] dpBottomUp = new int[n+1];
        dpBottomUp[1] = 0;
        dpBottomUp[2] = 1;
        System.out.println(fibonacciSeriesBottomUp(n, dpBottomUp));
    }

    private static int fibonacciSeriesBottomUp(int n, int[] dpBottomUp) {
        for (int i=3;i<=n;++i)
            dpBottomUp[i] = dpBottomUp[i - 1] + dpBottomUp[i - 2];
        return dpBottomUp[n];
    }

    private static int fibonacciSeriesTopDown(int n, int[] dpTopDown) {
        if (n==1 || n==2)
            return n-1;
        if (dpTopDown[n] != 0)
            return dpTopDown[n];
        dpTopDown[n] = fibonacciSeriesTopDown(n-1, dpTopDown) + fibonacciSeriesTopDown(n-2, dpTopDown);
        return dpTopDown[n];
    }
}