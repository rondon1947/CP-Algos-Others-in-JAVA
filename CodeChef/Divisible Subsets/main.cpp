#include <bits/stdc++.h>

#define ll long long int
using namespace std;
ll freqArray[1000005], arr[1000005];

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        ll sum = 0;
        memset(freqArray, 0, sizeof(freqArray));
        freqArray[0] = 1;
        for (int i = 0; i < n; ++i) {
            cin >> arr[i];
            sum += arr[i];
            sum %= n;
            sum = (sum + n) % n;
            freqArray[sum]++;
        }
        ll ans = 0;
        for (int i = 0; i < n; ++i) {
            ll m = freqArray[i];
            ans += (m * (m - 1)) / 2;
        }
        cout << ans << endl;
    }
    return 0;
}
