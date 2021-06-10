#include <bits/stdc++.h>

using namespace std;

int main() {
    double p;
    cin >> p;
    if (p == 1)
        cout << "1" << endl;
    if (p == 0)
        cout << "366" << endl;    
    else
        cout << ceil(sqrt(2 * 365 * log(1 / (1 - p)))) << endl;
    return 0;
}