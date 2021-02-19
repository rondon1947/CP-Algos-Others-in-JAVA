#include<bits/stdc++.h>

using namespace std;
#define ll long long int

int main() {
    ll t = 1;
    while (t--) {
        ll n;
        cin >> n;
        ll mod = 1000000007;
        ll a = 1;
        ll b = 2;
        if (n == 1)cout << a << endl;
        else if (n == 2)cout << b << endl;
        else {
            ll c;
            for (ll i = 3; i <= n; i++) {
                c = a + b;
                c %= mod;
                a = b;
                b = c;
            }
            cout << c << endl;
        }
    }
}