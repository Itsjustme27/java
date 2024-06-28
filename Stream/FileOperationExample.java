import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileOperationExample {
	public static void main(String[] args) {
		String filePath = "example.txt";
		File file = new File(filePath);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
			System.out.println("File already exists!");
			}
	} catch(IOException e) {
			System.out.println("An error occured while creating the file");
			e.printStackTrace();
		}
		
		if(file.exists()) {
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute path; " + file.getAbsolutepath());
			System.out.println("Writeable: " + file.canWrite());
			System.out.println("Readable: "  + file.canRead());
			System.out.println("File size in bytes "  + file.length());
			System.out.println("Last modified: " + file.lastModified());
		} else { 
			System.out.println("The file does not exist");
		}
		
		try (FileWriter writer = new FileWriter(filePath) {
			writer.write("Hello, World!\n");
			writer.write("This is a file write example");
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occured while reading the file");
			e.printStack
