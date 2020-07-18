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
        int leftStartingIndex = mid - start + 1;
        int rightStartingIndex = end - mid;
        int[] leftArray = new int[leftStartingIndex];
        int[] rightArray = new int [rightStartingIndex];
        for (int i=0; i<leftStartingIndex; ++i)
            leftArray[i] = arr.get(start + i);
        for (int j=0; j<rightStartingIndex; ++j)
            rightArray[j] = arr.get(mid + 1 + j);
        int i = 0, j = 0;
        int k = start;
        while (i<leftStartingIndex&&j<rightStartingIndex) {
            if (leftArray[i] <= rightArray[j]) {
                arr.set(k, leftArray[i]);
                i++;
            } else {
                arr.set(k, rightArray[j]);
                j++;
            }
            k++;
        }
        while (i<leftStartingIndex) {
            arr.set(k, leftArray[i]);
            i++;
            k++;
        }
        while (j<rightStartingIndex) {
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
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}