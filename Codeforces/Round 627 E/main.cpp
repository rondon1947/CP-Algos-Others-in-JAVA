#include <bits/stdc++.h>
using namespace std;
int dpArray[2001][2001];
int timings[2001];
int main() {
    int n, h, l, r;
    cin >> n >> h >> l >> r;
    for (int i = 1; i <= n; ++i)
        cin >> timings[i];
    dpArray[0][0] = 0;
    for (int i = 1; i < h; ++i)
        dpArray[0][i] = -1;
    for (int i = 0; i < n; ++i) {
        for (int hr = 0; hr < h; ++hr)
            dpArray[i + 1][hr] = -1;
        for (int hr = 0; hr < h; ++hr) {
            if (dpArray[i][hr] == -1)
                continue;

        }
    }
    return 0;
}
