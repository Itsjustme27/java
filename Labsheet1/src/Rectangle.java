// Area of Rectangle

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float length, breadth, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        length = scanner.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        breadth = scanner.nextFloat();
        area = length * breadth;
        System.out.printf("The area of rectangle is %f\n", area);
        scanner.close();
    }
}