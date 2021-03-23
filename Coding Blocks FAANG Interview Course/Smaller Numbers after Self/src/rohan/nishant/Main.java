package rohan.nishant;

import java.util.Scanner;

public class Main {
    static class Pair {
        int index, value;

        Pair(int idx, int val) {
            index = idx;
            value = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; ++i)
            arr[i] = new Pair(i, sc.nextInt());
        int[] ans = new int[n];
        modifiedMergeSort(arr, 0, n - 1, n, ans);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void modifiedMergeSort(Pair[] arr, int start, int end, int n, int[] ans) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        modifiedMergeSort(arr, start, mid, n, ans);
        modifiedMergeSort(arr, mid + 1, end, n, ans);
        merge(arr, start, mid, end, n, ans);
    }

    private static void merge(Pair[] arr, int start, int mid, int end, int n, int[] ans) {
        Pair[] first = new Pair[mid - start + 1];
        Pair[] second = new Pair[end - mid];
        for (int i = start; i <= mid; ++i)
            first[i - start] = arr[i];
        for (int i = mid + 1; i <= end; ++i)
            second[i - mid - 1] = arr[i];
        int i = 0, j = 0, k = start, count = 0;
        while (i < first.length && j < second.length) {
            if (second[j].value < first[i].value) {
                count++;
                arr[k++] = second[j++];
            } else {
                ans[first[i].index] += count;
                arr[k++] = first[i++];
            }
        }
        while (i < first.length) {
            ans[first[i].index] += count;
            arr[k++] = first[i++];
        }
        while (j < second.length) {
            arr[k++] = second[j++];
        }
    }
}
