#include <bits/stdc++.h>

using namespace std;

const int N = 9;
int sudoku[N][N];

bool usedInRow(int rowIndex, int num) {
    for (int col = 0; col < N; col++)
        if (sudoku[rowIndex][col] == num)
            return true;
    return false;
}

bool usedInCol(int columnIndex, int num) {
    for (int row = 0; row < N; row++)
        if (sudoku[row][columnIndex] == num)
            return true;
    return false;
}

bool usedInBox(int boxStartRowIndex, int boxStartColumnIndex, int num) {
    for (int rowIndex = 0; rowIndex < 3; rowIndex++)
        for (int columnIndex = 0; columnIndex < 3; columnIndex++)
            if (sudoku[rowIndex + boxStartRowIndex][columnIndex + boxStartColumnIndex] == num)
                return true;
    return false;
}

bool isSafe(int rowIndex, int columnIndex, int num) {
    return ((!usedInRow(rowIndex, num)) && (!usedInCol(columnIndex, num)) &&
            (!usedInBox((rowIndex - rowIndex % 3), (columnIndex - columnIndex % 3), num)) &&
            (sudoku[rowIndex][columnIndex] == 0));
}

bool FindUnassignedLocation(int &rowIndex, int &columnIndex) {
    for (rowIndex = 0; rowIndex < N; rowIndex++)
        for (columnIndex = 0; columnIndex < N; columnIndex++)
            if (sudoku[rowIndex][columnIndex] == 0)
                return true;
    return false;
}

bool sudokuSolver() {
    int rowIndex = 0, columnIndex = 0;
    if (!FindUnassignedLocation(rowIndex, columnIndex))
        return true;
    for (int num = 1; num <= 9; num++) {
        if (isSafe(rowIndex, columnIndex, num)) {
            sudoku[rowIndex][columnIndex] = num;
            if (sudokuSolver())
                return true;
            sudoku[rowIndex][columnIndex] = 0;
        }
    }
    return false;
}

void printGrid() {
    for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++)
            cout << sudoku[row][col] << " ";
        cout << endl;
    }
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < N; ++i)
        for (int j = 0; j < N; ++j)
            cin >> sudoku[i][j];
    if (sudokuSolver())
        printGrid();
    return 0;
}
