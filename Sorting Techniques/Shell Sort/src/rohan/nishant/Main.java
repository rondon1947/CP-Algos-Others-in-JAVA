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
        for (int gap = arr.size() / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.size(); i++) {
                int newElement = arr.get(i);
                int j = i;
                while (j >= gap && arr.get(j - gap) > newElement) {
                    arr.set(j, arr.get(j - gap));
                    j -= gap;
                }
                arr.set(j, newElement);
            }
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}