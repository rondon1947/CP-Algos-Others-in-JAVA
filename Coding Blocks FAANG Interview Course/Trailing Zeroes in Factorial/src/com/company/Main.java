package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), count = 0, div = 5;
	    while((n/div) >= 1) {
	        count += (n/div);
	        div = div*5;
        }
	    System.out.println(count);
    }
}
