import java.io.*;

public class Data {
	public static void main(String[] args) {
		String path = "data.dat";
		File file = new File(path);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already created!");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"))) {
			dos.writeInt(12);
			dos.writeFloat(3.1416f);
			dos.writeUTF("HEY");
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		try(DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
			int intValue = dis.readInt();
			float floatValue = dis.readFloat();
			String stringValue = dis.readUTF();
			
			System.out.println("Int: " + intValue);
			System.out.println("Float: " + floatValue);
			System.out.println("String: " + stringValue);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
			
				
