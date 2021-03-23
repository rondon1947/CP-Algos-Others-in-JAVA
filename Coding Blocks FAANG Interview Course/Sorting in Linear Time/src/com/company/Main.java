package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countZero = 0, countOne = 0, countTwo = 0, temp;
        for (int i = 0; i < n; ++i) {
            temp = sc.nextInt();
            if (temp == 0)
                countZero++;
            else if (temp == 1)
                countOne++;
            else
                countTwo++;
        }
        for (int i = 0; i < countZero; ++i)
            System.out.print("0 ");
        for (int i = 0; i < countOne; ++i)
            System.out.print("1 ");
        for (int i = 0; i < countTwo; ++i)
            System.out.print("2 ");
    }
}
