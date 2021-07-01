#include <bits/stdc++.h>

#define ll long long int
#define mod 1000000007

using namespace std;

char grid[1001][1001];

ll pathSolver(int h, int w) {
    ll dpArray[h + 1][w + 1];
    dpArray[h][w] = 1;
    for (int i = h; i >= 1; --i) {
        for (int j = w; j >= 1; --j) {
            if ((i == h) && (j == w))
                continue;
            if (grid[i][j] == '#')
                dpArray[i][j] = 0;
            else
                dpArray[i][j] = (((i == h) ? 0 : dpArray[(i + 1)][j]) + ((j == w) ? 0 : dpArray[i][(j + 1)])) % mod;
        }
    }
    return dpArray[1][1];
}

int main() {
    int h, w;
    cin >> h >> w;
    for (int i = 1; i <= h; ++i)
        for (int j = 1; j <= w; ++j)
            cin >> grid[i][j];
    cout << pathSolver(h, w) << endl;
}