package rohan.nishant;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void mergeSort(ArrayList<Integer> arr, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    private static void merge(ArrayList<Integer> arr, int start, int mid, int end) {
        int leftArrayLength = mid - start + 1;
        int rightArrayLength = end - mid;
        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];
        for (int i = 0; i < leftArrayLength; ++i)
            leftArray[i] = arr.get(start + i);
        for (int i = 0; i < rightArrayLength; ++i)
            rightArray[i] = arr.get(mid + 1 + i);
        int i = 0, j = 0, k = start;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr.set(k, leftArray[i]);
                i++;
            } else {
                arr.set(k, rightArray[j]);
                j++;
            }
            k++;
        }
        while (i < leftArrayLength) {
            arr.set(k, leftArray[i]);
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            arr.set(k, rightArray[j]);
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i)
            arr.add(rd.nextInt(100));
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
        System.out.println();
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}