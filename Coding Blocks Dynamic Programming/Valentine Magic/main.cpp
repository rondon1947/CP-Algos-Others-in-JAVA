#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    vector<int> boys, girls;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        boys.push_back(x);
    }
    for (int i = 0; i < m; ++i) {
        int x;
        cin >> x;
        girls.push_back(x);
    }
    sort(boys.begin(), boys.end());
    sort(girls.begin(), girls.end());
    vector<int> visited;
    long ans = 0;
    for (int i = 0; i < n; ++i) {
        int boy = boys[i];
        auto idx = lower_bound(girls.begin(), girls.end(), boy) - girls.begin();
        auto finder = std::find(visited.begin(), visited.end(), idx);
        auto finder1 = std::find(visited.begin(), visited.end(), (idx - 1));
        if ((finder != visited.end()) && (girls[idx] == boy)) {
            ans += 0;
            visited.push_back(idx);
        }
        else {
            int op1 = abs(boy - girls[idx]), op2 = abs(boy - girls[(idx - 1)]);
            if ((finder != visited.end()) && (op1 <= op2))
                ans += op1;
            else if ((finder1 != visited.end()) && (op2 < op1))
                ans += op2;
        }
    }
    cout << ans << endl;
}