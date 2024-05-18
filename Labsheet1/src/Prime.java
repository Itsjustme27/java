import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n){
        boolean flag = true;
        if (n < 2) {
            flag = false;
            return flag;
        }
        for(int i = 2; i < n; i++) {
            if(n%2 == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        if (checkPrime(num)) {
            System.out.printf("%d is Prime\n", num);
        }else {
            System.out.printf("%d is not Prime", num);
        }
        scanner.close();
    }
}