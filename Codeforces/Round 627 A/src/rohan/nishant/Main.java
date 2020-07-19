package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for (int i=0;i<t;++i) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0;j<n;++j)
                arr[j] = sc.nextInt();
            int[] count = new int[2];
            for (int j=0;j<n;++j)
                count[arr[j]%2]++;
            if (count[0] !=0 && count[1] !=0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}