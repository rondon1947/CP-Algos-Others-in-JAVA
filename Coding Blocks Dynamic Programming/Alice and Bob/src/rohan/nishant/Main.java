/*
Alice is playing a weird game. Given a sequence 'a' consisting of n integers. The player can make several steps. In a single step he can choose an element of the sequence (let's denote it ak) and delete it, at that all elements equal to ak + 1 and ak - 1 also must be deleted from the sequence. That step brings ak points to the player.
Help Alice to get maximum points.(Use Fast Input Output)
Input Format

First line contains an integral value denoting size of array 'n'. Second line contains the array elements.
Constraints

1<=n<=10^5 1<=a[i]<=10^5
Output Format

Single integer denoting the maximum value that Alice could have.
Sample Input

8
7 2 1 8 3 3 6 6

Sample Output

27
*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] frequencyArray = new int[100001];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
            frequencyArray[arr[i]]++;
        }
        System.out.println(aliceAndBob(arr, frequencyArray, N));
    }

    private static long aliceAndBob(int[] arr, int[] frequencyArray, int N) {
        long[] dpArray = new long[100001];
        dpArray[1] = frequencyArray[1];
        for (int i = 2; i <= 100000; ++i)
            dpArray[i] = Math.max(dpArray[i-1], frequencyArray[i]*i + dpArray[i-2]);
        return dpArray[N];
    }
}
