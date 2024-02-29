package part5;

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	Player player;
	//add in Dealer instance variable
	Dealer dealer;

	public BlackJack()
	{
		player = new Player();
		dealer = new Dealer();
	}

	public void playGame()
	{
		char choice = 'y';
		while(choice=='y'||choice=='Y') {
			Scanner keyboard = new Scanner(System.in);
			dealer.shuffle();

			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());

			out.println("Current hand "+player);
			if(player.hit())
				player.addCardToHand(dealer.deal());
			if(dealer.hit())
				dealer.addCardToHand(dealer.deal());

			out.println("\nPLAYER ");
			out.println("Hand Value :: " + player.getHandValue() );
			out.println("Hand Size :: " + player.getHandSize() );
			out.println("Cards in Hand :: " + player);
			out.println("\nDEALER ");
			out.println("Hand Value :: " + dealer.getHandValue() );
			out.println("Hand Size :: " + dealer.getHandSize() );
			out.println("Cards in Hand :: " + dealer);

			int playerTotal = player.getHandValue();
			int dealerTotal = dealer.getHandValue();
			out.println();
			if(playerTotal>21&&dealerTotal<=21)
			{
				out.println("\nDealer wins - Player busted!");
				dealer.setWinCount(dealer.getWinCount()+1);
			}
			else if(playerTotal<=21&&dealerTotal>21)
			{
				out.println("\nPlayer wins - Dealer busted!");
				player.setWinCount(player.getWinCount()+1);
			}
			else if(playerTotal>21&&dealerTotal>21){
				out.println("Both players bust!");
			}
			else if(playerTotal<dealerTotal){
				out.println("\nDealer has bigger hand value!");
				dealer.setWinCount(dealer.getWinCount()+1);
			}
			else{
				out.println("\nPlayer has bigger hand value!");
				player.setWinCount(player.getWinCount()+1);
			}

			player.resetHand();
			dealer.resetHand();

			out.println("\nDealer has won "+dealer.getWinCount()+" times.");
			out.println("Player has won "+player.getWinCount()+" times.\n");

			out.print("Do you want to play again? [Y,y,N,n] :: ");
			choice=keyboard.nextLine().charAt(0);
		}
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}