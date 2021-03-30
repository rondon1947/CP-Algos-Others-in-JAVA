#include <bits/stdc++.h>

#define ll long long int
using namespace std;

int main() {
    int n;
    cin >> n;
    int stones[n + 1];
    ll costs[n + 1];
    costs[0] = costs[1] = stones[0] = 0;
    for (int i = 1; i <= n; ++i)
        cin >> stones[i];
    for (int i = 2; i <= n; ++i) {
        ll option1 = costs[i - 1] + abs(stones[i] - stones[i - 1]);
        ll option2 = (i == 2) ? INT_MAX : (costs[i - 2] + abs(stones[i] - stones[i - 2]));
        costs[i] = min(option1, option2);
    }
    cout << costs[n] << endl;
    return 0;
}
