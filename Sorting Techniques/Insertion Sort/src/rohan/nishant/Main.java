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
        for (int i = 1; i < n; ++i) {
            int elementToBeSorted = arr.get(i);
            int lastSortedIndex = i - 1;
            while (lastSortedIndex >= 0 && elementToBeSorted < arr.get(lastSortedIndex)) {
                arr.set(lastSortedIndex + 1, arr.get(lastSortedIndex));
                lastSortedIndex--;
            }
            arr.set(lastSortedIndex+1, elementToBeSorted);
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}