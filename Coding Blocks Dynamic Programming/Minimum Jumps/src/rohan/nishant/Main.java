/*
Given an array of integers where each element represents the max number of steps that can be made forward from that
element. Print the minimum number of jumps to reach the end of the array (starting from the first element). If an
element is 0, then cannot move through that element.
Input Format

n, size of array Ai, array elements
Constraints

1<=n<=5000 1<=Ai<=10^5
Output Format

Number of minimum jumps
Sample Input

11
1 3 5 8 9 2 6 7 6 8 9

Sample Output

3

Explanation

3 (1-> 3 -> 8 ->9)

*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i)
            arr[i] = sc.nextInt();
        System.out.println(minimumJumps(arr));
    }

    private static int minimumJumps(int[] arr) {
        if (arr.length <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jump;
            maxReach = Math.max(maxReach, i + arr[i]);
            step--;
            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }
}