package com.teachmeskills.hw08.exercise04;

import java.util.Arrays;

public class Utils {
    public static void showMatrix(int[][] m) {
        System.out.println(Arrays.deepToString(m));
    }

    public static int[][] showMatrix(int[][] m1, int[][] m2) {
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int rows2 = m2.length;
        int cols2 = m2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += m1[i][k] * m2[k][j];
                }

                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void showMatrix(int[][] m1, int[][] m2, int[][] m3) {
        System.out.println(Arrays.deepToString(m1));
        System.out.println(Arrays.deepToString(m2));
        System.out.println(Arrays.deepToString(m3));
    }
}
