// Write a generic class Container that holds an array of objects. Provide methods to
// add, get, and remove elements from the container. Ensure that the container
// dynamically resizes as needed.
public class Container<T> {
    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public Container() {
        elements = (T[]) new Object[2]; // Initial capacity of 2 for simplicity
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Help GC
        return removedElement;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newElements = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.add("One");
        stringContainer.add("Two");
        stringContainer.add("Three");

        System.out.println("String Container Size: " + stringContainer.size());
        System.out.println("Element at index 1: " + stringContainer.get(1));

        stringContainer.remove(1);
        System.out.println("Element at index 1 after removal: " + stringContainer.get(1));
        System.out.println("String Container Size after removal: " + stringContainer.size());

        Container<Integer> intContainer = new Container<>();
        for (int i = 0; i < 5; i++) { // Reduced to 5 for simplicity
            intContainer.add(i);
        }

        System.out.println("Integer Container Size: " + intContainer.size());
        System.out.println("Element at index 2: " + intContainer.get(2));

        intContainer.remove(2);
        System.out.println("Element at index 2 after removal: " + intContainer.get(2));
        System.out.println("Integer Container Size after removal: " + intContainer.size());
    }
}
		
			
	
