package rohan.nishant;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static BigInteger mod = BigInteger.valueOf(998244353);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        BigInteger[] b = new BigInteger[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextBigInteger();
            a[i] = a[i].multiply(BigInteger.valueOf((long)(i + 1) * (n - i)));
        }
        for (int i = 0;i<n;++i)
            b[i] = sc.nextBigInteger();
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        BigInteger ans = BigInteger.valueOf(0);
        for (int i = 0;i<n;++i) {
            ans = ans.add(a[i].mod(mod).multiply(b[i].mod(mod)));
            ans = ans.mod(mod);
        }
        System.out.println(ans);
    }
}
