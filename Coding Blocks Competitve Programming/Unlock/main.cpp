#include <bits/stdc++.h>

using namespace std;
#pragma GCC target ("avx2")
#pragma GCC optimization ("O3")
#pragma GCC optimization ("unroll-loops")

#define ll long long

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    ll t;
    t = 1;
    while (t--) {
        int n, k;
        cin >> n >> k;
        int arr[n + 1];
        map<int, int> mp;
        for (int i = 1; i <= n; i++) {
            cin >> arr[i];
            mp[arr[i]] = i;
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] + i != n + 1) {
                cnt++;
                int in = mp[n + 1 - i];
                mp[arr[i]] = in;
                arr[in] = arr[i];
                arr[i] = n + 1 - i;
            }
            if (cnt == k)
                break;
        }
        for (int i = 1; i <= n; i++)
            cout << arr[i] << " ";
    }
}