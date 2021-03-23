#include <bits/stdc++.h>

#define ps(x, y) fixed<<setprecision(y)<<x
using namespace std;

int main() {
    int t;
    cin >> t;
    double pi = 3.1415926;
    while (t--) {
        int n;
        cin >> n;
        double theta = pi / 4.0, delta = pi / n;
        double x = 0.0, minimum = 0.0, maximum = 0.0;
        for (int i = 0; i < (2 * n); ++i) {
            x += cos(theta);
            theta -= delta;
            maximum = max(x, maximum);
            minimum = min(x, minimum);
        }
        double ans = maximum - minimum;
        cout << ps(ans, 6) << endl;
    }
    return 0;
}
