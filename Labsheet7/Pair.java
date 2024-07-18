// Create a generic class Pair that holds two values of potentially different types. Add
// methods to get the values and set new values. Demonstrate its usage with different
// type pairs.

public class Pair<U, V> {
	private U first;
	private V second;
	
	public Pair(U first, V second) {
		this.first = first;
		this.second = second;
	}
	
	public U getFirst() {
		return first;
	}
	
	public void setFirst(U first) {
		this.first = first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public void setSecond(V second) {
		this.second = second;
	}
	
	public static void main(String[] args) {
		Pair<Integer, String> intStringPair = new Pair<>(1, "One");
		
		System.out.println("Integer:  " + intStringPair.getFirst() + " String: " + intStringPair.getSecond());
		
		intStringPair.setFirst(2);
		intStringPair.setSecond("Two");
		
		System.out.println("Integer: " + intStringPair.getFirst() + " String: " + intStringPair.getSecond());
	}
}
		
		
		
