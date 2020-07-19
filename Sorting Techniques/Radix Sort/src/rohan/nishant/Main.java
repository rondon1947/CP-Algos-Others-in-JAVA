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
            arr.add(rd.nextInt(n));
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
        System.out.println();
        radixSort(arr, 10, n, n);
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
    public static void radixSort(ArrayList<Integer> input, int radix, int width, int n) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix, n);
        }
    }
    public static void radixSingleSort(ArrayList<Integer> input, int position, int radix, int n) {
        int[] countArray = new int[radix];
        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[n];
        for (int tempIndex = n - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input.get(tempIndex), radix)]] = input.get(tempIndex);
        }
        for (int tempIndex = 0; tempIndex < n; tempIndex++) {
            input.set(tempIndex, temp[tempIndex]);
        }
    }
    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}