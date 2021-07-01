#include <bits/stdc++.h>

using namespace std;

int longestConsecutive(vector<int> arr, int n) {
    unordered_set<int> s, done;
    for (int i : arr)
        s.insert(i);
    int ans = 0;
    for (int i : arr) {
        if ((std::find(done.begin(), done.end(), i)) == done.end()) {
            int c = 0;
            int temp = i;
            while ((std::find(arr.begin(), arr.end(), temp)) != arr.end()) {
                c++;
                done.insert(temp++);
            }
            temp = i - 1;
            while ((std::find(arr.begin(), arr.end(), temp)) != arr.end()) {
                c++;
                done.insert(temp--);
            }
            ans = max(ans, c);
        }
    }
    return ans;
}

int main() {
    int n;
    cin >> n;
    vector<int> arr;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        arr.push_back(x);
    }
    cout << longestConsecutive(arr, n) << endl; 
    return 0;
}
