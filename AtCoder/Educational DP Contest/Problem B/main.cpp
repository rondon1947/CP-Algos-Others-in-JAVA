#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    int heights[n + 1];
    heights[0] = 0;
    for (int i = 1; i <= n; ++i)
        cin >> heights[i];
    int costs[n + 1];
    costs[1] = 0;
    for (int i = 2; i <= n; ++i) {
        costs[i] = INT_MAX;
        for (int j = (i - 1); ((j >= 1) && ((i - j) <= k)); --j) {
            costs[i] = min(costs[i], (abs(heights[i] - heights[j]) + costs[j]));
        }
    }
    cout << costs[n] << endl;
    return 0;
}
