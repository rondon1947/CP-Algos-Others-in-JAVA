#include <bits/stdc++.h>

using namespace std;

vector<int> myGraph[100001];
int dpArray[100001];

int maxPathLengthFromSource(int source) {
    if (dpArray[source] != -1)
        return dpArray[source];
    bool hasChild = false;
    int bestChild = 0;
    for (auto child : myGraph[source]) {
        hasChild = true;
        bestChild = max(bestChild, maxPathLengthFromSource(child));
    }
    return (dpArray[source] = (hasChild ? (1 + bestChild) : 0));
}

int main() {
    int N, M;
    cin >> N >> M;
    memset(dpArray, -1, sizeof(dpArray));
    for (int i = 0; i < M; ++i) {
        int u, v;
        cin >> u >> v;
        myGraph[u].push_back(v);
    }     
    int ans = 0;
    for (int i = 1; i <= N; ++i)
        ans = max(ans, maxPathLengthFromSource(i));
    cout << ans << endl;
}