public class Student implements IComparable {
	public void compareTo() {
		System.out.println("Compared!");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.compareTo();
	}
}
