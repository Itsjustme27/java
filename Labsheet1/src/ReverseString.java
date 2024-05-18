import java.util.Scanner;

public class ReverseString {
    public static String revString(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String inputString,  reversedString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();
        reversedString = revString(inputString);
        System.out.printf("Reversed String: %s", reversedString);
        scanner.close();
    }
}
