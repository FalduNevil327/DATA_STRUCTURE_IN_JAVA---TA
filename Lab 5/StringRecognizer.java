import java.util.Scanner;
import java.util.Stack;

class Recognize {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string with a space attached at the end : ");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();

        st.push('c');

        int i = 1;
        char next = s.charAt(0);
        while (next != 'c') {
            if (next == ' ') {
                System.out.println("Invalid String.");
                System.exit(0);
            } else {
                st.push(next);
                next = s.charAt(i);
                i++;
            }
        }

        while (!st.peek().equals('c')) {
            next = s.charAt(i);
            i++;
            char x = st.pop();
            if (next != x) {
                System.out.println("Invalid String.");
                System.exit(0);
            }
        }

        next = s.charAt(i);
        if (next == ' ') {
            System.out.println("It is a valid string.");
        } else {
            System.out.println("Invalid String.");
        }
        sc.close();
    }
}