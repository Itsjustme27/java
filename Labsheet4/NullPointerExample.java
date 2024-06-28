public class NullPointerExample {
	public static void main(String[] args) {
		int[] arr = null;
		try {
			System.out.println("The length of the array is : " + arr.length);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
