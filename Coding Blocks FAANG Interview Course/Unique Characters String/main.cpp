#include <bits/stdc++.h>

using namespace std;

int myRecursiveFunction(vector<string> v, int i, string s) {
    if (i == v.size()) {
        if (s.length() > 26)
            return 0;
        int frequencyArray[26] = {0};
        for (char j : s) {
            if (frequencyArray[j - 'a'] == 1)
                return 0;
            frequencyArray[j - 'a']++;
        }
        return s.length();
    }
    int optionOne, optionTwo;
    optionOne = optionTwo = INT_MIN;
    if ((s.length() + v[i].length()) <= 26)
        optionOne = myRecursiveFunction(v, i + 1, s + v[i]);
    optionTwo = myRecursiveFunction(v, i + 1, s);
    return max(optionOne, optionTwo);
}

int uniqueCharactersString(vector<string> v) {
    string s="";
    return myRecursiveFunction(v, 0, s);;
}

int main() {
    int n;
    cin >> n;
    vector<string> v;
    for (int i = 0; i < n; ++i) {
        string s;
        cin >> s;
        v.push_back(s);
    }
    cout << uniqueCharactersString(v) << endl;
}