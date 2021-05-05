#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    string arr[n];
    for (int i = 0; i < n; ++i)
        cin >> arr[i];
    string word1, word2;
    cin >> word1 >> word2;
    int ans = INT_MAX, i;
    for (i = 0; i < n; ++i)
        if ((arr[i] == word1) || (arr[i] == word2))
            break;
    for (int j = (i + 1); j < n; ++j) {
        if (((arr[j] == word1) || (arr[j] == word2)) && (arr[j] != arr[i])) {
            ans = min(ans, (j - i));
            i = j;
        }
    }
    cout << ans << endl;
    return 0;
}
