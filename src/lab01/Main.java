package lab01;

/**
 * The game for guessing number between 1 and 20.
 * @author Pawat Nakpiphatkul
 * @version 1.2
 */
public class Main {
    /**
     * Initialize the secret number game.
     * @param args is unused.
     */
    public static void main(String[] args) {
        int upperbound = 20;    //Set limit upper bound of secret number to 20
        Game game = new Game(upperbound);   //intiallize Game object
        GameConsole ui = new GameConsole();     //intiallize GameConsole object
        ui.play(game);
    }
    
}
