package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static int boyerMooreMajorityVotingAlgorithm(int[] a) {
        int element = 0, countElement = 0;
        for (int j : a) {
            if (j == element)
                countElement++;
            else if (countElement == 0) {
                element = j;
                countElement++;
            } else
                countElement--;
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        System.out.println(boyerMooreMajorityVotingAlgorithm(a));
    }
}