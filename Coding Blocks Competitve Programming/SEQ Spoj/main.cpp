#include <bits/stdc++.h>

using namespace std;
#define ll long long
#define mod 1000000000
int k;
vector<ll> b, c;

vector<vector<ll>> myMultiplyFunction(vector<vector<ll>> A, vector<vector<ll>> B) {
    vector<vector<ll>> C(k + 1, vector<ll>(k + 1));
    for (int i = 0; i <= k; ++i)
        for (int j = 0; j <= k; ++j)
            C[i][j] = 0;
    for (int i = 1; i <= k; ++i)
        for (int j = 1; j <= k; ++j)
            for (int l = 1; l <= k; ++l)
                C[i][j] = (C[i][j] + (A[i][l] * B[l][j]) % mod) % mod;
    return C;
}

vector<vector<ll>> myPowerFunction(vector<vector<ll>> M, ll p) {
    if (p == 1)
        return M;
    if (p & 1)
        return myMultiplyFunction(M, myPowerFunction(M, p - 1));
    vector<vector<ll>> temp = myPowerFunction(M, p / 2);
    return myMultiplyFunction(temp, temp);
}

ll myFunction(ll n) {
    if (n == 0)
        return 0;
    if (n <= k)
        return b[n];
    vector<vector<ll>> T(k + 1, vector<ll>(k + 1));
    for (int i = 1; i <= k; ++i) {
        for (int j = 1; j <= k; ++j) {
            if (i < k) {
                if (j == (i + 1))
                    T[i][j] = 1;
                else
                    T[i][j] = 0;
            } else
                T[i][j] = c[k - j + 1];
        }
    }
    T = myPowerFunction(T, n - 1);
    ll ans = 0;
    for (int i = 1; i <= k; ++i)
        ans = (ans + (T[1][i] * b[i]) % mod) % mod;
    return ans;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        b.push_back(0);
        c.push_back(0);
        ll n;
        cin >> k;
        for (int i = 0; i < k; ++i) {
            cin >> n;
            b.push_back(n);
        }
        for (int i = 0; i < k; ++i) {
            cin >> n;
            c.push_back(n);
        }
        cin >> n;
        cout << myFunction(n) << endl;
        b.clear();
        c.clear();
    }
    return 0;
}
