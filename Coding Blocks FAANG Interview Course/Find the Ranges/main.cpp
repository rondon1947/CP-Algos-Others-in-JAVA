#include <bits/stdc++.h>

using namespace std;

//0 1 2 5 6 7 9
int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; ++i)
        cin >> arr[i];
    int startPosition = 0, endPosition = 0, i;
    if (arr[startPosition] != (arr[startPosition + 1] - 1))
        cout << arr[startPosition] << " ";
    for (i = 1; i < n; ++i) {
        if (arr[i] == (arr[(i - 1)] + 1))
            endPosition = i;
        else {
            if (endPosition != startPosition)
                cout << arr[startPosition] << "->" << arr[endPosition] << " ";
            if ((i < (n - 1)) && (arr[i] != (arr[(i - 1)] + 1)) && (arr[i] != (arr[(i + 1)] - 1)))
                cout << arr[i] << " ";
            startPosition = endPosition = i;
        }
    }
    if (endPosition != startPosition)
        cout << arr[startPosition] << "->" << arr[endPosition] << " ";
    else
        cout << arr[endPosition] << " ";
    return 0;
}
