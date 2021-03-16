#include <bits/stdc++.h>

using namespace std;

int main() {
    string s, t;
    getline(cin, s);
    getline(cin, t);
    int n = s.size(), l = 0, r, left = -1, right = 1e9;
    map<char, int> ms, mt;
    for (auto ch:t)
        mt[ch]++;
    for (r = 0; r < n; ++r) {
        ms[s[r]]++;
        bool good = true;
        for (auto mp : mt) {
            if ((ms.count(mp.first) == 0) || (ms[mp.first] < mp.second)) {
                good = false;
                break;
            }
        }
        if (!good)
            continue;
        while ((l < n) && (l <= r) && ((mt.count(s[l]) == 0) || (ms[s[l]] > mt[s[l]]))) {
            ms[s[l]]--;
            if (ms[s[l]] == 0)
                ms.erase(s[l]);
            ++l;
        }
        if ((right - left + 1) > (r - l + 1)) {
            right = r;
            left = l;
        }
    }
    if (left == -1)
        cout << "No String" << endl;
    else
        cout << s.substr(left, (right - left + 1))<< endl;
    return 0;
}
