/*Coding Blocks
Take as input N, an odd number (>=5) . Print the following pattern as given below for N = 7.

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Input Format
Enter value of N ( >=5 )

Constraints
5 <= N <= 99

Output Format
Print the required pattern.

Sample Input
7
Sample Output
*  ****
*  *
*  *
*******
   *  *
   *  *
****  *
Explanation
Catch the pattern for the corresponding input and print it accordingly.*/

package rohan.nishant;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nst1 = n / 2;
        int nst2 = n - nst1;
        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                for (int cst1 = 1; cst1 <= nst1; cst1++)
                    if (cst1 != 1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                for (int cst2 = 1; cst2 <= nst2; cst2++)
                    System.out.print("*");
            } else if (row < nst2) {
                for (int cst1 = 1; cst1 <= nst1; cst1++)
                    if (cst1 == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                for (int cst2 = 1; cst2 <= nst2; cst2++)
                    if (cst2 == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            } else if (row == nst2) {
                for (int cst1 = 1; cst1 <= nst1; cst1++)
                    System.out.print("*");
                for (int cst2 = 1; cst2 <= nst2; cst2++)
                    System.out.print("*");
            }
            if (row < n && row > nst2) {
                for (int cst1 = 1; cst1 <= nst1; cst1++)
                    System.out.print(" ");
                for (int cst2 = 1; cst2 <= nst2; cst2++)
                    if (cst2 == nst2 || cst2 == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            } else if (row == n) {
                for (int cst1 = 1; cst1 <= nst1; cst1++)
                    System.out.print("*");
                for (int cst2 = 1; cst2 <= nst2; cst2++)
                    if (cst2 == 1 || cst2 == nst2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println();
        }
    }
}