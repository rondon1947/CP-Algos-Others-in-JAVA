#include <bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin >> n;
    int requiredXor = 0, calculatedXor = 0, temp;
    for (int i = 0; i <= n; ++i)
        requiredXor ^= i;
    for (int i = 0; i < n; ++i) {
        cin >> temp;
        calculatedXor ^= temp;
    }
    cout << (requiredXor ^ calculatedXor) << endl;
    return 0;
}
