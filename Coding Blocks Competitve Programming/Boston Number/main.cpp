#include <bits/stdc++.h>

#define ll long long int
using namespace std;

ll sumOfDigits(ll n) {
    ll j, sum = 0, m = n;
    while (m > 0) {
        j = m % 10;
        sum += j;
        m /= 10;
    }
    return sum;
}

ll primeFactors(ll n) {
    ll sum1 = 0;
    while (n % 2 == 0) {
        sum1 += 2;
        n = n / 2;
    }
    for (ll i = 3; i <= ((ll) sqrt(n)); i = i + 2) {
        while (n % i == 0) {
            sum1 += sumOfDigits(i);
            n = n / i;
        }
    }
    if (n > 2)
        sum1 += sumOfDigits(n);
    return sum1;
}

int main() {
    ll n, sum, sum1;
    cin >> n;
    sum = sumOfDigits(n);
    sum1 = primeFactors(n);
    if (sum == sum1)
        cout << "1" << endl;
    else
        cout << "0" << endl;
    return 0;
}
