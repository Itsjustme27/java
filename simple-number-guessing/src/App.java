import java.util.Scanner;
import java.util.Random;

public class App{
    public static void main(String[] args){
        int userChoice, range, random;
        boolean runLoop = true;
        System.out.println("-----Simple Number Guessing Game----");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Range: ");
        range = input.nextInt();
        Random randomNum = new Random();
        random = randomNum.nextInt(range);
        while(runLoop){
            int guesses = 0;
            System.out.println("Enter your number or Enter 3 to quit: ");
            userChoice = input.nextInt();
            if(userChoice == 3){
                runLoop = false;
                System.out.println("Number of guesses: "+ guesses);
                input.close();
            }
            guesses++;

            if(userChoice == random){
                System.out.println("You guessed it right!!");
                continue;
            }else if(userChoice > random){
                System.out.println("You guessed it high");
                continue;
            }else{
                System.out.println("You guessed it low");
                continue;
            }

        }
    }
}

