// Write a program to determine whether the entered character is vowel or not.

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }
        sc.close();

        // String vowels = "aeiouAEIOU";
        // System.out.print("Enter a Character : ");
        // char c = sc.next().charAt(0);
        // if (vowels.indexOf(c) != -1) {
        //     System.out.println("Entered character is a Vowel");
        // }
        // else {
        //     System.out.println("Entered character is not a Vowel");
        // }

    }
}
