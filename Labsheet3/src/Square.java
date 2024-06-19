import java.util.Scanner;


public class Square extends Shape {
		float sideLength;
		public float calculateArea() {
			return sideLength * sideLength;
		}
		public static void main(String[] args) {
			Square square = new Square();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the side length of square: ");
			square.sideLength = sc.nextFloat();
			float areaOfSquare = square.calculateArea();
			sc.close();
			System.out.println("The area of Square is: " + areaOfSquare);
		}
}
