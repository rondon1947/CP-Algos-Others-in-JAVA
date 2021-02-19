package rohan.nishant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int totalParathas = sc.nextInt(), totalCooks = sc.nextInt();
            int[] ranks = new int[totalCooks];
            for (int i = 0; i < totalCooks; ++i)
                ranks[i] = sc.nextInt();
            Arrays.sort(ranks);
            int start = 0, end = Integer.MAX_VALUE, answer = Integer.MAX_VALUE;
            while (start <= end) {
            	int mid = (start + end) / 2;
            	if (isPossible(mid, totalParathas, totalCooks, ranks)) {
            		answer = Math.min(answer, mid);
            		end = mid - 1;
				} else
					start = mid + 1;
			}
            System.out.println(answer);
            --t;
        }
    }

	private static boolean isPossible(int mid, int totalParathas, int totalCooks, int[] ranks) {
    	for (int i = 0; i < totalCooks; ++i) {
    		long timeTaken = 0, parathasPerCook = 1;
    		while (timeTaken + parathasPerCook * ranks[i] <= mid && totalParathas > 0) {
    			timeTaken += parathasPerCook*ranks[i];
    			parathasPerCook++;
    			totalParathas--;
			}
    		if (totalParathas == 0)
    			return true;
		}
		return totalParathas == 0;
	}
}
