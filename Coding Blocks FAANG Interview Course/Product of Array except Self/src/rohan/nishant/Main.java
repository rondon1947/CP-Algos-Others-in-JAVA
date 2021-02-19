package rohan.nishant;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    BigInteger[] arr = new BigInteger[n];
	    BigInteger prod = new BigInteger("1");
	    for (int i = 0;i<n;++i) {
            arr[i] = new BigInteger(sc.next());
            prod = prod.multiply(arr[i]);
        }
	    for (int i = 0;i<n;++i)
	        System.out.print((prod.divide(arr[i])) + " ");
	    System.out.println();
    }
}
