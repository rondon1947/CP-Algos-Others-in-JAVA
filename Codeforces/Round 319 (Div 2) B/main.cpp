#include <bits/stdc++.h>

using namespace std;

bool modularSum(vector<int> v, int n, int m) {
	if (n > m)
		return true;
	bool DP[m];
	memset(DP, false, m);
	for (int i = 0; i < n; i++) {
		if (DP[0])
			return true;
		bool temp[m];
		memset(temp, false, m);
		for (int j = 0; j < m; j++) {
			if (DP[j] == true) 
				if (DP[(j + v[i]) % m] == false)
					temp[(j + v[i]) % m] = true;
			
		}
		for (int j = 0; j < m; j++)
			if (temp[j])
				DP[j] = true;
		DP[(v[i] % m)] = true;
	}
	return DP[0];
}

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> v;
    for (int i = 1; i <= n; ++i) {
        int x;
        cin >> x;
        v.push_back(x);
    }
    if (modularSum(v, n, m))
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
}