// Write a program to delete a number from an array that is already sorted in an ascending order.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to delete: ");
        int num = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(arr));

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Number not found in the array.");
        } else {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }
        sc.close();
    }
}
