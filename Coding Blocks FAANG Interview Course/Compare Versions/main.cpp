#include <bits/stdc++.h>

using namespace std;

int main() {
    string versionOne, versionTwo;
    getline(cin, versionOne);
    getline(cin, versionTwo);
    versionOne += ".";
    versionTwo += ".";
    int n = versionOne.length(), m = versionTwo.length();
    int counterOne = 0, counterTwo = 0;
    int arrayOne[1001] = {0}, arrayTwo[1001] = {0}, previousPosition = 0;
    int flag = 0;
    for (int i = 0; i < n; ++i) {
        if (versionOne[i] == '.') {
            arrayOne[counterOne++] = std::stoi(versionOne.substr(previousPosition, i));
//            cout << std::stoi(versionOne.substr(previousPosition, i)) << endl;
            previousPosition = i + 1;
        }
    }
    previousPosition = 0;
    for (int i = 0; i < m; ++i) {
        if (versionTwo[i] == '.') {
            arrayTwo[counterTwo++] = std::stoi(versionTwo.substr(previousPosition, i));
//            cout << std::stoi(versionTwo.substr(previousPosition, i)) << endl;
            previousPosition = i + 1;
        }
    }
//    for (int i = 0; i < 5; ++i)
//        cout << arrayOne[i] << " " << arrayTwo[i] << endl;
    for (int i = 0; i < 1001; ++i) {
        if (arrayOne[i] > arrayTwo[i]) {
            flag = 1;
            break;
        } else if (arrayOne[i] < arrayTwo[i]) {
            flag = -1;
            break;
        }
    }
    cout << flag << endl;
    return 0;
}
