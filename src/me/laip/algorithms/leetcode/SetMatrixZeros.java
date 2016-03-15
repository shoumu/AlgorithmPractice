package me.laip.algorithms.leetcode;

/**
 * Created by Arthur on 2016/3/15.
 * leetcode 73
 */
class SetMatrixZeros {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] rowFlag = new int[m];
        int [] colFlag = new int[n];
        for (int i = 0; i < m; i ++) {
            rowFlag[i] = 1;
        }
        for (int j = 0; j < n; j ++) {
            colFlag[j] = 1;
        }
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = 0;
                    colFlag[j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] != 0 && (rowFlag[i] == 0 || colFlag[j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row = false, col = false;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        row = true;
                    }
                    if (j == 0) {
                        col = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                if (matrix[i][j] != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (row) {
            for (int j = 0; j < n; j ++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {{0, 0, 1}, {1, 1, 1}, {0, 1, 1}};
//        int[][] matrix = {{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}};
        int[][] matrix = {{1, 1, 1}, {0, 1, 2}};
//        int [][] result = new SetMatrixZeros().setZeroes2(matrix);
        new SetMatrixZeros().setZeroes2(matrix);
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[0].length; j ++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
