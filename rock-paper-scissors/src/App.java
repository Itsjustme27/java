import java.util.Random;    //Step 1: import random
import java.util.Scanner;   //Step 1: import scanner


public class App {
    public static void main(String[] args) throws Exception {
        int userWins = 0, compWins = 0, draw = 0, randomNumber;
        String userChoice;
        String compChoice;
        String[] options = {"rock", "paper", "scissors"};
        Scanner myObj = new Scanner(System.in);             //Step 2: Create a scanner object
        Random rand = new Random();             //Step 2: Create a instance of random class
        boolean runLoop = true;

        System.out.println("-------Rock paper scissors-------\n");
        System.out.println("1.rock\n2.paper\n3.scissors\n4.exit");
        System.out.println("NOTE: Please type in lowercase...\n");

        while (runLoop) {
            System.out.println("Enter your choice: ");
            userChoice = myObj.nextLine();      //Step 3: Read user input
            if (userChoice.equals("exit")) {
                System.out.println("User Wins: "+ userWins);
                System.out.println("Computer Wins: "+ compWins);
                System.out.println("Draws: "+ draw);
                runLoop = false;
                break;
            }
  
            
            randomNumber = rand.nextInt(3);         //create a random number between 1-3

            compChoice = options[randomNumber];
            System.out.println("Computer chose "+ compChoice);

            if (userChoice.equals("rock") && compChoice.equals("scissors")) {
                System.out.println("User Wins\n");
                userWins++;
                continue;
            }else if(userChoice.equals("paper") && compChoice.equals("rock")){
                System.out.println("User Wins\n");
                userWins++;
                continue;
            }else if(userChoice.equals("scissors") && compChoice.equals("paper")){
                System.out.println("User Wins\n");
                userWins++;
                continue;
            }else if(userChoice.equals(compChoice)){
                System.out.println("It's a draw\n");
                draw++;
                continue;
            }else{
                System.out.println("Computer Wins\n");
                compWins++;
                continue;
            }

        }
    }
}
