#include <bits/stdc++.h>

using namespace std;

bool myComparator(const string &s1, const string &s2) {
    return (!((s1 + s2) > (s2 + s1)));
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int m;
        cin >> m;
        string s[m];
        for (int i = 0; i < m; ++i)
            cin >> s[i];
        sort(s, s + m, myComparator);
        for (int i = (m - 1); i >= 0; --i) {
            cout << s[i] << "";
        }
        cout << endl;
    }
    return 0;
}
