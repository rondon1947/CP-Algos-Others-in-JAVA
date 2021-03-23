package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), t = sc.nextLine();
        System.out.println(stringConversion(s, t));
    }

    private static boolean stringConversion(String s, String t) {
        int n = s.length(), m = t.length();
        if (n > m)
            return stringConversion(t, s);
        if ((m - n) > 1)
            return false;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) != t.charAt(i)) {
                boolean c1 = s.substring(i + 1).equals(t.substring(i + 1));
                boolean c2 = s.substring(i).equals(t.substring(i + 1));
                return (c1 || c2);
            }
        }
        return (m > n);
    }
}
