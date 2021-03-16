#include <bits/stdc++.h>
using namespace std;
int main() {
    double ans = 1.0;
    for (int i = 2; i > 0; ++i) {
        ans = ans * ((366 - i) / 365.0);
        if (ans <= 0.5) {
            cout << i;
            break;
        }
    }
    return 0;
}
