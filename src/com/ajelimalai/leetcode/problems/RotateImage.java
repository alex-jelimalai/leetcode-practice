package com.ajelimalai.leetcode.problems;

public class RotateImage {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6};
        arr[2] = new int[]{7, 8, 9};

        rotate(arr);
    }

    public static void rotate(int[][] matrix) {
        int L = matrix.length;
        print(matrix);
        for (int i = 0; i < L / 2; i++) {
            for (int j = i; j < L - i - 1; j++) {
                int temp = matrix[i][j];
                int ti = i;
                int tj = j;
                for (int k = 0; k < 4; k++) {
                    int prevTi = ti;
                    ti = tj;
                    tj = matrix.length - 1 - prevTi;
                    temp = rotateStep(ti, tj, temp, matrix);
                    print(matrix);
                }
            }
        }
    }

    private static int rotateStep(int ti, int tj, int temp, int[][] matrix) {
        int tempt = matrix[ti][tj];
        matrix[ti][tj] = temp;
        return tempt;
    }


    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(',');
            }
            System.out.println();
        }
        System.out.println("--------------");
    }

}
