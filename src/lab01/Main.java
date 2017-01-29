package lab01;
/**
 *
 * @author Pawat Nakpiphatkul
 */
public class Main {
    /**
     * Intiallize the secret number game
     * @param args is unused
     */
    public static void main(String[] args) {
        int upperbound = 20;    //Set limit upper bound of secret number to 20
        Game game = new Game(upperbound);   //intiallize Game object
        GameConsole ui = new GameConsole();     //intiallize GameConsole object
        ui.play(game);
    }
    
}
