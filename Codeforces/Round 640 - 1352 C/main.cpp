#include <bits/stdc++.h>
#define ll long long int
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        ll n, k;
        cin >> n >> k;
        ll x = k / (n - 1), rem = k - (x * (n - 1)), ans;
        if (rem > 0)
            ans = (x * n) + rem;
        else
            ans = (x * n) - 1;
        cout << ans << endl;
    }
    return 0;
}
