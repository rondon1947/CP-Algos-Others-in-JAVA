package rohan.nishant;

import java.util.*;

public class Main {
    static int max = 1000000009;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1;i<=max;++i)
            arr.add(0);
        int flag = 0, n = sc.nextInt(), maxNum = 0;
        for (int i = 0; i < n; ++i) {
            int temp = sc.nextInt();
            int temp1 = arr.get(temp);
            arr.set(temp, ++temp1);
            if (temp > maxNum)
                maxNum = temp;
        }
        for (int i = 0; i <= maxNum; ++i) {
            if (arr.get(i) > Math.floor(n / 3.0)) {
                System.out.print(i + " ");
                flag = 1;
            }
        }
        if (flag == 0)
            System.out.println("No Majority Elements");
    }
}