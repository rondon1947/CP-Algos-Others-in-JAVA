/*

Calvin wakes up early one morning and finds that all his friends in the hostel are asleep. To amuse himself, he
decides to play the following game : he draws a sequence of N squares on the ground, numbered 1 to N, and writes an
integer in each square. He starts at square k (1 ≤ k ≤ N). The game consists of one forward phase followed by one
backward phase.

:- In the forward phase, Calvin makes zero or more moves of the following type : if his current position is p, he can
jump to p+1 or p+2 as long as he stays within the N squares.

:- In the backward phase, Calvin makes zero or more moves of the following type : if his current position is p, he can
jump to p−1 or p−2 as long as he stays within the N squares.

He plays such that he finally ends up at square 1, and then he stops. He starts with a score of 0, and each time he
jumps from square i to square j, he adds the integer written in square j to his score. Find the maximum score Calvin
can obtain by playing this game. Recall that Calvin must start at square k and end at square 1. The integer on the
square where he starts is not included in his score.

For example, suppose N = 5 and the numbers in squares are 5, 3, −2, 1, 1. If k = 2, Calvin starts on the second square.
He can make a forward move to square 4, another to square 5, a backward move to square 4, another to square 2, and
another to square 1. His total score is 1+1+1+3+5 = 11. You can check that this is the maximum score possible.
Input Format

• Line 1 : Two space-separated integers, N and k, with 1 ≤ k ≤ N. • Line 2 : A space-separated sequence of N integers,
the numbers in squares 1, 2 . . . , N .
Constraints

1 ≤ N ≤ 2*10^5 -1000 <= Ai <= 1000
Output Format

A single line with a single integer, the maximum score Calvin can obtain by playing the game.
Sample Input

5 2
5 3 -2 1 1

Sample Output

11
*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            arr[i] = sc.nextInt();
        System.out.println(calvinsGame(arr, n, k));
    }

    private static long calvinsGame(int[] arr, int n, int k) {
        long[] dp1 = new long[n + 1];
        long[] dp2 = new long[n + 1];
        if (k == 1)
            return 0;
        for (int i = 1; i <= n; i++)
            dp1[i] = dp2[i] = Integer.MIN_VALUE;
        dp1[k] = 0;
        if (k + 1 <= n)
            dp1[k + 1] = arr[k + 1];
        for (int i = k + 2; i <= n; i++)
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2]) + arr[i];
        dp2[1] = arr[1];
        dp2[2] = arr[2] + arr[1];
        for (int i = 3; i <= n; i++)
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2]) + arr[i];
        long ans = Integer.MIN_VALUE;
        for (int i = k; i <= n; i++)
            ans = Math.max(dp1[i] + dp2[i - 1], Math.max(ans, dp1[i] + dp2[Math.max(1, i - 2)]));
        return ans;
    }
}
