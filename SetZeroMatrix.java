/*

Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

*/

class Solution {
    public void setZeroes(int[][] matrix) {

        int m[] = new int[matrix.length];
        int n[] = new int[matrix[0].length];
        int r = matrix.length;
        int c = matrix[0].length;
        Arrays.fill(m, 1);
        Arrays.fill(n, 1);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    m[i] = 0;
                    n[j] = 0;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i] == 0 || n[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}

