/*Coding Blocks
The Planet Earth is under a threat from the aliens of the outer space and the Marvel Avengers team is busy fighting against them. Meanwhile, The Incredible Hulk has to defeat an enemy who is N steps above the level where he is standing (assume it as the 0th level). Hulk, because of his incredible jumping ability can take jumps in power of 2. In order to defeat the enemy as quickly as possible he has to reach the Nth step in minimum moves possible. Help Hulk to find the same and contribute in saving the Mother Earth.



Input Format
The first line contains the number of test cases T. T test cases follow: The first line of each test case contains a number N.

Constraints
1 <= T <= 10
1 <= N <= 10^5

Output Format
Output T lines, containing the minimum number of moves required by Hulk to reach the Nth step

Sample Input
3
3
4
5
Sample Output
2
1
2
Explanation
Let total steps is n, find the nearest integer which is of power 2 and less then n. let it would be k. now remaining steps to cover is n-k and result = 1 + min steps for (n-k) remaining steps.*/

package rohan.nishant;
import java.util.*;
public class Main {
    public static int count(int now) {
        if((((now&(now-1)) == 0))) {
            return 1;
        }
        int x=(int)((Math.log(now)/Math.log(2)));
        x=(int)(Math.pow(2,x));
        return 1+count(now-x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;++i) {
            int now = sc.nextInt();
            if((((now&(now-1)) == 0))) {
                System.out.println("1");
            }
            else
                System.out.println(count(now));
        }
    }
}