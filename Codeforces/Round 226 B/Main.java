package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(bearsAndStrings(s));
    }

    private static long bearsAndStrings(String s) {
        long ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            int j = s.substring(i).indexOf("bear");
            if (j != -1)
                ans += s.length()-(i+j+3);
        }
        return ans;
    }
}
