import java.util.Scanner;

public class greet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Name;
		String adminName = "Prayush";
		
		System.out.println("Enter your name: ");
		Name = scan.nextLine();
		
		if(Name.equals(adminName)) {
			System.out.println("Welcome " + adminName);
		} else {
			System.out.println("Welcome guest");
		}
		scan.close();
	}
} 
