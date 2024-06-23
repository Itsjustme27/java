
public class MathOperation implements IMathOperation  {
	public void operation(int x, int y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		MathOperation add = new MathOperation();
		add.operation(1,1);
	}
	
	
}
