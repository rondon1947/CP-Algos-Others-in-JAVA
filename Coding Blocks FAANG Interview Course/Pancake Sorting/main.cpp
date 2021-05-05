#include <bits/stdc++.h>

using namespace std;

int find(vector<int> &a, int n) {
    for (int i = 0; i < a.size(); ++i)
        if(a[i] == n)
            return i;
    return -1;
}

void myFlip(vector<int> &a, int k) {
    for (int i = 0; i < (k / 2); ++i) {
        int t = a[i];
        a[i] = a[(k - i - 1)];
        a[(k - i - 1)] = t;
    }
}

vector<int> pancakeSorting(vector<int> &a) {
    vector<int> ans;
    int n = (int)(a.size());
    while (n) {
        int idx = find(a, n);
        if (idx != (n - 1)) {
            myFlip(a, idx + 1);
            myFlip(a, n);
            ans.push_back(idx + 1);
            ans.push_back(n);
        }
        n--;
    }
    return ans;
}

bool checkSorted(const vector<int> &tmp) {
    for (int i = 0; i < tmp.size() - 1; ++i) {
        if (tmp[i] > tmp[i + 1])
            return false;
    }
    return true;
}


void flip(vector<int> &tmp, int k) {
    for (int i = 0; i < k / 2; ++i) {
        swap(tmp[i], tmp[k - i - 1]);
    }
}

int main() {
    int testCases;
    cin >> testCases;
    while (testCases--) {
        int n;
        cin >> n;
        vector<int> arr(n), tmp(n);
        for (int i = 0; i < n; ++i) {
            cin >> arr[i];
            tmp[i] = arr[i];
        }
        vector<int> v = pancakeSorting(arr);
        for (int i : v) {
            flip(tmp, i);
        }
        bool isSorted = checkSorted(tmp);
        if (isSorted) {
            cout << "Valid pancake sort";
        }
        else {
            cout << "Incorrect pancake sort";
        }
        cout << endl;
    }
    return 0;
}