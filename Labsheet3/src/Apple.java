
public class Apple extends Fruit {
	private String taste;
	
	public Apple(String color, String taste) {
		super(color);
		this.taste = taste;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Taste of Apple: " + this.taste);
	}
	
	public static void main(String[] args) {
		Apple apple1 = new Apple("Red", "Sweet");
		apple1.displayInfo();
	}
}
