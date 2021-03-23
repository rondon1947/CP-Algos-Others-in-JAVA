package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int aggressiveCows(long[] arr, int numberOfBarns, int numberOfCows) {
        int start = 0, end = Integer.MAX_VALUE, mid, ans = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (possibleToKeepCows(arr, numberOfBarns, numberOfCows, mid)) {
                if (mid > ans)
                    ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    private static boolean possibleToKeepCows(long[] arr, int numberOfBarns, int numberOfCows, int mid) {
        int cowsPlaced = 1;
        long pos = arr[0];
        for (int i = 1; i < numberOfBarns; ++i) {
            if (arr[i] - pos >= mid) {
                cowsPlaced++;
                if (cowsPlaced == numberOfCows)
                    return true;
                pos = arr[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int numberOfBarns = sc.nextInt(), numberOfCows = sc.nextInt();
            long[] arr = new long[numberOfBarns];
            for (int i = 0; i < numberOfBarns; ++i)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println(aggressiveCows(arr, numberOfBarns, numberOfCows));
            --t;
        }
    }
}
