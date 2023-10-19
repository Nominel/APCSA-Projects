

import java.util.Random;
import java.util.Scanner;


public class GuessingGame
{
	private int upperBound;
	private int guesses;
	private int num;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		Random rand = new Random();
		num = rand.nextInt(upperBound);
	}

	public void playGame()
	{
		guesses = 0;
		Scanner keyboard = new Scanner(System.in);

		int guess=0;
		while (guess!=num){
			System.out.print("Enter a number between 1 and "+upperBound+" ");
			guess= keyboard.nextInt();
			if(1<=guess&&guess<=upperBound){
				guesses++;
			}
			else{
				System.out.println("Number out of range!");
			}
		}

	}

	public String toString()
	{
		return "It took "+guesses+" guesses to guess "+num+".\n" +
				"You guessed wrong "+(guesses-1)*100/upperBound+" percent of the time.";
	}
}