#include <bits/stdc++.h>

#define ll long long int
using namespace std;

int main() {
    ll t;
    cin >> t;
    while (t--) {
        ll a, b, c, d;
        cin >> a >> b >> c >> d;
        if (b >= a)
            cout << b << endl;
        else if (d >= c)
            cout << "-1" << endl;
        else {
            ll ans = b, more, one = c - d;
            more = ((a - b + one - 1) / one) * c;
            ans+= more;
            cout << ans << endl;
        }
    }
    return 0;
}
