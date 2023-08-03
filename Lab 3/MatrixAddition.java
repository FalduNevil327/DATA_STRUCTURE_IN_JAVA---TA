// Read two 2x2 matrices and perform addition of matrices into third matrix and print it

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[2][2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] sumMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
