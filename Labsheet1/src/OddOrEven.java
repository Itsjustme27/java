import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        try{
            if(num%2 == 0) {
                System.out.printf("%d is Even\n", num);
            }else {
                System.out.printf("%d is Odd\n", num);
            }
            scanner.close();
        }catch (InputMismatchException e) {
            System.err.print(e);
        }
    }
}
