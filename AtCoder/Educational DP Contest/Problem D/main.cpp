#include <bits/stdc++.h>

using namespace std;

struct item {
    int weight;
    int value;
};

int main() {
    int N, W;
    cin >> N >> W;
    vector<item> items(N + 1);
    for (int i = 1; i <= N; ++i)
        cin >> items[i].weight >> items[i].value;
    int dpArray[N + 1][W + 1];
    for (int i = 0; i <= W; ++i)
        dpArray[1][i] = 0;
    dpArray[1][items[1].weight] = items[1].value;
    for (int i = 2; i <= N; ++i) {
        for (int j = 0; j <= W; ++j) {
            dpArray[i][j] = dpArray[i - 1][j];
            if (items[i].weight > j)
                continue;
            dpArray[i][j] = max(dpArray[i][j], items[i].value + dpArray[i - 1][j - items[i].weight]);
        }
    }
    // for (int i = 0; i <= N; ++i) {
    //     for (int j = 0; j <= W; ++j) {
    //         cout << dpArray[i][j] << " ";
    //     }
    //     cout << endl;
    // }
    cout << *max_element(dpArray[N], dpArray[N] + W + 1) << endl;
}