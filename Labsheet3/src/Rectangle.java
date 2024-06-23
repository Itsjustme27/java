public class Rectangle extends Shape2 {
	public float calculatePerimeter(float l, float b) {
		return 2*(l + b);
	}
	
	public static void main(String[] args) {
		Shape2 rectangle = new Rectangle();
		
		float perimeter = rectangle.calculatePerimeter(6,3);
		System.out.println("Perimeter of Rectangle is : " + perimeter);
	}
}
