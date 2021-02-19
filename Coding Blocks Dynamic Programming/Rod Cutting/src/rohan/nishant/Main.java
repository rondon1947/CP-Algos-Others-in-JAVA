/*
Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n.
Determine the maximum value obtainable by cutting up the rod and selling the pieces.
Input Format

n, size of array Ai, value of array elements
Constraints

1<= n <= 10^5 1<= Ai <=10^5
Output Format

Maximum value obtainable by cutting up the rod and selling the pieces.
Sample Input

5
1 2 3 4 5

Sample Output

5
*/

package rohan.nishant;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; ++i)
            prices[i] = sc.nextInt();
        System.out.println(rodCutting(prices, n));
    }

    private static long rodCutting(int[] prices, int n) {
        int[] maxPrice = new int[n + 1];
        maxPrice[0] = 0;
        for (int i = 1; i <= n; i++) {
            int temp = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                temp = Math.max(temp, prices[j] + maxPrice[i - j - 1]);
            maxPrice[i] = temp;
        }
        return maxPrice[n];
    }
}
