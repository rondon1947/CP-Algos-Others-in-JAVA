/*
Mike’s boss gave him a string of opening and closing parenthesis asked him to find a valid parenthesis substring in it.
He will get number of bounties equal to the length of substring he finds in return. What is the maximum amount of
number of bounties he can get?
Input Format

The input file has a single line which contains a single string str that Mike's boss gave to him.
Constraints

1 <= |str| <= 100000
Output Format

Print, in a single line, the maximum amount of number of bounties Mike can get
Sample Input

(()(()()

Sample Output

4
*/

package rohan.nishant;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(jobForBounties(s));
    }

    private static int jobForBounties(String s) {
        s = " " + s;
        int n = s.length();
        int maxAnswer = Integer.MIN_VALUE;
        int[] dpArray = new int[n];
        Stack<Integer> openingParenthesis = new Stack<>();
        for (int i = 1; i < n; ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openingParenthesis.push(i);
                dpArray[i] = 0;
            } else {
                if (openingParenthesis.isEmpty())
                    dpArray[i] = 0;
                else {
                    int temp = openingParenthesis.pop();
                    dpArray[i] = (i - temp + 1) + dpArray[temp - 1];
                }
            }
            maxAnswer = Math.max(maxAnswer, dpArray[i]);
        }
        return maxAnswer;
    }
}
