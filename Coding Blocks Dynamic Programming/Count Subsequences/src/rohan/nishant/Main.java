/*
Given a string, count the number of distinct subsequences of it ( including empty subsequence ). For the uninformed,
A subsequence of a string is a new string which is formed from the original string by deleting some of the characters
without disturbing the relative positions of the remaining characters. For example, "AGH" is a subsequence of
"ABCDEFGH" while "AHG" is not.

Input Format

First line of input contains an integer 't' denoting number of test cases.
Next t lines contain a string each.
Constraints

1<=t<=100
1<=length of s<=100000
s will contain upper letters only.
Output Format

For each test case ,print ans%1000000007 in a new line each ,where ans is the number of distinct subsequences.
Sample Input

2
AAA
ABCDEFG

Sample Output

4
128

Explanation

For "AAA" , the distinct subsequences that can be formed are { '', 'A' , 'AA' , 'AAA }. So we print 4 , no of
distinct subsequences.
*/

package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(countSubsequences(s));
            --t;
        }
    }

    private static long countSubsequences(String s) {
        int n = s.length();
        int[] lastIndexofCharacter = new int[256];
        Arrays.fill(lastIndexofCharacter, -1);
        long[] dpBottomUp = new long[n + 1];
        dpBottomUp[0] = 1;
        for (int i = 1; i <= n; ++i) {
            dpBottomUp[i] = (2 * (dpBottomUp[i - 1] % mod)) % mod;
            if (lastIndexofCharacter[s.charAt(i - 1)] != -1)
                dpBottomUp[i] = (dpBottomUp[i] - dpBottomUp[lastIndexofCharacter[s.charAt(i - 1)]] + mod) % mod;
            lastIndexofCharacter[s.charAt(i - 1)] = (i - 1);
        }
        return dpBottomUp[n];
    }
}