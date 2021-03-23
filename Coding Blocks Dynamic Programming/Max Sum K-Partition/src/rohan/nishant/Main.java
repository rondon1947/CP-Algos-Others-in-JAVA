/*

 Agarwal has a habit of creating Ajeeb Samasya as usual and Shubham always comes to his rescue. This is time he has
 created another samasya which is as follows. Read carefully! Shubham has an array of N integers and an integer K. He
 wants to create a subsequence of this array with some conditions applied. He builds ceil(N/K) blocks of this array with
 size of each block as [i∗K+1,min((i+1)∗k,N)] for 0≤i≤N/K. For two consecutive integers in this subsequence, he wants
 the integers to be of two different blocks. (It is not a compulsion to have one integer from each block). Also, lets
 say the indexes of any two integers of this subsequence be i and j, then he wants |i−j| != K. Shubham takes the sum of
 integers in the subsequence. He wonders what can be the maximum sum obtained? Help shubham in this samasya.
 Input Format

 First line contains two space separated integers : N and K Second line contains N space separated integers : A1, A2,…, AN
 Constraints

 1 ≤ N ≤ 2∗10^6

 1 ≤ K ≤ N

 −10^9 ≤ Ai ≤ 10^9
 Output Format

 print a single integer describing maximum sum that can be obtained.

 Sample Input

 6 5
 5 4 3 2 1 -1

 Sample Output

 5
*/

package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long findIndex(long[] arr, long t) {
        if (arr == null) {
            return -1;
        }
        long len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; ++i)
            arr[i] = sc.nextLong();
        int numberOfPartitions = 0;
        long[] tempArray = new long[K];
        long[] tempArray1 = new long[K];
        for (int i = 0; i < K; ++i) {
            tempArray[i] = tempArray1[i] = arr[i];
        }
        Arrays.sort(tempArray);
        long lastMaxNum = tempArray[K - 1];
        long secondLastMaxNum = tempArray[K - 2];
        long indexOfLastMax = findIndex(tempArray1, lastMaxNum);
        numberOfPartitions++;
        for (int i = K; i < N; i += K) {
            for (int j = 0; j < K; ++j) {
                if ((i + j) < N) {
                    if ((j + i) != (indexOfLastMax + K))
                        arr[j + i] = arr[j + i] + lastMaxNum;
                    else
                        arr[j + i] = arr[j + i] + secondLastMaxNum;
                }
            }
            for (int j = 0; j < K; ++j) {
                if ((i + j) < N) {
                    tempArray[j] = tempArray1[j] = arr[i + j];
                }
            }
            Arrays.sort(tempArray);
            lastMaxNum = tempArray[K - 1];
            secondLastMaxNum = tempArray[K - 2];
            indexOfLastMax = findIndex(tempArray1, lastMaxNum) + K * numberOfPartitions;
            numberOfPartitions++;
        }
        System.out.println(lastMaxNum);
    }
}