import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExample {
	public static void main(String[] args) {
		try {
			File file = new File("nonexistentfile.txt");
			Scanner scanner = new Scanner(file);
		} catch(FileNotFoundException e) {
			System.out.println("Checked Exception: File not found");
			e.printStackTrace();
		}
		
		try {
			int result = 10 / 0;
		} catch(ArithmeticException e) {
			System.out.println("Unchecked Exception: Division by zero is not allowed");
			e.printStackTrace();
		}
	}
}
