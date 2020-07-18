package rohan.nishant;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
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
        quickSort(arr, 0, n);
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
    private static void quickSort(ArrayList<Integer> arr, int start, int end) {
        if (end - start >= 2) {
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex);
            quickSort(arr, partitionIndex + 1, end);
        }
    }
    private static int partition(ArrayList<Integer> arr, int start, int end) {
        int pivot = arr.get(start);
        int i = start, j = end;
        while (i < j) {
            while (i < j && arr.get(--j) >= pivot);
            if (i < j)
                arr.set(i, arr.get(j));
            while (i < j && arr.get(++i) <= pivot);
            if (i < j)
                arr.set(j, arr.get(i));
        }
        arr.set(j, pivot);
        return j;
    }
}
