package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()), lastPosition = 0, i;
        ArrayList<String> arr = new ArrayList<>();
        String str = sc.nextLine();
        for (i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ') {
                arr.add(str.substring(lastPosition, i));
                lastPosition = i + 1;
            }
            if (arr.size() == (n - 1))
                break;
        }
        arr.add(str.substring(i + 1));
        System.out.println(arr.toString());
        String word1 = sc.next(), word2 = sc.next();
        int pos1 = -1, pos2 = -1;
        int ans = arr.size();
        for (i = 0; i < arr.size(); i++) {
            if (word1.equals(arr.get(i))) {
                pos1 = i;
            } else if (word2.equals(arr.get(i))) {
                pos2 = i;
            }
            if (pos1 >= 0 && pos2 >= 0) {
                ans = Math.min(ans, Math.abs(pos1 - pos2));
            }
        }
        System.out.println(ans);
    }
}
