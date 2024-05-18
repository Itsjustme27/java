import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int range;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a range: ");
        range = scanner.nextInt();
        System.out.printf("The fibonacci series upto %d numbers: ", range);
        for(int i = 0; i < range; i++) {
            System.out.printf("%d ", fibo(i));
        }
        scanner.close();

    }
}
