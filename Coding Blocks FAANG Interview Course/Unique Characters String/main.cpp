#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    string s[n];
    int alphabets[26];
    for (int & alphabet : alphabets)
        alphabet = 0;
    for (int i = 0; i < n; ++i) {
        cin >> s[i];
        for (char j : s[i])
            alphabets[j - 'a']++;
    }
    string ans;
    for (int i = 0; i < 26; ++i)
        if (alphabets[i] > 0)
            ans += (char)(i + 'a');
    cout << ans.length();
}
