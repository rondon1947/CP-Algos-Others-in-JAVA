package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(romanToInteger(s));
    }

    public static int converter(char ch) {
        if (ch == 'I')
            return 1;
        else if (ch == 'V')
            return 5;
        else if (ch == 'X')
            return 10;
        else if (ch == 'L')
            return 50;
        else if (ch == 'C')
            return 100;
        else if (ch == 'D')
            return 500;
        else if (ch == 'M')
            return 1000;
        else
            return 0;
    }

    private static int romanToInteger(String s) {
        int ans = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            int num1 = converter(s.charAt(i));
            if ((i + 1) < n) {
                int num2 = converter(s.charAt((i + 1)));
                if (num1 > num2)
                    ans = ans + num1;
                else {
                    ans = ans + num2 - num1;
                    i++;
                }
            }
            else
                ans = ans + num1;
        }
        return ans;
    }
}
