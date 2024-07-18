// Write a generic method swap that swaps the positions of two elements in an array.
// Demonstrate this method with arrays of different types (e.g., Integer, String).

public class Swap<T> {

	
	public static <T> void swap(T[] arr, int index, int index2) {
		T temp;
		temp = arr[index];
		arr[index] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		System.out.println("Array before swap: ");
		for(int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		swap(intArray, 2,3);
		
		System.out.println("Array after swap: ");
		for(int i : intArray) {
			System.out.print(i + " "); 
		}
		System.out.println();
		
        // Demonstrate swap with String array
        String[] strArray = {"one", "two", "three", "four", "five"};
        System.out.println("String array before swap: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();
        
        swap(strArray, 0, 4);
        
        System.out.println("String array after swap: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
		
		
	
