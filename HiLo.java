/*
 * User guesses random number with "high" "low" hints
 * Author: Maxwell Andrew
 */

import java.util.Scanner;
import java.util.Random;

public class HiLo {
  
  public static void main(String[] args) { 
    Random rnd = new Random();
    int target = rnd.nextInt(1000) + 1;
    int userGuess = -1;
    int tries = 0;
    
    System.out.print("Enter a guess: ");
    Scanner input = new Scanner(System.in);
    
    // guess loop
    while ( input.hasNextLine() ) {
       
        String line = input.nextLine();
        Scanner s2 = new Scanner(line); 
        tries++;
        
        // if number valid
        if  ( s2.hasNextInt() ) {
            userGuess = s2.nextInt();
            // if guess correct
            if ( userGuess == target ){
              System.out.println("You got it! It took you " + tries + " tries.");
              break;
            }
            // if guess high
            else if ( userGuess > target ) {
              System.out.println("Too high!");
            }
            // if guess low
            else if ( userGuess < target ) {
              System.out.println("Too low!");
            }
        } 
        // if invalid input
        else {
            tries--;
            System.out.println("Enter integer");
            continue;                       
        }

    }
  }
  
}
