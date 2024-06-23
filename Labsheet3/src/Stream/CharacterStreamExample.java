import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("source2.txt");
			FileWriter fw = new FileWriter("destination2.txt")) {
				char[] buffer = new char[1024];
				int charsRead;
				while ((charsRead = fr.read(buffer)) != -1) {
					fw.write(buffer, 0, charsRead);
				}
		} catch(IOException e) {
			System.out.println("Error copying files: " + e.getMessage());
		}
	}
}	
