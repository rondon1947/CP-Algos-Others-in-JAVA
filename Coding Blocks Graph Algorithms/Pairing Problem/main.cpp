#include <bits/stdc++.h>

using namespace std;

class Graph{
    int vertices;
    list<pair<int, int>> myGraph;

public:
    Graph(int v) {
        this->vertices = v;
    }
    
    int addEdge(int a, int b) {
        myGraph.push_back(make_pair(a, b));
    }

    int findSet(int i, int parent[]) {
        if (parent[i] == -1)
            return i;
        else
            return (parent[i] = findSet(parent[i], parent));    //path compression optimized here    
    }

    void unionSet(int x, int y, int *parent, int *rank) {
        int s1 = findSet(x, parent);
        int s2 = findSet(y, parent);
        if (s1 != s2) {                 //union by path optimized here
            if (rank[s1] < rank[s2]) {
                parent[s1] = s2;
                rank[s2] += rank[s1];
            }
            else {
                parent[s2] = s1;
                rank[s1] += rank[s2];
            }  
        }
    }

    int pairing() {
        int *parent = new int[vertices];
        int *rank = new int[vertices];
        for (int i = 0; i < vertices; ++i) {
            parent[i] = -1;
            rank[i] = 1;
        }
        for (auto edge : myGraph) {
            int x = edge.first;
            int y = edge.second;
            int s1 = findSet(x, parent);
            int s2 = findSet(y, parent);
            unionSet(s1, s2, parent, rank);
        }
        int ans = 0;
        for (int i = 0; i <  vertices; ++i) 
            ans += vertices - rank[findSet(i, parent)];
        delete [] parent;
        delete [] rank;
        return (ans/2);
    }
};

int main() {
    int edges, vertices;
    cin >> vertices >> edges;
    Graph myGraph(vertices);
    while (edges--) {
        int x, y;
        cin >> x >> y;
        myGraph.addEdge(x, y);
    }
    cout << myGraph.pairing() << endl;
}