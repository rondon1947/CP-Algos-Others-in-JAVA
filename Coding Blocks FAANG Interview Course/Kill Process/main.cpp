#include <bits/stdc++.h>

using namespace std;

vector<int> myGraph[100001];

int main() {
    int n, kill;
    cin >> n >> kill;
    int temp[n];
    for(int i = 0; i < n; ++i) {
        cin >> temp[i];
        myGraph[temp[i]].push_back(temp[i]);
    }
    for(int i = 0; i < n; ++i) {
        int x;
        cin >> x;
        myGraph[x].push_back(temp[i]);
    }
    sort(myGraph[kill].begin(), myGraph[kill].end());
    for (int i : myGraph[kill]) 
        cout << i << " ";
    cout << endl;
    return 0;
}