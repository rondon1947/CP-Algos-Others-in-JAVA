package rohan.nishant;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i)
            arr.add(sc.next());
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
        System.out.println();
        radixSort(arr, 26, arr.get(0).length(), n);
        for (String value : arr) {
            System.out.print(value + "\t");
        }
    }
    public static void radixSort(ArrayList<String> input, int radix, int width, int n) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix, n);
        }
    }
    public static void radixSingleSort(ArrayList<String> input, int position, int radix, int n) {
        int[] countArray = new int[radix];
        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        String[] temp = new String[n];
        for (int tempIndex = n - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input.get(tempIndex))]] = input.get(tempIndex);
        }
        for (int tempIndex = 0; tempIndex < n; tempIndex++) {
            input.set(tempIndex, temp[tempIndex]);
        }
    }
    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}