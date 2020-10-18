/*
In IPL 2025, the amount that each player is paid varies from match to match. The match fee depends on the quality of
opposition, the venue etc.

The match fees for each match in the new season have been announced in advance. Each team has to enforce a mandatory
rotation policy so that no player ever plays three matches in a row during the season.

Nikhil is the captain and chooses the team for each match. He wants to allocate a playing schedule for himself to
maximize his earnings through match fees during the season.
Input Format

Line 1: A single integer N, the number of games in the IPL season.

Line 2: N non-negative integers, where the integer in position i represents the fee for match i.
Constraints

N < 1000000 a[i] < 1000
Output Format

The output consists of a single non-negative integer, the maximum amount of money that Nikhil can earn during this IPL
season.
Sample Input

8
3 2 3 2 3 5 1 3

Sample Output

17

Explanation

(Explanation: 3+3+3+5+3)
*/

package rohan.nishant;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(ipl(arr, n, sum));
    }

    private static long ipl(int[] arr, int n, long sum) {
        long[] dpArray = new long[n];
        dpArray[0] = arr[0];
        dpArray[1] = arr[1];
        dpArray[2] = arr[2];
        for (int i = 3; i < n; ++i)
            dpArray[i] = Math.min(dpArray[i - 1], Math.min(dpArray[i - 2], dpArray[i - 3])) + arr[i];
        return (sum - Math.min(dpArray[n - 1], Math.min(dpArray[n - 2], dpArray[n - 3])));
    }
}