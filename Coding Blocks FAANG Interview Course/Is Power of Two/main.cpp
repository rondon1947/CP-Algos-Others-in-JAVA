#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, count = 0;
    cin >> n;
    while (n > 0) {
        if (n & 1)
            count++;
        n = n >> 1;
    }
    if (count == 1)
        cout << "true" << endl;
    else
        cout << "false" << endl;
    return 0;
}
