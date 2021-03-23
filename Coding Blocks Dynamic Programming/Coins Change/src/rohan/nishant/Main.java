package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = sc.nextInt();
        int typeOfCoins = sc.nextInt();
        int[] coinsDenomination = new int[typeOfCoins];
        for (int i = 0; i < typeOfCoins; ++i)
            coinsDenomination[i] = sc.nextInt();
        int[] dpTopDown = new int[totalSum+1];
        System.out.println(coinsChangeTopDown(totalSum, dpTopDown, coinsDenomination));
        int[] dpBottomUp = new int[totalSum+1];
        dpBottomUp[1] = 1;
        System.out.println(coinsChangeBottomUp(totalSum, dpBottomUp, coinsDenomination));
    }

    private static int coinsChangeBottomUp(int totalSum, int[] dpBottomUp, int[] coinsDenomination) {
        for (int i = 1; i <= totalSum; ++i) {
            dpBottomUp[i] = Integer.MAX_VALUE;
            for (int j : coinsDenomination) {
                if (i - j >= 0) {
                    int subProblem = dpBottomUp[i-j] + 1;
                    dpBottomUp[i] = Math.min(dpBottomUp[i], subProblem);
                }
            }
        }
        return dpBottomUp[totalSum];
    }

    private static int coinsChangeTopDown(int totalSum, int[] dpTopDown, int[] coinsDenomination) {
        int ans = Integer.MAX_VALUE;
        if (totalSum == 0)
            return 0;
        if (dpTopDown[totalSum] != 0)
            return dpTopDown[totalSum];
        for (int i : coinsDenomination) {
            if (totalSum - i >= 0) {
                int subProblem = coinsChangeTopDown(totalSum - i, dpTopDown, coinsDenomination);
                ans = Math.min(ans, subProblem + 1);
            }
        }
        dpTopDown[totalSum] = ans;
        return dpTopDown[totalSum];
    }
}