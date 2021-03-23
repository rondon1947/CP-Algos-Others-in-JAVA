/* n/3, n/2, n-1*/
package rohan.nishant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        int[] dpTopDown = new int[n+1];
        dpTopDown[1] = 0;
        dpTopDown[2] = 1;
        System.out.println(minimumStepsToOneTopDown(n, dpTopDown));
        int[] dpBottomUp = new int[n+1];
        dpBottomUp[1] = 0;
        dpBottomUp[2] = 1;
        System.out.println(minimumStepsToOneBottomUp(n, dpBottomUp));
    }

    private static int minimumStepsToOneBottomUp(int n, int[] dpBottomUp) {
        for (int i=3;i<=n;++i) {
            int answer1=Integer.MAX_VALUE, answer2=Integer.MAX_VALUE, answer3;
            if (i%3 == 0)
                answer1 = dpBottomUp[i/3];
            if (i%2 == 0)
                answer2 = dpBottomUp[i/2];
            answer3 = dpBottomUp[i-1];
            dpBottomUp[i] = Math.min(Math.min(answer1, answer2), answer3) + 1;
        }
        return dpBottomUp[n];
    }

    private static int minimumStepsToOneTopDown(int n, int[] dpTopDown) {
        if (n==1 || n==2)
            return (n-1);
        if (dpTopDown[n]!=0)
            return dpTopDown[n];
        int answer1=Integer.MAX_VALUE, answer2=Integer.MAX_VALUE, answer3=Integer.MAX_VALUE;
        if (n%3 == 0)
            answer1 = minimumStepsToOneTopDown(n/3, dpTopDown);
        if (n%3 == 0)
            answer1 = minimumStepsToOneTopDown(n/3, dpTopDown);
        answer3 = minimumStepsToOneTopDown(n-1, dpTopDown);
        dpTopDown[n] = Math.min(Math.min(answer1, answer2), answer3) + 1;
        return dpTopDown[n];
    }
}