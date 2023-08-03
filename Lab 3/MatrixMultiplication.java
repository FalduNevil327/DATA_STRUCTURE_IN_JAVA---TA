// Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in third matrix and print it.

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[3][2];
        System.out.println("Enter the elements of the first matrix (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        int[][] matrix2 = new int[2][3];
        System.out.println("Enter the elements of the second matrix (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] productMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
