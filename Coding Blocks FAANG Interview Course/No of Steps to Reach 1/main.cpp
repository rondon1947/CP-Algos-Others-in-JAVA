#include <bits/stdc++.h>

using namespace std;

int noOfStepsToReachOne(int n) {
    if (n == 1)
        return 0;
    if (!(n & 1))
        return (noOfStepsToReachOne(n >> 1) + 1);
    if (((n % 4) == 1) || (n == 3))
        return (noOfStepsToReachOne(n - 1) + 1);
    return (noOfStepsToReachOne(n + 1) + 1);
}

int main() {
    int n;
    cin >> n;
    cout << noOfStepsToReachOne(n) << endl;
    return 0;
}
