#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; ++i)
        cin >> arr[i];
    int count = 0, ans = 0;
    map<int, int> myMap;
    myMap.insert(pair<int, int>(0, -1));
    for (int i = 0; i < n; ++i) {
        int item = arr[i];
        if (item == 0)
            count++;
        else
            count--;
        map<int, int>::iterator itr;
        if (myMap.find(count) != myMap.end()) {
            itr = myMap.find(count);
            ans = max(ans, i - itr->second);
        } else
            myMap.insert(pair<int, int>(count, i));
    }
    cout << ans << endl;
    return 0;
}
