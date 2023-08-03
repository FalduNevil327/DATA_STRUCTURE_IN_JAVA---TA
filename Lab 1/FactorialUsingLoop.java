// Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial : " + factorial);
        sc.close();
    }
}
