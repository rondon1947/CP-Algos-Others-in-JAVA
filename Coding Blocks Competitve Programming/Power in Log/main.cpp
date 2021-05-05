#include <bits/stdc++.h>

#define ll long long int
using namespace std;

ll myPowerFunction(ll a, ll b) {
    if (b == 0)
        return 1;
    if (b & 1)
        return (a * myPowerFunction(a, (b - 1)));
    ll temp = myPowerFunction(a, (b / 2));
    return (temp * temp);
}

int main() {
    ll a, b;
    cin >> a >> b;
    cout << myPowerFunction(a, b);
    return 0;
}
