public class ScientificCalculator extends Calculator{
	@Override
	public int add(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		int result = sc.add(2,2);
		System.out.println("The result is: " + result);
	}
}
