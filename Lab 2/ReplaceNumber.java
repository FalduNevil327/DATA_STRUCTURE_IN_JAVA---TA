// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the first number to replace: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == firstNum) {
                array[i] = secondNum;
                index = i;
                break;
            }
        }

        System.out.println("Index of the replaced number: " + index);
        // System.out.println("Final array:"+java.util.Arrays.toString(array));

        System.out.println("Final array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
