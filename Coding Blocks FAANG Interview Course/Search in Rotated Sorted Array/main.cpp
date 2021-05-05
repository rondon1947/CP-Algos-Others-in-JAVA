#include <bits/stdc++.h>

using namespace std;

int mySearchFunction(vector<int> v, int n, int key) {
    int start = 0, end = (n - 1), mid;
    while (start <= end) {
        mid = (start + end) / 2;
        if (v[mid] == key)
            return mid;
        if (v[mid] > v[(n - 1)]) {
            if ((key < v[0]) || (key > v[mid]))
                start = mid + 1;
            else
                end = mid - 1;
        } else {
            if ((key > v[(n - 1)]) || (key < v[mid]))
                end = mid - 1;
            else
                start = mid + 1;
        }
    }
    return -1;
}

int main() {
    int n, key;
    cin >> n;
    vector<int> v;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        v.push_back(x);
    }
    cin >> key;
    cout << mySearchFunction(v, n, key);
}