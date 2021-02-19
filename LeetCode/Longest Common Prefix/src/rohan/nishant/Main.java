package rohan.nishant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = new String[n];
        for (int i = 0; i < n; ++i)
            s[i] = sc.nextLine();
        System.out.println(longestCommonPrefix(s));
    }

    private static String longestCommonPrefix(String[] s) {
        if(s.length == 0)
            return "";
        else {
            ArrayList<Character> ans = new ArrayList<>();
            StringBuilder finalAnswer = new StringBuilder();
            int n = s.length, minLength = s[0].length();
            for (int i = 1; i < n; ++i)
                minLength = Math.min(minLength, s[i].length());
            for (int i = 0; i < minLength; ++i) {
                int flag = 0, j;
                for (j = 1; j < n; ++j) {
                    if (s[j].charAt(i) != s[j - 1].charAt(i)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    ans.add(s[0].charAt(i));
                else
                    break;
            }
            if (ans.size() > 0) {
                for (Character an : ans)
                    finalAnswer.append(an);
                return String.valueOf(finalAnswer);
            }
            else
                return "";
        }
    }
}
