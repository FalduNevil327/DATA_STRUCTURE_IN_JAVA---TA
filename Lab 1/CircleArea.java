// Write a program to calculate area of a Circle.

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        
        double area = Math.PI * r * r;
        
        System.out.println("Area of the circle : " + area);
        sc.close();
        
    }
}
