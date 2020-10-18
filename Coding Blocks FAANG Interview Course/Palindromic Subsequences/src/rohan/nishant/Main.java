package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindromicSubsequences(s));
    }

    private static int palindromicSubsequences(String s) {
        int n = s.length();
        boolean[][] dpArray = new boolean[n][n];
        for (int i = 0; i < n; ++i)
            dpArray[i][i] = true;
        for (int i = 0; i < (n - 1); ++i)
            if (s.charAt(i) == s.charAt(i + 1))
                dpArray[i][i + 1] = true;
        for (int d = 2; d < n; ++d) {
            int i = 0, j = d;
            while (j < n) {
                dpArray[i][j] = (s.charAt(i) == s.charAt(j)) && dpArray[i + 1][j - 1];
                ++i;
                ++j;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                if (dpArray[i][j])
                    ans++;
        return ans;
    }
}