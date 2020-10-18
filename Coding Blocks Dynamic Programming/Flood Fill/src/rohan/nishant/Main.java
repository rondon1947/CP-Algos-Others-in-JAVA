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

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println(floodFill(arr, n));
    }

    private static int floodFill(int[] arr, int n) {

    }
}
