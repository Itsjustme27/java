public class NumberFormatExample {
	public static void main(String[] args) {
			int[] num;
			num = new int[]{1,2,3,4,5};
			String name = "HAwk Tuht";
			
			try {
				System.out.println(num[10]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
			try {
				int n = Integer.parseInt(name);
			} catch(NumberFormatException e) {
				System.out.println("Number Format Exception : " + e.getMessage());
			}
	}
}
