public class Document implements Printable {
	public void print() {
		System.out.println("Printed!!");
	}
	
	public static void main(String[] args) {
		Document doc = new Document();
		
		doc.print();
	}
}
