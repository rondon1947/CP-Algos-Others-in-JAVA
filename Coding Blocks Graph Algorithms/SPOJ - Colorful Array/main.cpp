#include <bits/stdc++.h>

using namespace std;

struct dsu {
    vector<int> parent;
    void init(int v) {
        parent.resize(v);
        iota(parent.begin(), parent.end(), 0);
    }
    int getSet(int x) {
        return (x == parent[x] ? x : parent[x] = getSet(parent[x]));
    }
    void unite(int x, int y) {
        x = getSet(x);
        y = getSet(y);
        if (x != y) {
            parent[x] = max(parent[x], parent[y]);
            parent[y] = max(parent[x], parent[y]);
        }
    }
};

int main() {
    int n, q;
    cin >> n >> q;
    int start[q], end[q], color[q];
    for (int i = 0; i < q; ++i) 
        cin >> start[i] >> end[i] >> color[i];
    dsu myGraph;
    myGraph.init(n + 2);
    int colorfulArray[n + 2] = {};
    for (int i = (q - 1); i >= 0; --i) {
        int idx = myGraph.getSet(start[i]);
        while (idx <= end[i]) {
            colorfulArray[idx] = color[i];
            myGraph.unite(idx, idx + 1);
            idx = myGraph.getSet(idx);
        }
    }
    for (int i = 1; i <= n; ++i)
        cout << colorfulArray[i] << endl;
}