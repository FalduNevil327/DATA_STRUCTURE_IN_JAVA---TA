// Write a program to find factorial of a number. (Using Recursion)

import java.util.Scanner;

public class FactorialRecursion {
     
     static int factorial(int n){    
        if (n == 0) return 1;    
        else    
            return(n * factorial(n-1));    
 }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact=1;

        fact=factorial(n);

        System.out.println("Factorial : " + fact);
        sc.close();
    }
}
