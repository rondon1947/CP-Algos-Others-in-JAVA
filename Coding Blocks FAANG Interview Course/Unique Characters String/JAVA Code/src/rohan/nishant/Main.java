package rohan.nishant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            arr.add(sc.nextLine());
        System.out.println(uniqueCharactersString(arr));
    }

    private static int uniqueCharactersString(List<String> arr) {
        String s = "";
        return myFunction(arr, 0, s);
    }

    private static int myFunction(List<String> arr, int i, String s) {
        if (i == arr.size()) {
            int[] freq = new int[26];
            for (int k = 0;k<s.length();++k) {
                if (freq[s.charAt(k) - 'a'] == 1)
                    return 0;
                freq[s.charAt(k) - 'a']++;
            }
            return s.length();
        }
        int op1, op2;
        op1 = Integer.MIN_VALUE;
        if ((s.length() + arr.get(i).length()) <= 26)
            op1 = myFunction(arr, i + 1, s + arr.get(i));
        op2 = myFunction(arr, i+1, s);
        return Math.max(op1, op2);
    }
}
