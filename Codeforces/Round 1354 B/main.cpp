#include <bits/stdc++.h>

using namespace std;
#define w(t) int t; cin >> t; while(t--)

int main() {
    w(t) {
        string s;
        cin >> s;
        int count[4] = {};
        int l = 0, n = s.length(), ans = n + 1;
        for (int r = 0; r < n; ++r) {
            int dig = s[r] - '0';
            count[dig]++;
            while (count[s[l] - '0'] > 1) {
                count[s[l] - '0']--;
                l++;
            }
            if (count[1] && count[2] && count[3])
                ans = min(ans, r - l + 1);
        }
        if (ans == (n + 1))
            ans = 0;
        cout << ans << endl;
    }
    return 0;
}
