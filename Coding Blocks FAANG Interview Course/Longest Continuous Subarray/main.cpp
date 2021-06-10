#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    string arr[n];
    for (int i = 0; i < n; ++i)
        cin >> arr[i];
    string ans = arr[0];
    for (int i = 1; i < n; ++i) {
        string temp;
        for (int j = 0; j < min(ans.length(), arr[i].length()); ++j) {
            if (ans[j] == arr[i][j])
                temp += arr[i][j];
            else
                break;
        }
        ans = temp;
    }
    cout << ans << endl;
    return 0;
}
