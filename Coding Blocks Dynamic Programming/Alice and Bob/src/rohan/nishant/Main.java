package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] frequencyArray = new int[100001];
        for (int i = 1; i <= N; ++i) {
            arr[i] = sc.nextInt();
            frequencyArray[arr[i]]++;
        }
        System.out.println(aliceAndBob(arr, frequencyArray, N));
    }

    private static long aliceAndBob(int[] arr, int[] frequencyArray, int N) {
        long[] dpArray = new long[100001];
        dpArray[1] = arr[1];
        for (int i = 2; i <= 100000; ++i)
            dpArray[i] = Math.max(dpArray[i-1], arr[i]*i + dpArray[i-2]);
        return dpArray[100000];
    }
}
