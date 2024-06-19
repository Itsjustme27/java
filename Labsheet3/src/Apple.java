
public class Apple extends Fruit {
	private String color;
	private String taste;
	
	public Apple(String color, String taste) {
		this.color = color;
		this.taste = taste;
	}
	
	public void displayInfo() {
		System.out.println("Color of Apple: " + this.color);
		System.out.println("Taste of Apple: " + this.taste);
	}
	
	public static void main(String[] args) {
		Apple apple1 = new Apple("Red", "Sweet");
		apple1.displayInfo();
	}
}
