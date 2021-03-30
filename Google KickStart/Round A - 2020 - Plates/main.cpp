#include <bits/stdc++.h>

using namespace std;

const int N = 51, K = 31, P = (51 * 30);
int n, k, p;
int arr[N][K], prefixArray[N][K];
int cache[N][P];

int myRecursiveFunction(int index, int platesTaken) {

}

int main() {
    int t, T;
    cin >> t;
    T = t;
    while (t--) {
        memset(cache, -1, sizeof(cache));
        cin >> n >> k >> p;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k; ++j) {
                cin >> arr[i][j];
                prefixArray[i][j] = prefixArray[i][(j - 1)] + arr[i][j];
            }
        }
        int ans = myRecursiveFunction(1, 0);
        cout << "Case #" << (T - t) << ": " << ans;
    }
    return 0;
}
