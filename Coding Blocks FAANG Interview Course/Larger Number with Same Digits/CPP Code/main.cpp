#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;
    int n = s.length();
    char ch[n + 1];
    strcpy(ch, s.c_str());
    int ans[n];
    for (int i = 0; i < n; ++i)
        ans[i] = ch[i] - 48;

}
