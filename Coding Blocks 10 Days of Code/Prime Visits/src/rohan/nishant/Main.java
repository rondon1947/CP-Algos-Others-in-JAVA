/*Coding Blocks
PMO gives two random numbers a & b to the Prime Minister. PM Modi wants to visit all countries between a and b (inclusive) , However due to shortage of time he can't visit each and every country , So PM Modi decides to visit only those countries,for which country number has two divisors. So your task is to find number of countries Mr. Modi will visit.



Input Format
The first line contains N , no of test cases. The next N lines contain two integers a and b denoting the range of country numbers.

Constraints
a<=1000000 & b<=1000000.
N<=1000

Output Format
Output contains N lines each containing an answer for the test case.

Sample Input
2
1 10
11 20
Sample Output
4
4
Explanation
PM Modi chooses countries with numbers 2,3,5 and 7 for the first testcase.
For the second testcase , he chooses countries with numbers 11,13,17 and 19.*/
package rohan.nishant;
import java.util.*;
public class Main {
    public static void simpleSieve(int limit, ArrayList<Integer> prime)
    {
        boolean[] mark = new boolean[limit + 1];
        Arrays.fill(mark, false);
        for (int i = 2; i <= limit; ++i) {
            if (!mark[i]) {
                prime.add(i);
                for (int j = i; j <= limit; j += i)
                    mark[j] = true;
            }
        }
    }
    public static int primesInRange(int low, int high)
    {
        int count=0;
        int limit = (int) (Math.floor(Math.sqrt(high)) + 1);
        ArrayList<Integer> prime = new ArrayList<>();
        simpleSieve(limit, prime);
        int n = high - low + 1;
        boolean[] mark = new boolean[n + 1];
        Arrays.fill(mark, false);
        if ( low <= 1 ) low = 2;
        for (Integer integer : prime) {
            int loLim = (int) (Math.floor(low / integer) * integer);
            if (loLim < low)
                loLim += integer;
            if (loLim == integer)
                loLim += integer;
            for (int j = loLim; j <= high; j += integer)
                mark[j - low] = true;
        }
        for (int i = low; i <= high; i++)
            if (!mark[i - low])
                count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=1;x<=t;++x) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(primesInRange(a,b));
        }
    }
}