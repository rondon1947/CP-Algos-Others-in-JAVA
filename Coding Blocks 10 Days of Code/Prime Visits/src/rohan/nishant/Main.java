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