
public class CmdSum {
	public static void main(String[] args) {
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			
			int sum = arg1 + arg2;
			System.out.println("First argument: " + args[0]);
			System.out.println("Second argument: " + args[1]);
			System.out.println("Sum of cmd Args : " + sum);

	}
}
