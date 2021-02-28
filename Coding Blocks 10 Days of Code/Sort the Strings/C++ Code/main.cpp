#include <bits/stdc++.h>

using namespace std;

string extractStringAtKey(const string& s, int key) {
    char *ch = strtok((char *) s.c_str(), " ");
    while (key > 1) {
        ch = strtok(nullptr, " ");
        --key;
    }
    return (string) ch;
}

int convertToInteger(string s) {
    int ans = 0, p = 1;
    for (int i = s.length(); i >= 0; ++i) {
        ans = ans + (int) (pow(s[i] - '0', p));
        p = p * 10;
    }
//    cout << ans << endl;
    return ans;
}

bool numericSorting(pair<string, string> p1, pair<string, string> p2) {
//    cout << (convertToInteger(p1.second)) << " " << (convertToInteger(p2.second)) << endl;
    return ((convertToInteger(p1.second)) < (convertToInteger(p2.second)));
}

bool lexicoSorting(const pair<string, string> &p1, const pair<string, string> &p2) {
//    cout << (p1.second) << " " << (p2.second) << endl;
    return (p1.second < p2.second);
}

int main() {
    int n;
    cin >> n;
    cin.get();
    string s[n];
    for (int i = 0; i < n; ++i)
        getline(cin, s[i]);
    int key;
    cin >> key;
    string reversal, ordering;
    cin >> reversal >> ordering;
    pair<string, string> stringsWithKey[n];
    for (int i = 0; i < n; ++i) {
        stringsWithKey[i].first = s[i];
        stringsWithKey[i].second = extractStringAtKey(s[i], key);
    }
    if (ordering == "numeric")
        sort(stringsWithKey, stringsWithKey + n, numericSorting);
    else
        sort(stringsWithKey, stringsWithKey + n, lexicoSorting);
//    for (int i = 0; i < n; ++i)
//        cout << stringsWithKey[i].first << " " << stringsWithKey[i].second << endl;
    if (reversal == "true") {
        for (int i = 0; i < (n / 2); ++i)
            swap(stringsWithKey[i], stringsWithKey[n - i - 1]);
    }
    for (int i = 0; i < n; ++i)
        cout << stringsWithKey[i].first << endl;
    return 0;
}