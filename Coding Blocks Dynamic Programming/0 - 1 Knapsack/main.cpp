#include <bits/stdc++.h>
using namespace std;

int knapSack(int capacity, int sizes[], int values[], int n) {
    int i, size;
    int dpArray[n + 1][capacity + 1];
    for (i = 0; i <= n; i++) {
        for (size = 0; size <= capacity; size++) {
            if (i == 0 || size == 0)
                dpArray[i][size] = 0;
            else if (sizes[i - 1] <= size)
                dpArray[i][size] = max((values[i - 1] + dpArray[i - 1][size - sizes[i - 1]]), dpArray[i - 1][size]);
            else
                dpArray[i][size] = dpArray[i - 1][size];
        }
        for (int j = 0; j <= n; ++j) {
            for (int k = 0; k <= capacity; ++k) {
                cout << dpArray[j][k] << " ";
            }
            cout << endl;
        }
    }
    return dpArray[n][capacity];
}

int main() {
    int n, capacity;
    cin >> n >> capacity;
    int sizes[n];
    int values[n];
    for(int i = 0; i < n; ++i)
        cin >> sizes[i];
    for(int i = 0; i < n; ++i)
        cin >> values[i];    
    cout << knapSack(capacity, sizes, values, n);
    return 0;
}