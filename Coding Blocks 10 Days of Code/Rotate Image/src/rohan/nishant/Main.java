/*Coding Blocks
Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.



Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16
3 7 11 15
2 6 10 14
1 5 9 13
Explanation
Rotate the array 90 degrees anticlockwise.*/
package rohan.nishant;
import java.util.*;
public class Main {
    static void rotateMatrix(int N, int[][] mat)
    {
        for (int x = 0; x < N / 2; x++) {
            for (int y = x; y < N - x - 1; y++) {
                int temp = mat[x][y];
                mat[x][y] = mat[y][N - 1 - x];
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
                mat[N - 1 - y][x] = temp;
            }
        }
    }
    static void displayMatrix(int N, int[][] mat)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];
        for (int i=0;i<N;++i)
            for (int j=0;j<N;++j)
                mat[i][j] = sc.nextInt();
        rotateMatrix(N, mat);
        displayMatrix(N, mat);
    }
}