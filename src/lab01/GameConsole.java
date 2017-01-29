package lab01;

import java.util.Scanner;   //To accept user input

/**
 *
 * @author Pawat Nakpiphatkul
 */
public class GameConsole {
    /**
     * Starts and runs the game.
     * @param game to get current Game object
     * @return user's guessed secret number
     */
    public int play(Game game){
        int input;
        System.out.println("I'm thinking of a number between 1 and 20.");
        Scanner in = new Scanner(System.in);
        System.out.println("Guessing Game");
        while(true){
            System.out.print("Your guess? : ");
            input = in.nextInt();
            if(game.guess(input))
                break;
        }
        System.out.println("Right! The secret number is "+input+".");
        System.out.println("You used "+game.getCount()+" guesses.");
        return input;
    }
}
