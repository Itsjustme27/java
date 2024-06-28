public class ArrayOutOfBoundsExample {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[]{1,2,3,4,5};
		try {
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
		
