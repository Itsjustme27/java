
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------Simple Console Calculator-------\n");
        System.out.print("Enter operator (+, -, *, /): ");
        Scanner op = new Scanner(System.in);
        char operator = op.next().charAt(0);
        Scanner number = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = number.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = number.nextInt();
        // String message = String.format("The numbers are %d and %d", num1, num2);
        // System.out.println(message);
        op.close();
        number.close();
        switch (operator) {
            case '+':
                int sum = num1 + num2;
                String sumMsg = String.format("The sum is %d", sum);
                System.out.println(sumMsg);
                break;
            case '-':
                int diff = num1 - num2;
                String diffMsg = String.format("The difference is : %d", diff);
                System.out.println(diffMsg);
                break;
            case '*':
                int product = num1 * num2;
                String productMsg = String.format("The product is : %d", product);
                System.out.println(productMsg);
                break;
            case '/':
                float div = (float)num1 / (float)num2;
                String divMsg = String.format("The division is : %f", div);
                System.out.println(divMsg);
                break;
            default:
                System.out.println("Please enter a valid operator!");
                break;
        }
    }
}
