package rohan.nishant;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; ++i)
            a.add(sc.nextInt());
        for (int i = 0; i < n; ++i)
            cnt.put(a.get(i), 0);
        for (int i=0;i<n;++i)
            cnt.put(a.get(i), cnt.get(a.get(i)) + 1);
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        assert maxEntry != null;
        n = maxEntry.getValue() + 1;
        ArrayList<Integer> dp = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            dp.add(0);
        for (int i = 1; i < dp.size(); i++) {
            dp.set(i, dp.get(i - 1));
            dp.set(i, Math.max(dp.get(i), (i >= 2 ? dp.get(i - 2) : 0) + cnt.get(a.get(i)) * i));
        }
        System.out.println(dp.get(dp.size() - 1));
    }
}