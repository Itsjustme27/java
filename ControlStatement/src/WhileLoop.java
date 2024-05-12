

//sum of two numbers using while loop
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        int num, sum = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.printf("The sum is : %d\n", sum);
        scanner.close();
    }
}