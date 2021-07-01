#include <bits/stdc++.h>

using namespace std;

int dpArray[3001][3001];

string LCS(string &s, string &t, int lengthOfLCS) {
    string lcs = "";
    int i = 0, j = 0;
    while (lengthOfLCS > 0) {
        if (s[i] == t[j]) {
            lcs.push_back(s[i]);
            i++;
            j++;
            lengthOfLCS--;
        } else {
            if (dpArray[(i + 1)][j] > dpArray[i][(j + 1)])
                i++;
            else
                j++;
        }
    }
    return lcs;
}

int lenLCS(string &s, string &t, int i, int j) {
    if((i >= s.length()) || (j >= t.length()))
        return 0;
    if (dpArray[i][j] != -1)
        return dpArray[i][j];
    if (s[i] == t[j])
        return (dpArray[i][j] = (1 + lenLCS(s, t, i + 1, j + 1)));
    return (dpArray[i][j] = max(lenLCS(s, t, i, j + 1), lenLCS(s, t, i + 1, j)));
}
int main() {
    string s, t;
    getline(cin, s);
    getline(cin, t);
    int n = s.size();
    int m = t.size();
    memset(dpArray, -1, sizeof dpArray);
    int lengthOfLCS = lenLCS(s, t, 0, 0);
    // for (int i = 0; i <= 7; ++i) {
    //     for (int j = 0; j <= 7; ++j)
    //         cout << dpArray[i][j] << " ";
    //     cout << endl;
    // }
    cout << LCS(s, t, lengthOfLCS) << endl;
}