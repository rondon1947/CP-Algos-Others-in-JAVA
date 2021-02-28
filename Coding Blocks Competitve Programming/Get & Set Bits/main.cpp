#include <bits/stdc++.h>

using namespace std;

int getBit(int n, int i) {
    int bitMask = 1 << i;
    int bit = (n & bitMask) > 0 ? 1 : 0;
    return bit;
}

int setBit(int m, int j) {
    int bitMask = 1 << j;
    int ans = (m | bitMask);
    return ans;
}

int main() {
    int n, i;
    cin >> n >> i;
    cout << getBit(n, i) << endl;
    int m, j;
    cin >> m >> j;
    cout << setBit(m, j);
    return 0;
}
