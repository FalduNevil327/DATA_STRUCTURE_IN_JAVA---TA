// Write a program to find position of the smallest number from given n numbers.

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int small = array[0];
        int pos = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] < small) {
                small = array[i];
                pos = i;
            }
        }

        System.out.println("The position of the smallest number is: " + pos);
        sc.close();
    }
}
