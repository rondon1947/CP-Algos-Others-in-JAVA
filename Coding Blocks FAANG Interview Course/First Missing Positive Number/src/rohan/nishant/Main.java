package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 1; i < Integer.MAX_VALUE; ++i) {
            if (Arrays.binarySearch(arr, i) < 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
