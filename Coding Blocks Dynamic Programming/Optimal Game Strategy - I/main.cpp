#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
    int n;
    cin >> n;
    ll values[n + 1];
    for (int i = 1; i <= n; ++i)
        cin >> values[i];
    ll ans = 0;
    ll dpArray[n + 1][n + 1];
    for (int gap = 1; gap <= n; ++gap) {
        for (int i = 1, j = gap; j <= n; ++i, ++j) {
            ll x = ((i + 2) <= j) ? dpArray[i + 2][j] : 0;
            ll y = ((i + 1) <= (j - 1)) ? dpArray[i + 1][j - 1] : 0;
            ll z = (i <= (j - 2)) ? dpArray[i][j - 2] : 0;
            dpArray[i][j] = max((values[i] + min(x, y)), (values[j] + min(y, z)));
        }
    }
    cout << dpArray[1][n] << endl;
}