import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int num, factorial;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = scanner.nextInt();
        factorial = fact(num);
        System.out.printf("Factorial of %d is %d\n", num, factorial);
        scanner.close();
    }
}
