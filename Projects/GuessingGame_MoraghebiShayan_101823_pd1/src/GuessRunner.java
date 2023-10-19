
import java.util.Scanner;

public class GuessRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		char response='y';
		int numbers;

		while (response=='y'){
			System.out.print("Guessing Game - how many numbers? ");
			numbers = keyboard.nextInt();
			GuessingGame guess = new GuessingGame(numbers);
			guess.playGame();
			System.out.print("\n"+guess);
			System.out.print("\n\n\nDo You Want to play again? ");
			response=keyboard.next().charAt(0);
		}
	}
}