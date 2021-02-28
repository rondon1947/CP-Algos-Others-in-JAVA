#include <bits/stdc++.h>

using namespace std;
int getBit(int n, int  i) {
    int bitMask = 1 << i;
    int bit = (n & bitMask) > 0 ? 1 : 0;
    return bit;
}
int main() {
    int n, i;
    cin >> n >> i;
    cout << getBit(n, i);
    return 0;
}
