import java.util.Scanner;

public class Area{
    static final double PI = 3.1416;
    public static void main(String[] args){
        int r;
        double area;
        System.out.println("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        area = PI * r * r;
        System.out.printf("Area: %f\n", area);
        scanner.close();
    }
}