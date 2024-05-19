import java.util.Scanner;

public class FactorialRecursion {
    public static int fact(int n) {
        if(n == 0) 
            return 1;
        else
            return n * fact(n-1);
    } 
    
    public static void main(String[] args) {
        int num, factorial;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        factorial = fact(num);
        System.out.printf("The factorial of %d is %d\n", num, factorial);
        scanner.close();
    }
}