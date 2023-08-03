// Write a program to read and display n numbers using an array.

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The numbers you entered are:");

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
