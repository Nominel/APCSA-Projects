package part5;

public class Card
{
	public static final String[] FACES = {"ZERO","ACE","TWO","THREE","FOUR",
		"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

	//constructors
	public Card(){
		this(0,"");
	}
	public Card(int face, String suit){
		this.face = face;
		this.suit = suit;
	}


	// modifiers
	public void setFace(int face) {
		this.face = face;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}


	//accessors
	public int getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}


	public int getValue()
	{
		if(face==1)
			return 11;
		if(face>9)
			return 10;
		return face;
	}

	public boolean equals(Card obj)
	{
		return face == obj.getFace() && suit.equals(obj.getSuit());
	}

	//toString
	@Override
	public String toString() {
		return FACES[face]+" of "+suit+" | value = "+getValue();
	}
}