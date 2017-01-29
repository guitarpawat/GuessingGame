package lab01;

/**
 * Game of guessing secret numbers
 * @author Pawat Nakpiphatkul
 */

import java.util.Random;    //for random numbers

public class Game {
    private int secret;   //For store random number
    int input;  //Lastest user input
    int count = 0;    //Count time of guesses
    /**
     * Initialize a new game
     * @param upperbound is the max value for the random number
     */
    public Game(int upperbound){    //Constructor
        secret = getRandomNumber(upperbound);
    }
    /**
     * Create a random secret number between 1 and limit
     * @param limit is the upper limit of the random number
     * @return a random number in range of [1,limit)
     */
    private int getRandomNumber(int limit){
        long seed = System.currentTimeMillis(); //Create a seed by using computer time
        Random r = new Random(seed);    //Create Random object by using seed
        return r.nextInt(limit)+1;
    }
    /**
     * Check that the user's input number is equal to secret number or not
     * @param number is the user's input number
     * @return true if they are same else return false
    */
    public boolean guess(int number){
        input = number;
        count++;
        if(number == secret)
            return true;
        else
            getHint();
            System.out.println(getHint());
        return false;
    }
    /**
     * Get that user's input is too big or small
     * @return the String of hint
     */
    public String getHint(){
        if(input > secret)
            return "Number is too big...";
        else
            return "Number is too small...";
    }
    public int getCount(){
        return count;
    }
}
