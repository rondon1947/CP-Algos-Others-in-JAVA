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
        for (int i=0;i<n;++i) {
            int minTerm = arr.get(i);
            int minPosition = i;
            for (int j=i;j<n;++j) {
                if(arr.get(j)<minTerm) {
                    minTerm = arr.get(j);
                    minPosition = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, minTerm);
            arr.set(minPosition, temp);
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}