/*
In ICO School, all students have to participate regularly in SUPW. There is a different SUPW activity each day, and
each activity has its own duration. The SUPW schedule for the next term has been announced, including information
about the number of minutes taken by each activity.

Nikhil has been designated SUPW coordinator. His task is to assign SUPW duties to students, including himself. The
school's rules say that no student can go three days in a row without any SUPW duty.

Nikhil wants to find an assignment of SUPW duty for himself that minimizes the number of minutes he spends overall on
SUPW.
Input Format

A single integer N, the number of days in the future for which SUPW data is available.

N non-negative integers, where the integer in position i represents the number of minutes required for SUPW work on
day i.
Constraints

N < = 1000000
Output Format

The output consists of a single non-negative integer, the minimum number of minutes that Nikhil needs to spend on SUPW
duties this term
Sample Input

10
3 2 1 1 2 3 1 3 2 1

Sample Output

4

Explanation

(Explanation: 1+1+1+1)

*/

package rohan.nishant;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        System.out.println(supw(arr, n));
    }

    private static long supw(int[] arr, int n) {
        long[] dpArray = new long[n];
        dpArray[0] = arr[0];
        dpArray[1] = arr[1];
        dpArray[2] = arr[2];
        for (int i = 3; i < n; ++i)
            dpArray[i] = Math.min(dpArray[i - 1], Math.min(dpArray[i - 2], dpArray[i - 3])) + arr[i];
        return Math.min(dpArray[n - 1], Math.min(dpArray[n - 2], dpArray[n - 3]));
    }
}
