#include <bits/stdc++.h>

#define FIO ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)

using namespace std;

bool checkEven(int n, int k) {
    int remainder = n - (2 * k);
    if (remainder < 0)
        return false;
    if (remainder & 1)
        return false;
    else
        cout << "YES\n";
    for (int i = 0; i < (k - 1); ++i)
        cout << "2 ";
    cout << (2 + remainder) << endl;
    return true;
}

bool checkOdd(int n, int k) {
    int remainder = n - k;
    if (remainder < 0)
        return false;
    if (remainder & 1)
        return false;
    else
        cout << "YES\n";
    for (int i = 0; i < (k - 1); ++i)
        cout << "1 ";
    cout << (1 + remainder) << endl;
    return true;
}

int main() {
    FIO;
    int t;
    cin >> t;
    while (t--) {
        int n, k;
        cin >> n >> k;
        if (checkEven(n, k) || checkOdd(n, k))
            continue;
        else
            cout << "NO\n";
    }
    return 0;
}
