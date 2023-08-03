// Write a program to find whether the array contains a duplicate number or not.

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("The array entered by you contains duplicate elements.");
        }
        else {
            System.out.println("The array entered by you does not contains duplicate.");
        }
        sc.close();
    }
}
