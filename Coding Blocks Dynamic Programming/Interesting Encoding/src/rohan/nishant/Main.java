/*
Alice and Bob are planning to send encrypted messages to each other. Alice has decided to assign 'A' to code 1, 'B'
to the code 2,…… 'Z' to code 26. Now he wonders given an encrypted message how many different decoding they can form.
Input Format

The first line consists of an integral value denoting number of test cases 't'. Then 't' lines follows each containing
encrypted string of length 'n'.
Constraints

1<=n<=5000
Output Format

In each line output the required answer.
Sample Input

1
25114

Sample Output

6

Explanation

25114 can be decoded as 'BEAN','BEAAD', 'YAAD', 'YAN', 'YKD', 'BEKD'.

*/

package rohan.nishant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int j = 1; j <= t; ++j) {
            String s = sc.nextLine();
            int n = s.length();
            long[] dpArray = new long[n + 1];
            dpArray[0] = 1;
            dpArray[1] = isValid(s.charAt(0) - '0');
            for (int i = 2; i <= s.length(); i++) {
                if (s.charAt(i - 2) == '0') {
                    dpArray[i] = isValid(s.charAt(i - 1) - '0') * (dpArray[i - 1]);
                } else {
                    dpArray[i] = (isValid(s.charAt(i - 1) - '0') * dpArray[i - 1])
                            + (isValid((((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0')))) * dpArray[i - 2]);
                }
            }
            System.out.println(dpArray[n]);
        }
    }

    private static int isValid(int i) {
        return (i >= 1 && i <= 26)?1:0;
    }
}