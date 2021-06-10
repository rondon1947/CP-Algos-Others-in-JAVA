package rohan.nishant;

import java.util.*;
import java.math.*;

public class Main {
    public static BigInteger f(BigInteger x) {
        BigInteger three = new BigInteger("3");
        BigInteger ten = new BigInteger("10");
        return three.multiply(x.multiply(x)).add(ten).subtract(x);
    }

    public static BigInteger g(BigInteger x) {
        BigInteger five = new BigInteger("5");
        BigInteger four = new BigInteger("4");
        BigInteger two = new BigInteger("2");
        return four.multiply(x.multiply(x).multiply(x)).add(four).add(two.multiply(x.multiply(x))).subtract(five.multiply(x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x;
        x = sc.nextBigInteger();
        System.out.println(f(x).add(g(x)));
    }
}
