#include <bits/stdc++.h>

#define FIO ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0)

using namespace std;

struct fenwickTree {
    int N;
    vector<int> tree;

    void init(int n) {
        N = n;
        tree.assign(n + 1, 0);
    }

    void update(int index, int value) {
        while (index <= N) {
            tree[index] += value;
            index += index & (-index);
        }
    }

    int pref(int index) {
        int ans=  0;
        while (index > 0) {
            ans += tree[index];
            index -= index & (-index);
        }
        return ans;
    }

};

int main() {
    FIO;
    int n, q;
    cin >> n >> q;
    fenwickTree myTree;
    myTree.init(n);
    for (int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        myTree.update(x, 1);
    }
    while (q--) {
        int k;
        cin >> k;
        if (k >= 1)
            myTree.update(k, 1);
        else {
            k = -k;
            int start = 1, end = n;
            int ans;
            while (start <= end) {
                int mid = (start + end) / 2;
                int currentPref = myTree.pref(mid);
                if (currentPref >= k) {
                    ans = mid;
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
            myTree.update(ans, -1);
        }
    }
    int ans = 0;
    for (int i = 1; i <= n; ++i) {
        if (myTree.pref(i)) {
            ans = i;
            break;
        }
    }
    cout << ans << endl;
    return 0;
}
