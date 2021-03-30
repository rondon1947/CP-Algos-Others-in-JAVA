#include <bits/stdc++.h>

#define ll long long int
using namespace std;

int main() {
    int n;
    cin >> n;
    int teachers[n], students[n], myArray[n];
    for (int i = 0; i < n; ++i)
        cin >> teachers[i];
    for (int i = 0; i < n; ++i) {
        cin >> students[i];
        myArray[i] = students[i] - teachers[i];
    }
    sort(myArray, myArray + n);
    ll count = 0;
    for (int i = 0; i < n; ++i) {
        int index = lower_bound(myArray + i + 1, myArray + n, -myArray[i]) - myArray;
        count += index - i - 1;
    }
    cout << count << endl;
    return 0;
}
