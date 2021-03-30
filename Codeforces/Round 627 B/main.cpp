#include <bits/stdc++.h>

using namespace std;

bool palindromeArray(const int arr[], int n) {
    for (int i = 0; i <= (n - 3); ++i) {
        for (int j = (i + 2); j < n; ++j) {
            if (arr[i] == arr[j])
                return true;
        }
    }
    return false;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; ++i)
            cin >> arr[i];
        if (palindromeArray(arr, n))
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
}