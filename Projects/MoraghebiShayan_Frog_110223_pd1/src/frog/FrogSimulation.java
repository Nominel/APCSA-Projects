package frog;

public class FrogSimulation
{
	
	private int goalDistance;	
	private int maxHops;
	
	public FrogSimulation( int dist, int numHops ) 
	{
		goalDistance = dist;
		maxHops = numHops;
	}
	
	public int hopDistance()
	{
	  return (int)(Math.random()*21-5);
	}
	
	public boolean simulate()
	{
		int position = 0;
		for(int i=0;i<maxHops;i++){
			position+=hopDistance();
		}
		return position>=goalDistance;
	}
	
	public double runSimulations( int num )
	{
		int success = 0;
		for(int i = 0; i<num;i++){
			if(simulate())
				success++;
		}
		return (double) success/num*100;
	}    
}