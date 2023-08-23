package com.teachmeskills.hw08.exercise04;

public class Exercise04 {
    public static void main(String[] args) {
        int[][] m1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] m2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] m3 = Utils.showMatrix(m1, m2);
        Utils.showMatrix(m3);
        Utils.showMatrix(m1, m2, m3);
    }
}
