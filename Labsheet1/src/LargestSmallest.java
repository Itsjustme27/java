import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr;
        int range, min = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range : ");
        range = scanner.nextInt();
        arr = new int[range];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < arr.length;  i++) {
            arr[i] = scanner.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
        System.out.println("The largest element in the array is: " + max);
        scanner.close();
    }
}
