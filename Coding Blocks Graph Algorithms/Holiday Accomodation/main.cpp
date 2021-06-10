#include <bits/stdc++.h>

using namespace std;

class Graph {
    int V;
    list<pair<int, int>> *myList;

public:
    Graph(int v) {
        V = v;
        myList = new list<pair<int, int>>[V + 1];
    }

    void addEdge(int u, int v, int cost) {
        myList[u].push_back(make_pair(v, cost));
        myList[v].push_back(make_pair(u, cost));
    }

    int dfsHelper(int sourceNode, bool *visited, int *count, int &ans) {
        visited[sourceNode] = true;
        count[sourceNode] = 1;
        for (auto neighbourPair : myList[sourceNode]) {
            int neighbour = neighbourPair.first;
            int weight = neighbourPair.second;
            if (!visited[neighbour]) {
                count[sourceNode] += dfsHelper(neighbour, visited, count, ans);
                int thisSide = count[neighbour];
                int thatSide = V - thisSide;
                ans += 2 * min(thisSide, thatSide) * weight;
            }
        }
        return count[sourceNode];
    }

    int dfs() {
        bool *visited = new bool[V + 1];
        int *count = new int[V + 1];

        for (int i = 1; i <= V; ++i) {
            visited[i] = false;
            count[i] = 0;
        }

        int ans = 0;
        dfsHelper(1, visited, count, ans);
        return ans;
    }
};

int main() {
    int t;
    cin >> t;
    for (int k = 1; k <= t; ++k) {
        int n;
        cin >> n;
        Graph myGraph(n);
        for (int i = 1; i < n; ++i) {
            int x, y, z;
            cin >> x >> y >> z;
            myGraph.addEdge(x, y, z);
        }
        cout << "Case #" << k << ": " << myGraph.dfs() << endl;
    }
    return 0;
}