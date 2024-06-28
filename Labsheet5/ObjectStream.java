import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class ObjectStream {
	public static void main(String[] args) {
		String path = "person.ser";
		File file = new File(path);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File Created: " + file.getName());
			} else {
				System.out.println("File already created");
			}
		}catch(IOException e) {
			System.err.println("Error created File" + e.getMessage());
			e.printStackTrace();
		}
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
			Person obj = new Person("John", 30);
			oos.writeObject(obj);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
			Person obj = (Person) ois.readObject();
			System.out.println(obj.toString());
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
			
