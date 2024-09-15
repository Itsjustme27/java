//Question no. 2
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("source.dat");
			FileOutputStream fos = new FileOutputStream("destination.dat")) {
				byte[] buffer = new byte[1024];
				int bytesRead;
				while((bytesRead = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, bytesRead);
				}
		}catch(IOException e) {
			System.err.println("Cannot copy file" + e.getMessage());
		}
	}
}
			
