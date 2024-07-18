// Write a generic class Box that can hold any type of object. Demonstrate how
// generics can help prevent runtime type errors by trying to add incompatible types
// without using generics.
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setContent(123); // This is fine

        Box<String> strBox = new Box<>();
        strBox.setContent("Hello, world!"); // This is fine
	
		System.out.println("Integer: " + intBox.getContent());
		System.out.println("Integer: " + strBox.getContent());
    }
}
