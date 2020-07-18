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
            for (int j=i;j<n;++j) {
                if(arr.get(i)>arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + "\t");
    }
}