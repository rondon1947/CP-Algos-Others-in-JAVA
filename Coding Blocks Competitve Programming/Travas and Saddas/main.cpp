#include <bits/stdc++.h>
using namespace std;
#define ll long long int
int main() {
    char a[20];
    cin >> a;
    int n = strlen(a);
    ll ans = (1 << n) - 2;
    for (int i = (n - 1), pos = 0; i >= 0 ; --i, pos++) {
        if (a[i] == '7')
            ans = ans + (1 << pos);
    }
    cout << (ans + 1) << endl;
    return 0;
}
