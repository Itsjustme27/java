// Write a generic method printArray that prints all elements of an array. Test this
// method with arrays of different types.

public class PrintArray {
	public static<T> void printArray(T[] arr) {
		for(T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5};
		System.out.print("Integer array: ");
		printArray(intArr);
		
		String[] strArr = {"one", "two", "three", "four", "five"};
		 System.out.print("String array: ");
		printArray(strArr);

        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double array: ");
        printArray(doubleArr);

        Character[] charArr = {'A', 'B', 'C', 'D', 'E'};
        System.out.print("Character array: ");
        printArray(charArr);		
		
		
	}
}
