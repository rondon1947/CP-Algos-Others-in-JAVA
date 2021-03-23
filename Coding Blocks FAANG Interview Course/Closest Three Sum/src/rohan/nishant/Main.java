package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        System.out.println(closestThreeSum(arr, n, target));
    }

    private static int closestThreeSum(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int closestDifference = Integer.MAX_VALUE, closestSum = 0;
        for (int i = 0; i <= (n - 3); ++i) {
            int sum = 0, j = i + 1, k = n - 1;
            sum += arr[i] + arr[j] + arr[k];
            while (j < k) {
                if (Math.abs(sum - target) < closestDifference) {
                    closestDifference = Math.abs(sum - target);
                    closestSum = sum;
                }
                if (sum < target) {
                    sum -= arr[j++];
                    sum += arr[j];
                }
                else if (sum > target) {
                    sum -= arr[k--];
                    sum += arr[k];
                }
                else
                    return sum;
            }
        }
        return closestSum;
    }
}
