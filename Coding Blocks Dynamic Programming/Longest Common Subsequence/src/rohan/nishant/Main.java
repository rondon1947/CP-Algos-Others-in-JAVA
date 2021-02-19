package rohan.nishant;

import java.util.*;

public class Main {
    static void longestCommonSubsequence(String firstString, String secondString, int lengthOfFirstString, int lengthOfSecondString) {
        int[][] localDPArray = new int[lengthOfFirstString + 1][lengthOfSecondString + 1];
        for (int i = 0; i <= lengthOfFirstString; i++) {
            for (int j = 0; j <= lengthOfSecondString; j++) {
                if (i == 0 || j == 0)
                    localDPArray[i][j] = 0;
                else if (firstString.charAt(i - 1) == secondString.charAt(j - 1))
                    localDPArray[i][j] = localDPArray[i - 1][j - 1] + 1;
                else
                    localDPArray[i][j] = Math.max(localDPArray[i - 1][j], localDPArray[i][j - 1]);
            }
        }
        int index = localDPArray[lengthOfFirstString][lengthOfSecondString];
        int temp = index;
        char[] dpArray = new char[index + 1];
        dpArray[index] = '\u0000';
        int i = lengthOfFirstString;
        int j = lengthOfSecondString;
        while (i > 0 && j > 0) {
            if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
                dpArray[index - 1] = firstString.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (localDPArray[i - 1][j] > localDPArray[i][j - 1])
                i--;
            else
                j--;
        }
        for (int k = 0; k <= temp; k++)
            System.out.print(dpArray[k]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        longestCommonSubsequence(firstString, secondString, firstString.length(), secondString.length());
    }
}