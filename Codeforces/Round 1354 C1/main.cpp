#include <bits/stdc++.h>
#define ps(x, y) fixed<<setprecision(y)<<x
using namespace std;
int main() {
    int t;
    cin >> t;
    double pi = 3.14159265358;
    while (t--) {
        int n;
        cin >> n;
        double theta = pi/(2.0 * n);
        double ans = (1.0/tan(theta));
        cout << ps(ans, 6) << endl;
    }
    return 0;
}
