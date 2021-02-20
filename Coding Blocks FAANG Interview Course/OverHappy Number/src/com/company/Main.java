package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static boolean overHappyNumber(long sum) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(0L);
        while (!arr.contains(sum)) {
            arr.add(sum);
            sum = sumOfSquareofDigits(sum);
            if (sum == 1)
                return true;
        }
        return false;
    }

    private static long sumOfSquareofDigits(long sum) {
        long j, ans = 0;
        while (sum > 0) {
            j = sum % 10;
            ans = ans + (j*j);
            sum /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = sumOfSquareofDigits(n);
        if (sum == 1)
            System.out.println("true");
        else
            System.out.println(overHappyNumber(sum));
    }
}
