

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int num, sum = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        do{
            sum += i;
            i++;
        }while(i <= num);
        System.out.printf("The sum is %d", sum);
        scanner.close();
    }
}
