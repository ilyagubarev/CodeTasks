package com.ilyagubarev.codetasks;

import com.ilyagubarev.codetasks.arrays.MatrixHelper;

/**
 * Application main class
 *
 * @version 1.01, 31 August 2013
 * @since 31 August 2013
 * @author Ilya Gubarev
 */
public final class Application {

    /**
     * Application execution entry point.
     *
     * @param args command line arguments.
     */
    public static void main(String ... args) {
        testMatrix();
    }
    
    private static void testMatrix() {
        int[][] matrix = new int[][] { new int[] {1, 1, 0, 1, 1}, new int[] {2, 0, 2, 2, 2}, new int[] {3, 3, 3, 3, 3}, new int[] {4, 4, 4, 4, 4}, new int[] {5, 5, 5, 5, 5}};
        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix.length; ++column) {
                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();            
        }
        System.out.println();            
        System.out.println();            
        MatrixHelper.completeZeroes(matrix);
        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix.length; ++column) {
                System.out.print(matrix[row][column]);
                System.out.print(" ");
            }
            System.out.println();            
        }        
    }

    private Application() {

    }
}
