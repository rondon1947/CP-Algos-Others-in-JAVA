/*

Alice is fighting with an alien to save this planet. As alien is very powerful he needs some power to overcome him.
Power points are represented in the form of an array containing both positive and negative powers but the problem is
he can get power equal to the product of the subarray he selects. Help him to decide maximum power he can get.
Input Format

First line contains an integral value denoting the size of array 'n' and then next line represents the array elements.
Constraints

1<=n<=100000 Product of all numbers will fit in long long int.
Output Format

Single integer denoting the maximum power.
Sample Input

8
10 1 2 -13 0 7 -18 2

Sample Output

20
*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextLong();
        System.out.println(maximumPower(arr, n));
    }

    private static long maximumPower(long[] arr, int n) {
        long maxEndingHere = 1;
        long minEndingHere = 1;
        long maxSoFar = 1;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                maxEndingHere = maxEndingHere * arr[i];
                minEndingHere = Math.min(minEndingHere * arr[i], 1);
                flag = 1;
            }
            else if (arr[i] == 0) {
                maxEndingHere = 1;
                minEndingHere = 1;
            }
            else {
                long temp = maxEndingHere;
                maxEndingHere = Math.max(minEndingHere * arr[i], 1);
                minEndingHere = temp * arr[i];
            }
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        if (flag == 0 && maxSoFar == 1)
            return 0;
        return maxSoFar;
    }
}
