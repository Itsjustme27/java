import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0, rem;
        while(n != 0) {
            rem = n%10;
            sum = sum +rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        sum = sumOfDigits(num);
        System.out.printf("The sum of digits of %d is %d\n", num, sum);
        scanner.close();
    }
}
