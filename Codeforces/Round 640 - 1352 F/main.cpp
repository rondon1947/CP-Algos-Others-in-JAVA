#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n0, n1, n2;
        cin >> n0 >> n1 >> n2;
        string ans;
        if ((n1 == 0) && (n2 == 0)) {
            for (int i = 0; i <= n0; ++i)
                ans += "0";
        } else if ((n0 == 0) && (n1 == 0)) {
            for (int i = 0; i <= n2; ++i)
                ans += "1";
        } else {
            for (int i = 0; i < n0; ++i)
                ans += "0";
            ans += "01";
            n1--;
            for (int i = 0; i < n2; ++i)
                ans += "1";
            int temp = 0, sign = 1;
            for (int i = 0; i < n1; ++i) {
                ans += std::to_string(temp);
                temp += sign;
                sign *= -1;
            }
        }
        cout << ans << endl;
    }
    return 0;
}
