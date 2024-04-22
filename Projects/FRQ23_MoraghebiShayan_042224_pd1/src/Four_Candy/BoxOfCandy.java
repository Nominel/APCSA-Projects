package Four_Candy;

public class BoxOfCandy
{
	private Candy[][] box;
	
	public BoxOfCandy()
	{
		box = new Candy[4][3];
		box[0][1] = new Candy("lime");
		box[1][1] = new Candy("orange");
		box[2][2] = new Candy("cherry");
		box[3][1] = new Candy("lemon");
		box[3][2] = new Candy("grape");		
	}
	
	public boolean moveCandyToFirstRow( int col )
	{
		if(box[0][col] != null)
			return true;
		for(int i = 0; i < box.length; i++){
			if(box[i][col] != null){
				box[0][col] = box[i][col];
				box[i][col] = null;
				return true;
			}
		}
		return false;
	}
	
	public Candy removeNextByFlavor( String flavor )
	{
		for (int i = box.length-1; i >= 0; i--) {
			for (int j = 0; j < box[i].length; j++) {
				if(box[i][j] != null && box[i][j].getFlavor().equals(flavor)){
					Candy candy = box[i][j];
					box[i][j] = null;
					return candy;
				}
			}
		}
		return null;
	}
	
	public String toString()
	{
		String s = "";
		for( Candy[] r : box )
		{
			for( Candy c : r )
			{
				s += c + " ";
			}
			s+= "\n";
		}
		return s;
	}
}
