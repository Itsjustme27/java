import java.util.Scanner;

public class Temperature {
    public static float toCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static float toFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        float celsius , fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Convert Fahrenheit to Celsius\n 2.Convert Celsius to Fahrenheit: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter degree in Fahrenheit: ");
                fahrenheit = scanner.nextFloat();
                celsius = toCelsius(fahrenheit);
                System.out.printf("%f degree fahrenheit equals to %f degree celsius!\n", fahrenheit, celsius);
                break;
            case 2:
                System.out.print("Enter degree in Celsius: ");
                celsius = scanner.nextFloat();
                fahrenheit = toFahrenheit(celsius);
                System.out.printf("%f degree celsius equals to %f degree fahrenheit!\n", celsius, fahrenheit);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
        scanner.close();
    }
}