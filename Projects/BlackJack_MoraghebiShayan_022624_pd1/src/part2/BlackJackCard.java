package part2;

public class BlackJackCard extends Card
{
	//constructors
	public BlackJackCard(){
		super();
	}

	public BlackJackCard(int face,String suit){
		super(face,suit);
	}

	public int getValue()
	{
		//enables you to build the value for the game into the card
		// this makes writing the whole program a little easier

		return super.getValue();
	}

}