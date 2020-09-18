package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfWines = sc.nextInt();
        int[] wines = new int[numberOfWines];
        for (int i = 0; i < numberOfWines; ++i)
            wines[i] = sc.nextInt();
        int[][] dpTopDown = new int[numberOfWines][numberOfWines];
        System.out.println(winesTopDown(0, numberOfWines - 1, wines, 1, dpTopDown));
        int[][] dpBottomUp = new int[numberOfWines][numberOfWines];
        System.out.println(winesBottomUp(dpBottomUp, wines, numberOfWines));
    }

    private static int winesBottomUp(int[][] dpBottomUp, int[] wines, int numberOfWines) {
        for (int i = 0; i < numberOfWines; ++i)
            dpBottomUp[i][i] = numberOfWines * wines[i];
        for (int i = 1; i <= numberOfWines; ++i) {
            for (int j = 0; (i + j) < numberOfWines; ++j) {
                int chooseLeftIndex, chooseBottomIndex;
                chooseLeftIndex = dpBottomUp[j][j + i - 1] + wines[j + i] * (numberOfWines - i);
                chooseBottomIndex = dpBottomUp[j + 1][j + i] + wines[j] * (numberOfWines - i);
                dpBottomUp[j][j+i] = Math.max(chooseBottomIndex, chooseLeftIndex);
            }
        }
        return dpBottomUp[0][numberOfWines-1];
    }

    private static int winesTopDown(int i, int j, int[] wines, int year, int[][] dpTopDown) {
        if (i > j)
            return 0;
        if (dpTopDown[i][j] != 0)
            return dpTopDown[i][j];
        int chooseLeftIndex, chooseRightIndex;
        chooseLeftIndex = wines[i] * year + winesTopDown(i + 1, j, wines, year + 1, dpTopDown);
        chooseRightIndex = wines[j] * year + winesTopDown(i, j - 1, wines, year + 1, dpTopDown);
        dpTopDown[i][j] = Math.max(chooseLeftIndex, chooseRightIndex);
        return dpTopDown[i][j];
    }
}
