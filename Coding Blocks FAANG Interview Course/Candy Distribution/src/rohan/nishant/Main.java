package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        int[] candy = new int[n];
        candy[0] = 1;
        for (int i = 1; i < n; ++i)
            if (arr[i] > arr[i - 1])
                candy[i] = candy[i - 1] + 1;
            else
                candy[i] = 1;
        for (int i = (n - 2); i >= 0; --i)
            if (arr[i] > arr[i + 1])
                if (candy[i] <= candy[i + 1])
                    candy[i] = candy[i + 1] + 1;
        long sum = 0;
        for (int i : candy)
            sum += i;
        System.out.println(sum);
    }
}