public class IllegalArgumentExample {
	public static void example(int num) throws Exception {
		try {
			if(num < 0) {
				throw new IllegalArgumentException("Cannot pass negative Number");
			} else {
				System.out.println(num);
			}
		} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
		}
	}
		
	public static void main(String[] args) throws Exception{
		try {
			example(-1);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.print("Finally statement after try catch");
		}
	}
}
