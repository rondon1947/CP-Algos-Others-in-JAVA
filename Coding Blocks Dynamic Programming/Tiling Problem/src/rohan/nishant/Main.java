/*
*

Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m . A tile can either be placed horizontally or vertically.
Input Format

First line of input contains an integer T denoting the number of test cases. Then T test cases follow.
The first line of each test case contains two integers N and M.
Constraints

1 <= T<= 1000
1 <= N,M <= 100000
Output Format

Print answer for every test case in a new line modulo 10^9+7.
Sample Input

2
2 3
4 4

Sample Output

1
2

*/
package rohan.nishant;

import java.util.*;

public class Main {
    public static long mod = 1000000007;

    public static long tilingProblemBottomUp(int n, int m) {
        long[] dpBottomUp = new long[n + 1];
        dpBottomUp[0] = 0;
        int j;
        for (j = 1; j <= n; ++j)
            if (j > m)
                dpBottomUp[j] = ((dpBottomUp[j - 1]) % mod + (dpBottomUp[j - m]) % mod) % mod;
            else if (j < m)
                dpBottomUp[j] = 1;
            else
                dpBottomUp[j] = 2;
        return dpBottomUp[n];
    }

    public static long tilingProblemTopDown(long[] dpTopDown, int n, int m) {
        if (n < m)
            return 1;
        if (n == m)
            return 2;
        if (dpTopDown[n] != 0)
            return dpTopDown[n];
        dpTopDown[n] = ((tilingProblemTopDown(dpTopDown, n - 1, m) % mod) + (tilingProblemTopDown(dpTopDown, n - m, m) % mod)) % mod;
        return dpTopDown[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n < m) System.out.println("1");
            else if (n == m) System.out.println("2");
            else {
                System.out.println(tilingProblemBottomUp(n, m));
                long[] dpTopDown = new long[n + 1];
                System.out.println(tilingProblemTopDown(dpTopDown, n, m));
            }
        }
    }
}