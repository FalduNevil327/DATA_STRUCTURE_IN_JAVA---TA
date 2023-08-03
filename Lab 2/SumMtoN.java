// 10. Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

class SumMtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from where you want to start calculating sum : ");
        int m = sc.nextInt();
        System.out.print("Enter till where you want to calculate sum : ");
        int n = sc.nextInt();

        if (m > n) {
            System.out.println("Invalid Input");
        }
        else {
            int sum = 0;
            for (int i = m; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum from " + m + " to " + n + " is : " + sum);
        }
        sc.close();
    }
}