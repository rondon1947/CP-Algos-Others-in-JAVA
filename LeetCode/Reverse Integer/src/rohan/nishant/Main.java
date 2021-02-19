package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println(reverse(n));
    }
    public static int reverse(int n) {
        StringBuilder s = new StringBuilder();
        if (n >= 0) {
            s.append(n);
            s.reverse();
            long temp = Long.parseLong(String.valueOf(s));
            if (temp <= Integer.MAX_VALUE) {
                n = Integer.parseInt(String.valueOf(s));
                return n;
            }
            else
                return 0;
        }
        else {
            if (n == Integer.MIN_VALUE)
                return 0;
            else {
                n = n * -1;
                System.out.println(n);
                s.append(n);
                s.reverse();
                long temp = (-1 * Long.parseLong(String.valueOf(s)));
                if (temp >= Integer.MIN_VALUE) {
                    n = (-1 * Integer.parseInt(String.valueOf(s)));
                    return n;
                } else
                    return 0;
            }
        }
    }
}
