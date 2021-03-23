package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(), k = sc.nextBigInteger(), ansNatalia, ansKlaudia,
                two = new BigInteger("2");
        ansNatalia = (n.subtract(k)).divide(two);
        ansKlaudia = n.subtract(ansNatalia);
        System.out.print(ansKlaudia + "\n" + ansNatalia);
    }
}