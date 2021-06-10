#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> startTime, endTime;
    for (int i = 0; i < n; ++i) {
        int x, y;
        cin >> x >> y;
        startTime.push_back(x);
        endTime.push_back(y);
    }
    sort(startTime.begin(), startTime.end());
    sort(endTime.begin(), endTime.end());
    int i = 0, j = 0, halls = 0, maxHalls = 0;
    while ((i < startTime.size()) && (j < endTime.size())) {
        if (startTime[i] < endTime[j]) {
            halls++;
            i++;
        } else {
            halls--;
            j++;
        }
        if (maxHalls < halls)
            maxHalls = halls;
    }
    cout << maxHalls << endl;
    return 0;
}
