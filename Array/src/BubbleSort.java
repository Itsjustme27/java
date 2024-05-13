//bubble sorting an array into ascending.
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range: ");
        n = scanner.nextInt();
        arr = new int[n];
        //array input
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        //printing array
        System.out.print("Elements of array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nSorted Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
