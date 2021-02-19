package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = (n + m), k = 0;
        int[] ans = new int[x];
        for (int i = 0; i < n; ++i)
            ans[k++] = sc.nextInt();
        for (int i = 0; i < m; ++i)
            ans[k++] = sc.nextInt();
        Arrays.sort(ans);
        if ((x % 2) == 0)
            System.out.println(((ans[(x / 2) - 1] + ans[(x / 2)]) / 2));
        else
            System.out.println(ans[(x - 1) / 2]);
    }
}
