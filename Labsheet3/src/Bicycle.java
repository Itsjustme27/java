public class Bicycle extends Vehicle {
	private int gears;
	public Bicycle(int speed, int gears) {
		super(speed);
		this.gears = gears;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("No of gears: " + gears);
	}
	
	public static void main(String[] args) {
		Bicycle bike = new Bicycle(74, 5);
		
		bike.displayInfo();
	}
}
