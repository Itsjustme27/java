

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws Exception {
       int num, sum = 0;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       num = scanner.nextInt();
       for(int i = 0; i <= num; i++){
        sum += i;
       }
       System.out.printf("The sum is : %d\n", sum);
       scanner.close();
    }
}
