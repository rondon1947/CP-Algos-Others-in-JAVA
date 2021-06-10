#include <bits/stdc++.h>

using namespace std;

int cnt = 0;

template <typename T>
class Graph {
    map<T, list<T>> myMap;
public:
    void addEdge(int x, int y) {
        myMap[x].push_back(y);
        myMap[y].push_back(x);
    }

    void dfsHelper(T source, map<T, bool> &visited) {
        // cout << source << " ";
        cnt++;
        visited[source] = true;
        for (auto neighbour : myMap[source]) {
            if (!visited[neighbour])
                dfsHelper(neighbour, visited);
        }
    }

    int dfs() {
        map<T, bool> visited;
        for (auto nodePair : myMap) {
            T node = nodePair.first;
            visited[node] = false;
        }
        vector<int> ans;
        for (auto nodePair : myMap) {
            T node = nodePair.first;
            if (!visited[node]) {
                dfsHelper(node, visited);
                ans.push_back(cnt);
                cnt = 0;
            }
        }
        int sum = 0;
        for (int i : ans) {
            if (i >= 2)
                sum += (i * (i - 1)) / 2;
        }
        return sum;
    }
};

long long int journeyToMoon(int n, vector<vector<int>> astronaut) {
    Graph<int> myGraph;
    map<int, bool> visited;
    for (int i = 0; i < n; ++i)
        visited[i] = false;
    for (int i = 0; i < astronaut.size(); ++i) {
        myGraph.addEdge(astronaut[i][0], astronaut[i][1]);
        visited[astronaut[i][0]] = true;
        visited[astronaut[i][1]] = true;
    }
    for (int i = 0; i < n; ++i)
        if (!visited[i])
            myGraph.addEdge(i, i);
    int ans1 =  myGraph.dfs();
    long long int N = n;
    long long int myAns = ((N * (N - 1)) / 2);
    cout << myAns << " " << n << endl;
    myAns -= ans1;
    return myAns;
}

int main() {
    int n, p;
    cin >> n >> p;
    vector<vector<int>> astronaut(p, vector<int>(2, 0));
    for (int i = 0; i < p; ++i)
        for (int j = 0; j < 2; ++j)
            cin >> astronaut[i][j];
    cout << journeyToMoon(n, astronaut) << endl;
}