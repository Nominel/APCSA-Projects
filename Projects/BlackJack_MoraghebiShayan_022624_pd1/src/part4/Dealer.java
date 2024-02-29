package part4;

import java.util.ArrayList;

public class Dealer extends Player
{
	//define a deck of cards
	private ArrayList<Card> hand;
	private Deck deck;
	public Dealer() {
		hand=new ArrayList<>();
		deck=new Deck();
	}

	public void  shuffle()
	{
	   //shuffle the deck
		deck.shuffle();
	}

	public Card  deal(){
	   return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
	   return false;
    }
}








