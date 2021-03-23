package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int num) {
        if(num < 0 || (num % 10 == 0 && num != 0))
            return false;
        int reverseNumber = 0;
        while(num > reverseNumber) {
            reverseNumber = reverseNumber * 10 + num % 10;
            num /= 10;
        }
        return num == reverseNumber || num == reverseNumber/10;
    }
}