#include <bits/stdc++.h>
#define ll long long int

using namespace std;

ll oSRec(ll values[], int i, int j, ll sum) {
    if (j == i + 1)
        return max(values[i], values[j]);
    return max((sum - oSRec(values, i + 1, j, sum - values[i])), (sum - oSRec(values, i, j - 1, sum - values[j])));
}

ll optimalGameStrategy(ll* values, int n) {
    ll sum = 0;
    sum = accumulate(values, values + n, sum);
    return oSRec(values, 0, n - 1, sum);
}

int main() {
    int n;
    cin >> n;
    ll values[n];
    for (int i = 0; i < n; ++i)
        cin >> values[i];
    cout << optimalGameStrategy(values, n);
    return 0;
}