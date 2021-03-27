#include <bits/stdc++.h>
using namespace std;
int arr[8001], isSpecial[8001];
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        for (int i = 0; i < n; ++i) {
            cin >> arr[i];
            isSpecial[i + 1] = 0;
        }
        for (int i = 0; i < n; ++i) {
            int sum = arr[i];
            for (int j = (i + 1); j < n; ++j) {
                sum += arr[j];
                if (sum > n)
                    break;
                isSpecial[sum] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; ++i)
            if (isSpecial[arr[i]])
                count++;
        cout << count << endl;
    }
    return 0;
}