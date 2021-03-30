#include <bits/stdc++.h>

using namespace std;

int main() {
    string T;
    getline(cin, T);
    int t = std::stoi(T);
    while (t--) {
        string s;
        getline(cin, s);
        int n = s.length(), oddCount = 0, evenCount = 0, ans;
        for (int i = 0; i < n; ++i) {
            if (((i & 1) == 1) && (s[i] == '1'))
                oddCount++;
            else if (((i & 1) == 0) && (s[i] == '1'))
                evenCount++;
        }
        ans = (oddCount * 2 + evenCount) % 3;
        if (ans == 0)
            cout << "1" << endl;
        else
            cout << "0" << endl;
    }
    return 0;
}
