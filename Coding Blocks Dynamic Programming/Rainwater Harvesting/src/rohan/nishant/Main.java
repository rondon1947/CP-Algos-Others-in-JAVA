/*
Apoorvaa has created an elevated roof. She wants to know how much water can she save during rain.

Given n non negative integers representing the elevation map where width of every bar is 1, Find the maximum water
that she can save.

Explanation for the Sample input Testcase:
Elevation Map

So the total units of water she can save is 5 units
Input Format

First line contains an integer n. Second line contains n space separated integers representing the elevation map.
Constraints

1 <= N <= 10^6
Output Format

Print a single integer containing the maximum unit of waters she can save.
Sample Input

10
0 2 1 3 0 1 2 1 2 1

Sample Output

5

Explanation

Refer to the image for explanation. Count the number of cells having water in them.
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
        System.out.println(rainWaterHarvesting(arr, n));
    }

    private static long rainWaterHarvesting(int[] arr, int n) {
        int[] tallestLeft = new int[n];
        int[] tallestRight = new int[n];
        long totalWater = 0;
        tallestLeft[0] = arr[0];
        for (int i = 1; i < n; i++)
            tallestLeft[i] = Math.max(tallestLeft[i - 1], arr[i]);
        tallestRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            tallestRight[i] = Math.max(tallestRight[i + 1], arr[i]);
        for (int i = 0; i < n; i++)
            totalWater += Math.min(tallestLeft[i], tallestRight[i]) - arr[i];
        return totalWater;
    }
}