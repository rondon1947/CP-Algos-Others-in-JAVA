#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int cost[n][m], dp[n][m];
    for (int i = 0; i < n; ++i)
        for (int j = 0; j < m; ++j)
            cin >> cost[i][j];
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            if ((i == 0) && (j == 0))
                dp[i][j] = cost[i][j];
            else if (i == 0)
                dp[i][j] = dp[i][j - 1] + cost[i][j];
            else if (j == 0)
                dp[i][j] = dp[i - 1][j] + cost[i][j];
            else {
                dp[i][j] = cost[i][j] + min(dp[i - i][j], dp[i][j - 1]);
            }
        }
    }
    cout << dp[n - 1][m - 1];
    return 0;
}
