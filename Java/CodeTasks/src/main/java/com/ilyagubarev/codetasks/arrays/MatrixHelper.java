package com.ilyagubarev.codetasks.arrays;

/**
 * Matrix processing methods.
 *
 * @version 1.01, 31 August 2013
 * @since 31 August 2013
 * @author Ilya Gubarev
 */public final class MatrixHelper {

     /**
      * Rotates specified square matrix by 90 degrees clockwise.
      *
      * @param matrix a square matrix.
      */
    public static void rotate(int[][] matrix) {

    }

    /**
     * Fills zero-contatining rows and columns complete with zeroes.
     *
     * @param matrix a matrix.
     */
    public static void completeZeroes(int[][] matrix) {
        if (matrix.length < 1) {
            return;
        }
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroColumns = new boolean[matrix[0].length];
        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix[0].length; ++column) {
                if (matrix[row][column] == 0) {
                    zeroRows[row] = true;
                    zeroColumns[column] = true;
                }
            }
        }
        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix[0].length; ++column) {
                if (zeroRows[row] || zeroColumns[column]) {
                    matrix[row][column] = 0;
                }
            }
        }        
    }

    private MatrixHelper() {

    }
}
