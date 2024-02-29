package part6;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class BlackJack
{
	//add in Player instance variable
	ArrayList<Player> players;
	//add in Dealer instance variable
	Dealer dealer;

	public BlackJack()
	{
		players = new ArrayList<>();
		dealer = new Dealer();

	}

	public void playGame()
	{
		Scanner key = new Scanner(System.in);
		char choice = 'y';
		out.print("How many players do you want? ");
		int play = key.nextInt();
		for (int i = 0; i < play; i++) {
			players.add(new Player());
		}
		while(choice=='y'||choice=='Y') {
			dealer.shuffle();
			Scanner keyboard = new Scanner(System.in);

			for(Player player:players) {
				player.addCardToHand(dealer.deal());
				player.addCardToHand(dealer.deal());
			}
			dealer.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());

			for(int i=0; i<players.size();i++) {
				out.println("\n\nCurrent hand for player "+(i+1)+" "+players.get(i));
				if (players.get(i).hit())
					players.get(i).addCardToHand(dealer.deal());
			}
			if(dealer.hit())
				dealer.addCardToHand(dealer.deal());

			for(int i=0; i<players.size();i++) {
				out.println("\nPLAYER "+(i+1));
				out.println("Hand Value :: " + players.get(i).getHandValue());
				out.println("Hand Size :: " + players.get(i).getHandSize());
				out.println("Cards in Hand :: " + players.get(i));
			}
			out.println("\nDEALER ");
			out.println("Hand Value :: " + dealer.getHandValue() );
			out.println("Hand Size :: " + dealer.getHandSize() );
			out.println("Cards in Hand :: " + dealer);


			out.println();
			int largestHandIndex=0;
			for(int i=0; i<players.size();i++){
				if(players.get(i).getHandValue()>21)
					out.println("Player "+(i+1)+" is bust!");
				else if(players.get(i).getHandValue()>players.get(largestHandIndex).getHandValue()||players.get(largestHandIndex).getHandValue()>21)
					largestHandIndex=i;
			}
			if(dealer.getHandValue()>21) {
				out.println("Dealer is bust!");
				boolean tie = false;
				for(int i=0; i<players.size();i++) {
					if(i==largestHandIndex)
						continue;
					if(players.get(i).getHandValue()==players.get(largestHandIndex).getHandValue())
						tie=true;
				}
				if(tie){
					out.println("Players have tied!");
				}
				else if (players.get(largestHandIndex).getHandValue()<=21) {
					out.println("Player "+(largestHandIndex+1)+" has the largest hand!");
					players.get(largestHandIndex).setWinCount(players.get(largestHandIndex).getWinCount()+1);
				}
				else{
					out.println("Everybody is bust!");
				}
			}
			else if(dealer.getHandValue()==players.get(largestHandIndex).getHandValue()){
				out.println("Player and dealer have tied");
			}
			else if(players.get(largestHandIndex).getHandValue()>21) {
				out.println("All Players are bust!");
				dealer.setWinCount(dealer.getWinCount()+1);
			} else if(dealer.getHandValue()>players.get(largestHandIndex).getHandValue()) {
				out.println("Dealer has largest hand!");
				dealer.setWinCount(dealer.getWinCount()+1);
			}
			else{
				out.println("Player "+(largestHandIndex+1)+" has the largest hand!");
				players.get(largestHandIndex).setWinCount(players.get(largestHandIndex).getWinCount()+1);
			}
			for (Player player : players)
				player.resetHand();
			dealer.resetHand();

			out.println("\nDealer has won "+dealer.getWinCount()+" times.\n");
			for(int i=0; i<players.size();i++)
				out.println("Player "+(i+1)+" has won "+players.get(i).getWinCount()+" times.\n");

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