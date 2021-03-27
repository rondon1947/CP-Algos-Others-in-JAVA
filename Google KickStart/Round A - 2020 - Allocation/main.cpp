#include <bits/stdc++.h>
using namespace std;
int main() {
    int t, k;
    cin >> t;
    k = t;
    while (t--) {
        int n, b, ans = 0, rem;
        cin >> n >> b;
        rem = b;
        int cost[n];
        for (int i = 0; i < n; ++i)
            cin >> cost[i];
        sort(cost, cost + n);
        for (int i = 0; i < n; ++i) {
            rem = rem - cost[i];
            if (rem < 0)
                break;
            ans++;
        }
        cout << "Case #" << (k - t) << ": " << ans << endl;
    }
    return 0;
}
