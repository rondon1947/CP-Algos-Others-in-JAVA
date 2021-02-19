/*
You are given a line of n colored squares in a row, numbered from 1 to n from left to right. The i-th square initially
has the color ci.

Let's say, that two squares i and j belong to the same connected component if ci=cj, and ci=ck for all k satisfying
i<k<j. In other words, all squares on the segment from i to j should have the same color.

For example, the line [3,3,3] has 1 connected component, while the line [5,2,4,4] has 3 connected components.

The game "flood fill" is played on the given line as follows:

At the start of the game you pick any starting square (this is not counted as a turn).

Then, in each game turn, change the color of the connected component containing the starting square to any other color.

Find the minimum number of turns needed for the entire line to be changed into a single color.
Input Format

The first line contains a single integer n (1≤n≤5000) — the number of squares.

The second line contains integers c1,c2,…,cn (1≤ci≤5000) — the initial colors of the squares.
Constraints

Output Format

Print a single integer — the minimum number of the turns needed.
Sample Input

8
4 5 2 2 1 3 5 5

Sample Output

4

Explanation

In the example, a possible way to achieve an optimal answer is to pick square with index 5 as the starting square and
then perform recoloring into colors 2,3,5,4 in that order.

*/

package rohan.nishant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            int temp;
            temp = s.nextInt();
            if (c == 0)
                arr[c++] = temp;
            else if (arr[c - 1] != temp)
                arr[c++] = temp;
        }
        n = c;
        int[][] dpArray = new int[5001][5001];
        for (int i = 0; i < 5001; i++)
            for (int j = 0; j < 5001; j++)
                dpArray[i][j] = -1;
        int ans = floodFill(arr, 0, n - 1, dpArray);
        System.out.println(ans);
    }

    public static int floodFill(int[] arr, int l, int r, int[][] dpArray) {
        if (l >= r)
            return dpArray[l][r] = 0;
        if (dpArray[l][r] != -1)
            return dpArray[l][r];
        if (arr[l] == arr[r]) {
            int ans = floodFill(arr, l + 1, r - 1, dpArray) + 1;
            dpArray[l][r] = ans;
            return ans;
        }
        if (arr[l] != arr[r]) {
            int a = floodFill(arr, l + 1, r, dpArray) + 1;
            int b = floodFill(arr, l, r - 1, dpArray) + 1;
            dpArray[l][r] = Math.min(a, b);
        }
        return dpArray[l][r];
    }
}