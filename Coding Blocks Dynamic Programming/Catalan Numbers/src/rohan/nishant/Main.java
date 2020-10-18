package rohan.nishant;

import java.util.*;
import java.math.BigInteger;

public class Main {
    static BigInteger catalanDP(int n) {
        BigInteger[] catalan = new BigInteger[n + 2];
        catalan[0] = new BigInteger(String.valueOf(1));
        catalan[1] = new BigInteger(String.valueOf(1));
        for (int i = 2; i <= n; i++) {
            catalan[i] = new BigInteger(String.valueOf(0));
            for (int j = 0; j < i; j++) {
                catalan[i] = catalan[i].add(catalan[j].multiply(catalan[i - j - 1]));
            }
        }
        return catalan[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(catalanDP(n));
    }
}
