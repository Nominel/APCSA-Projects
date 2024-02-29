package part6;

import java.util.ArrayList;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<>();
		topCardIndex=51;

		//loop through suits
		for (int i = 0; i < NUMSUITS; i++) {
			//loop through faces
			for (int j = 1; j <= NUMFACES; j++) {
				//add in a new card
				stackOfCards.add(new BlackJackCard(j,SUITS[i]));
			}
		}


	}

	//modifiers
	public void shuffle ()
	{
		//shuffle the deck
		for (int i = stackOfCards.size(); i > 1; i--) {
			Card temp = stackOfCards.get(i-1);
			int replace = (int) (Math.random() * i);
			stackOfCards.set(i-1,stackOfCards.get(replace));
			stackOfCards.set(replace,temp);
		}
		//reset variables as needed
		topCardIndex=51;
	}

	//accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex+1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	}
}