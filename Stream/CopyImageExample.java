import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("image.jpg");
		FileOutputStream fos = new FileOutputStream("copy_image.jpg")) {
			byte[] buffer = new byte[1024];
			int byteRead;
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, byteRead);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}	
