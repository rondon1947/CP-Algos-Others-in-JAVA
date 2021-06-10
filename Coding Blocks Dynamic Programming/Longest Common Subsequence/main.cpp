#include <bits/stdc++.h>

using namespace std;

int main() {
    string a, b;
    getline(cin, a);
    getline(cin, b);
    int n = (int) a.length(), m = (int) b.length();
    int dpArray[n + 1][m + 1];
    for (int i = 0; i <= n; ++i)
        for (int j = 0; j <= m; ++j)
            dpArray[i][j] = 0;
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= m; ++j) {
            if (a[i - 1] == b[j - 1])
                dpArray[i][j] = 1 + dpArray[i - 1][j - 1];
            else
                dpArray[i][j] = max(dpArray[i][j - 1], dpArray[i - 1][j]);
        }
    }
    char ans[dpArray[n][m]];
    int cnt = 0;
    int i = n, j = m;
    while ((i > 0) && (j > 0)) {
        if (dpArray[i][j] == dpArray[i][j - 1])
            j--;
        else if (dpArray[i][j] == dpArray[i - 1][j])
            i--;
        else {
            i--;
            j--;
            ans[cnt++] = a[i];
        }
    }
    reverse(ans, ans + cnt);
    for (int x = 0; x < cnt; x++)
        cout << ans[x];
    cout << endl;
    return 0;
}