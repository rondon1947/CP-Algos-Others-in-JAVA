#include <bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin >> t;
    while(t--) {
        int n, multiplier = 1;
        cin >> n;
        vector<int> ans;
        while (n > 0) {
            int j = n % 10;
            if (j > 0)
                ans.push_back((j * multiplier));
            multiplier *= 10;
            n /= 10;
        }
        cout << ans.size() << endl;
        for (auto i : ans)
            cout << i << " ";
        cout << endl;
    }
    return 0;
}
