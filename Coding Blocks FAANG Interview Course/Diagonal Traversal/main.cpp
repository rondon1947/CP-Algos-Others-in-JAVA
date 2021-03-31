#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int arr[n + 1][m + 1];
    for (int i = 1; i <= n; ++i)
        for (int j = 1; j <= m; ++j)
            cin >> arr[i][j];
    int rowIndex = 1, columnIndex = 1, direction = 1;
    for (int i = 0; i < (n * m); ++i) {
        cout << arr[rowIndex][columnIndex] << " ";
        if (direction) {
            if (columnIndex == m) {
                rowIndex++;
                direction = 0;
            } else if (rowIndex == 1) {
                columnIndex++;
                direction = 0;
            } else {
                rowIndex--;
                columnIndex++;
            }
        } else {
            if (rowIndex == n) {
                columnIndex++;
                direction = 1;
            } else if (columnIndex == 1) {
                rowIndex++;
                direction = 1;
            } else {
                rowIndex++;
                columnIndex--;
            }
        }
    }
    return 0;
}
