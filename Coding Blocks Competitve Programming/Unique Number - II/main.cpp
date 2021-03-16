#include <bits/stdc++.h>

using namespace std;

int positionOfFirstSetBit(int n) {
    int index = 0;
    while ((n & 1) != 1) {
        index++;
        n = n >> 1;
    }
    return index;
}

vector<int> uniqueNumber(vector<int> nums) {
    vector<int> ans;
    int xOR = 0, n = nums.size();
    for (int i = 0; i < n; ++i)
        xOR = xOR ^ nums[i];
    int pos = positionOfFirstSetBit(xOR);
    int a = 0;
    int mask = 1 << pos;
    for (int i = 0; i < n; ++i)
        if ((nums[i] & mask) > 0)
            a = a ^ nums[i];
    ans.push_back(a);
    int b = xOR ^ ans[0];
    ans.push_back(b);
    return ans;
}

int main() {
    int n;
    cin >> n;
    vector<int> v;
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        v.push_back(x);
    }
    vector<int> ans = uniqueNumber(v);
    cout << "[" << ans[0] << "," << ans[1] << "]" << endl;
    return 0;
}
