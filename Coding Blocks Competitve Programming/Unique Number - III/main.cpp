#include <bits/stdc++.h>

using namespace std;

int main() {
    int cnt[64] = {0};
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        int j = 0;
        while (x > 0) {
            int lastBit = (n & 1);
            cnt[j] += lastBit;
            j++;
            x = x >> 1;
        }
    }
    int p = 1, ans = 0;
    for (int i = 0; i < 64; ++i) {
        cnt[i] %= 3;
        ans += (cnt[i] * p);
        p = p << 1;
    }
    cout << ans << endl;
    return 0;
}
