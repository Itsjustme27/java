import java.util.Scanner;
public class If {
    public static void main(String[] args){
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.printf("%d is greater\n", num1);
        }else{
            System.out.printf("%d is greater\n", num2);
        }
        scanner.close();
    }
}
