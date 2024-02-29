package part3;

import java.util.*;

public class Player
{
	private ArrayList<Card> hand;
	private int winCount;

	public Player ()
	{
		hand=new ArrayList<>();
	}

	public Player (int score)
	{
		this();
		setWinCount(score);
	}

	public void addCardToHand( Card temp )
	{
		hand.add(temp);
	}

	public void resetHand( )
	{
		hand = new ArrayList<>();
	}

	public  void setWinCount( int numwins )
	{
		winCount=numwins;
	}

	public int getWinCount() {
		return winCount;
	}

	public int getHandSize() {
		return hand.size();
	}

	public int getHandValue()
	{
		int val = 0;
		for(Card temp : hand)
			val+=temp.getValue();
	        return val;
	}

	public  boolean  hit( )
	{
	        return false;
	}

	public String toString()
	{
	return "hand = "+hand;
	}
}