/*
*

You are provided an integers N. You need to count all possible distinct binary strings of length N such that there are no consecutive 1’s.
Input Format

First line contains integer t which is number of test case. For each test case, it contains an integer n which is the the length of Binary String.
Constraints

1<=t<=100 1<=n<=90
Output Format

Print the number of all possible binary strings.
Sample Input

2
2
3

Sample Output

3
5

Explanation

1st test case : 00, 01, 10 2nd test case : 000, 001, 010, 100, 101
*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            System.out.println(binaryStringsTopDown(n - 1, 0) + binaryStringsTopDown(n - 1, 1));
            int[][] dpBottomUp = new int[n + 1][2];
            dpBottomUp[1][0] = 2;
            dpBottomUp[1][1] = 1;
            System.out.println(binaryStringsBottomUp(dpBottomUp, n - 1));
            System.out.println(binaryStringsFibonacci(n));
            t--;
        }
    }

    private static int binaryStringsBottomUp(int[][] dpBottomUp, int n) {
        for (int i = 2; i <= n; ++i) {
            dpBottomUp[i][0] = dpBottomUp[i - 1][0] + dpBottomUp[i - 1][1];
            dpBottomUp[i][1] = dpBottomUp[i - 1][0];
        }
        return dpBottomUp[n][0] + dpBottomUp[n][1];
    }

    private static int binaryStringsTopDown(int n, int lastDigit) {
        if (n == 1 && lastDigit == 1)
            return 1;
        if (n == 1 && lastDigit == 0)
            return 2;
        if (lastDigit == 0)
            return binaryStringsTopDown(n - 1, 0) + binaryStringsTopDown(n - 1, 1);
        else
            return binaryStringsTopDown(n - 1, 0);
    }

    private static long binaryStringsFibonacci(long n) {
        long a = 1, b = 1;
        for (long i = 1; i < n; i++) {
            long temp = a;
            a = a + b;
            b = temp;
        }
        return (a + b);
    }
}
