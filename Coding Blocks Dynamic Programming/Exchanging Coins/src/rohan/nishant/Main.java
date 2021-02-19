/*
Tughlaq introduces a strange monetary system. He introduces copper coins and each coin has a number written on it.
A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. A coin can also be sold for gold. One can
get as much grams of gold as the number written on the coin. You have one copper coin. What is the maximum weight of
gold one can get from it?
Input Format

The input file contains a single integer n, the number on the coin.
Constraints

0 <= n <= 1 000 000 000
Output Format

Print the maximum weight of gold you can get.
Sample Input

12

Sample Output

13
*/

package rohan.nishant;

import java.util.*;

public class Main {
    static int N = 1000005;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i;
        long[] dpArray = new long[N];
        for (i = 0; i < N; i++)
            dpArray[i] = -1;
        System.out.println(exchangingCoins(n, dpArray));
    }

    private static long exchangingCoins(int n, long[] dpArray) {
        if (n <= 10)
            return n;
        if (n < 1e6) {
            if (dpArray[n] != -1)
                return dpArray[n];
            long q1 = exchangingCoins(n / 2, dpArray) + exchangingCoins(n / 4, dpArray)
                    + exchangingCoins(n / 3, dpArray);
            return dpArray[n] = Math.max(n, q1);
        }
        long q1 = exchangingCoins(n / 2, dpArray) + exchangingCoins(n / 4, dpArray)
                + exchangingCoins(n / 3, dpArray);
        return Math.max(n, q1);
    }
}
