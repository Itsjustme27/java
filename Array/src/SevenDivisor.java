import java.util.Scanner;

public class SevenDivisor {
    public static void main(String[] args) {
        int n;
        int[] myArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range of the array: ");
        n = scanner.nextInt();
        myArray = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.println("The divisors of seven are: ");
        for(int i = 0; i < n; i++) {
            if(myArray[i]%7 == 0) {
                System.out.println(myArray[i]);
            }
        }
        scanner.close();
    }
}
