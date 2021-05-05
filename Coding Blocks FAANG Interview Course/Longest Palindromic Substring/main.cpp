#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string s, temp, temp1;
        cin >> s;
        int n = s.length(), startPosition = 0, endPosition = n - 1, i, j;
        bool leftValueToBeChanged = true;
        for (i = startPosition, j = endPosition; i < j;) {
            temp1 = temp = s.substr(i, j + 1);
            reverse(temp1.begin(), temp1.end());
            if (temp == temp1)
                break;
            if (leftValueToBeChanged) {
                leftValueToBeChanged = false;
                i++;
            } else {
                leftValueToBeChanged = true;
                j--;
            }
        }
        if (i == j)
            cout << s[0] << endl;
        else {
            for (int k = i; k <= j; ++k)
                cout << s[k] << "";
            cout << endl;
        }
    }
    return 0;
}
