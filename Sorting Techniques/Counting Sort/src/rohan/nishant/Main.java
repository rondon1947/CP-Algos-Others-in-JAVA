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
            arr.add(rd.nextInt(n) + 1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
        System.out.println();
        countingSort(arr, 1, n);
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
    public static void countingSort(ArrayList<Integer> input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        for (int value : input) {
            countArray[value - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input.set(j++, i);
                countArray[i - min]--;
            }
        }
    }
}