#include <bits/stdc++.h>
using namespace std;

int dpArray[10001][10001] = {0};
string s1, s2;
int n, m;
int minimumEditDistance(int i, int j) {
    if ((i >= n) && (j >= m))
        return 0;
    if (i >= n)
        return (dpArray[i][j] = 1 + minimumEditDistance(i, j + 1));
    if (j >= m)
        return (dpArray[i][j] = 1 + minimumEditDistance(i + 1, j));
    if (dpArray[i][j] > 0)
        return dpArray[i][j];
    if (s1[i] == s2[j])
        return (dpArray[i][j] = minimumEditDistance(i + 1, j + 1));
    else
        return (dpArray[i][j] = 1 + min(minimumEditDistance(i, j + 1), min(minimumEditDistance(i + 1, j), minimumEditDistance(i + 1, j + 1))));
}
int main() {
    getline(cin, s1);
    getline(cin, s2);
    n = s1.length();
    m = s2.length();
    cout << minimumEditDistance(0, 0) << endl;
}