/*
*

College starts at eight in the morning! But Yash Jeswani is awake way before he is supposed to be. It's a beautiful
* day for him until he realizes Yash Agarwal took his shoes and had been away while Jeswani was sleeping. Jeswani is
* furious with such irresponsible behaviour. Now, what to do then? So he decides to go to "the Bali"'s shop to buy
* new shoes. Now Bali shows him a N pairs of shoes. But these shoes aren't some normal shoes! These are "the Bali"
* shoes. The size of left shoe will be always not equal to the size of the right shoe! Being such close friends Bali
* agrees to gift him a pair of shoes if he answers his question. Bali asks what are the total number of ways to select
* one shoe from each of the N pairs such that the summation of all the selected shoe sizes is odd? Then do help
* Jeswani to get free shoes. Since the answer can be too large print it modulo 10^9+7.

Input Format

First line contains N number of pairs N lines follows two space separated integer Li Ri representing shoe sizes
Constraints

1 ≤ N ≤ 10^5

1 ≤ Li,Ri ≤ 10^9

Li ≠ Ri
Output Format

Print number of ways to select one shoe from each of the N pairs such that the summation of the selected shoe sizes is
odd. Since the answer can be too large print it modulo 10^9+7.
Sample Input

2
1 2
3 4

Sample Output

2

Explanation

The two ways are {1,4} and {2,3}.
*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] arr = new long[N][2];
        for (int i = 0; i < N; ++i) {
            arr[i][0] = sc.nextLong();
            arr[i][1] = sc.nextLong();
        }
        System.out.println(baliPairs(arr, N));
    }

    private static long baliPairs(long[][] arr, int N) {
        long[][] dpArray = new long[N][2];
        if (arr[0][0] % 2 == 1)
            dpArray[0][1]++;
        else
            dpArray[0][0]++;
        if (arr[0][1] % 2 == 1)
            dpArray[0][1]++;
        else
            dpArray[0][0]++;
        for (int i = 1; i < N; ++i) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] % 2 == 0) {
                    dpArray[i][0] = (dpArray[i][0] + dpArray[i - 1][0]) % mod;
                    dpArray[i][1] = (dpArray[i][1] + dpArray[i - 1][1]) % mod;
                }
                else if (arr[i][j] % 2 == 1) {
                    dpArray[i][0] = (dpArray[i][0] + dpArray[i - 1][1]) % mod;
                    dpArray[i][1] = (dpArray[i][1] + dpArray[i - 1][0]) % mod;
                }
            }
        }
        return dpArray[N-1][1];
    }
}