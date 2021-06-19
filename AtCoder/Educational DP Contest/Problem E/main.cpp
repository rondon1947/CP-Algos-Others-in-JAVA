#include <bits/stdc++.h>

using namespace std;

struct item {
    int weight, value;
};

int main() {
    int N, W;
    cin >> N >> W;
    vector<item> items(N + 1);
    for (int i = 1; i <= N; ++i)
        cin >> items[i].weight >> items[i].value;
    int maxValue = N * 1000;
    long long int dpArray[N + 1][maxValue + 1];
    for (int i = 0; i <= maxValue; ++i)
        dpArray[1][i] = INT_MAX;
    dpArray[1][0] = 0;
    dpArray[1][items[1].value] = items[1].weight;
    for (int i = 2; i <= N; ++i) {
        for (int j = 0; j <= maxValue; ++j) {
            dpArray[i][j] = dpArray[(i - 1)][j];
            if (items[i].value > j)
                continue;
            dpArray[i][j] = min(dpArray[i][j], items[i].weight + dpArray[(i - 1)][j - items[i].value]);
        }
    }
    // for (int i = 0; i <= N; ++i) {
    //     for (int j = 0; j <= maxValue; ++j)
    //         cout << dpArray[i][j] << " ";
    //     cout << endl;
    // }
    int ans = 0;
    for (int i = 0; i <= maxValue; ++i)
        if (dpArray[N][i] <= W)
            ans = max(ans, i);
    cout << ans << endl;
}