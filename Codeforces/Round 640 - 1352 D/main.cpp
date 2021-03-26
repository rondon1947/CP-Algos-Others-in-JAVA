#include <bits/stdc++.h>

#define ll long long int
using namespace std;

int main() {
    ll t;
    cin >> t;
    while (t--) {
        ll n;
        cin >> n;
        ll candies[n];
        for (int i = 0; i < n; ++i)
            cin >> candies[i];
        cout << endl;
        ll candiesAlice = candies[0], candiesBob = 0, moves = 1, i = 1, j = (n - 1);
        ll previousChanceAlice = candiesAlice, previousChanceBob = 0;
        bool isAliceChance = false;
        while (i <= j) {
            if (isAliceChance) {
                while ((i <= j) && (previousChanceAlice <= previousChanceBob)) {
                    previousChanceAlice += candies[i];
                    ++i;
                }
                moves++;
                candiesAlice += previousChanceAlice;
                isAliceChance = false;
                previousChanceBob = 0;
            } else {
                while ((i <= j) && (previousChanceBob <= previousChanceAlice)) {
                    previousChanceBob += candies[j];
                    --j;
                }
                isAliceChance = true;
                moves++;
                candiesBob += previousChanceBob;
                previousChanceAlice = 0;
            }
        }
        cout << moves << " " << candiesAlice << " " << candiesBob << endl;
    }
    return 0;
}
