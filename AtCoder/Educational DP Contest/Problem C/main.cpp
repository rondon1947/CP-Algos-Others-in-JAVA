#include <bits/stdc++.h>

using namespace std;

struct activity {
    int a, b, c;
};

int main() {
    int n;
    cin >> n;
    activity activities[n + 1];
    for (int i = 1; i <= n; ++i) {
        cin >> activities[i].a;
        cin >> activities[i].b;
        cin >> activities[i].c;
    }
    activity dpArray[n + 1];
    dpArray[1].a = activities[1].a;
    dpArray[1].b = activities[1].b;
    dpArray[1].c = activities[1].c;
    for (int i = 2; i <= n; ++i) {
        dpArray[i].a = activities[i].a + max(dpArray[i - 1].b, dpArray[i - 1].c);
        dpArray[i].b = activities[i].b + max(dpArray[i - 1].c, dpArray[i - 1].a);
        dpArray[i].c = activities[i].c + max(dpArray[i - 1].a, dpArray[i - 1].b);
    }
    cout << max(dpArray[n].a, max(dpArray[n].b, dpArray[n].c));
}