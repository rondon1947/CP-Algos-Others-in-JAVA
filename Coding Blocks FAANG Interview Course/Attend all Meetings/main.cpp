#include <bits/stdc++.h>
using namespace std;
int main() {
    int n, flag = 0;
    cin >> n;
    pair<int, int> timings[n];
    for (int i = 0; i < n; ++i)
        cin >> timings[i].first >> timings[i].second;
    sort(timings, timings + n);
    for (int i = 1; i < n; ++i) {
        if (timings[i].first < timings[(i - 1)].second) {
            flag = 1;
            break;
        }
    }
    if (flag)
        cout << "false" << endl;
    else
        cout << "true" << endl;
    return 0;
}
