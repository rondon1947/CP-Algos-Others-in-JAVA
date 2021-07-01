#include <bits/stdc++.h>

using namespace std;

#define ll long long int

ll dp[10001][10001];
ll optimal_strategy(ll ar[], ll i, ll j) {
    if (i > j)
        return 0;
    if (dp[i][j] != -1)
        return dp[i][j];
    int q1 = ar[i] + min(optimal_strategy(ar, i + 2, j), optimal_strategy(ar, i + 1, j - 1));
    int q2 = ar[j] + min(optimal_strategy(ar, i, j - 2), optimal_strategy(ar, i + 1, j - 1));
    int q = max(q1, q2);
    dp[i][j] = q;
    return dp[i][j];
}
int main() {
    ll n;
    cin >> n;
    ll ar[n];
    for (int i = 0; i < n; i++)
        cin >> ar[i];
    for (int i = 0; i <= n; i++)
        for (int j = 0; j <= n; j++)
            dp[i][j] = -1;
    ll ans = optimal_strategy(ar, 0, n - 1);
    cout << ans;
    return 0;
}
