package rohan.nishant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        int target = sc.nextInt();
        int[] ans = twoSum(a, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    private static int[] twoSum(int[] a, int target) {
        int[] ans = new int[2];
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            for (int j = (i + 1); j < n; ++j) {
                if ((a[i] + a[j]) == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    private static int[] twoSumMapApproach(int[] a, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            myMap.put(a[i], i);
        }
        for (int i = 0; i < a.length; i++) {
            int correspondingTarget = target - a[i];
            if (myMap.containsKey(correspondingTarget) && myMap.get(correspondingTarget) != i) {
                return new int[]{i, myMap.get(correspondingTarget)};
            }
        }
        return a;
    }
}
