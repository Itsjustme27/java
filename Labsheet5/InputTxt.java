
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputTxt {
	public static void main(String[] args) {
		BufferedReader reader = null;
		
		try{
			FileReader fr = new FileReader("input.txt");
			
			reader = new BufferedReader(fr);
			
			String line;
			while((	line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
