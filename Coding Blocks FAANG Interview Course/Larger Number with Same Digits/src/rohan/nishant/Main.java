package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(largerNumberSameDigits(n));
    }

    private static int largerNumberSameDigits(int n) {
        int N = 9, ans, j = N - 1;
        int[] arr = new int[N];
        while (n > 0) {
            if (j < 0)
                return -1;
            arr[j--] = n % 10;
            n /= 10;
        }
        int s = j + 1, e = 8;
        while (e > s) {
            if (arr[e] > arr[e - 1])
                break;
            e--;
        }
        if (e == s)
            return -1;
        int pos1 = e - 1, pos2 = e;
        while (e < N) {
            if ((arr[e] > arr[pos1]) && (arr[e] < arr[pos2]))
                pos2 = e;
            ++e;
        }
        swap(arr, pos1, pos2);
        for (int i = pos1 + 1; i < N; ++i)
            for (int k = pos1 + 1; k < N - 1; ++k)
                if (arr[k] > arr[k + 1])
                    swap(arr, k, k + 1);
        ans = formNumber(arr, s);
        return ans;
    }

    private static int formNumber(int[] arr, int s) {
        int p = 0, i = 8, ans = 0;
        while (i >=s) {
            int x = (int)(arr[i]*Math.pow(10, p));
            ans+=x;
            ++p;
            --i;
        }
        return ans;
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
