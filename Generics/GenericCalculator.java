import java.util.Scanner;

public class GenericCalculator<T extends Number> {
	private T num1;
	private T num2;
	
	public GenericCalculator(T num1, T num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T add() {
		return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
	}
	
	public T subtract() {
		return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
	}
	
	public T divide() {
		if(num2.doubleValue() == 0) {
			throw new ArithmeticException("Division by zero");
		}
		return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
	}
	
	public T multiply() {
		return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		Double num1 = scan.nextDouble();
		System.out.print("Enter number 2: ");
		Double num2 = scan.nextDouble();
		
		GenericCalculator<Double> calc = new GenericCalculator<>(num1, num2);
		
		System.out.print("Enter your choice (1: addition, 2: subtraction, 3: division, 4: multiply): ");
		int choice = scan.nextInt();
		
		switch(choice) {
			case 1: 
				System.out.println("Result: " + calc.add());
				break;
			case 2:
				System.out.println("Result: " + calc.subtract());
				break;
			case 3:
				try {
					System.out.println("Result: " + calc.divide());
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Result: " + calc.multiply());
				break;
			default:
				System.out.println("Please enter a valid operator");
				break;
		}
		
		scan.close();
	}
}
