import java.util.Scanner;

public class Area{
    public static final double PI = 3.1416;
    public static void main(String[] args){
        int r;
        double area;
        System.out.println("Enter radius: ");
        Scanner radius = new Scanner(System.in);
        r = radius.nextInt();
        area = PI * r * r;
        System.out.println("Area: " + area);
        radius.close();
    }
}