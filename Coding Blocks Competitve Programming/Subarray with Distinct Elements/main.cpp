#include<bits/stdc++.h>

using namespace std;

int sumOfLength(int arr[], int n) {
    unordered_set<int> mySet;
    int j = 0, ans = 0;
    for (int i = 0; i < n; i++) {
        while (j < n && mySet.find(arr[j]) == mySet.end()) {
            mySet.insert(arr[j]);
            j++;
        }
        ans += ((j - i) * (j - i + 1)) / 2;
        mySet.erase(arr[i]);
    }
    return ans;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; ++i)
        cin >> arr[i];
    cout << sumOfLength(arr, n) << endl;
    return 0;
}