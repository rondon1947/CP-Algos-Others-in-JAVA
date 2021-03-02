#include <bits/stdc++.h>

using namespace std;

int clearBit(int n, int i) {
    int mask = ~(1 << i);
    int ans = n & mask;
    return ans;
}

int updateBit(int m, int j, int v) {
    if (v == 0) {
        int mask = ~(1 << j);
        int ans = m & mask;
        return ans;
    } else {
        int mask = (1 << j);
        int ans = m | mask;
        return ans;
    }
}

int updateBitWithoutIf(int m, int j, int v) {
    int mask = ~(1 << j);
    int clearedBitNumber = (m & mask);
    int mask2 = (v << j);
    int ans = (clearedBitNumber | mask2);
    return ans;
}

int main() {
    int n, i;
    cin >> n >> i;
    cout << clearBit(n, i) << endl;
    int m, j, v;
    cin >> m >> j >> v;
    cout << updateBit(m, j, v) << endl;
    cin >> m >> j >> v;
    cout << updateBitWithoutIf(m, j, v);
    return 0;
}
