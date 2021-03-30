#include <bits/stdc++.h>

using namespace std;

int main() {
    string T;
    getline(cin, T);
    int t = stoi(T);
    while (t--) {
        string s;
        getline(cin, s);
        s += "R";
        int n = s.length();
        cout << s << endl;
        int maxDistance = INT_MIN, currentMaxDistance = INT_MIN;
        int lastPosition = -1;
        for (int i = 0; i < n; ++i) {
            if (s[i] == 'R') {
                currentMaxDistance = i - lastPosition;
                if (currentMaxDistance >= maxDistance)
                    maxDistance = currentMaxDistance;
                lastPosition = i;
            }
        }
        cout << maxDistance << endl;
    }
    return 0;
}
