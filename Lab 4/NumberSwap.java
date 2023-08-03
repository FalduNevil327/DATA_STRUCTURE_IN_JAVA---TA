// Write a program to swap two numbers using user-defines method.

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        swapNumbers(number1, number2);
        sc.close();
    }

    public static void swapNumbers(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Swapped numbers inside the method:");
        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);
        
    }
}
