package Three_WeatherData;

import java.util.ArrayList;

public class WeatherData
{
	private ArrayList<Double> temperatures;
	
	public WeatherData( double[] vals )
	{
		temperatures = new ArrayList<Double>();
		for( double r : vals )
		{
			temperatures.add( r );
		}
	}
	
	public void cleanData( double lower, double upper )
	{
		int i = 0;
		while( i < temperatures.size() ){
			if( temperatures.get(i) < lower || temperatures.get(i) > upper )
				temperatures.remove(i);
			else
				i++;
		}
	}
	
	public int longestHeatWave( double threshold )
	{
		int longestHeatWave = 0;
		int length = 0;
		for(int i = 0; i < temperatures.size(); i++){
			if( temperatures.get(i) > threshold)
				length++;
			else{
				if(length > longestHeatWave)
					longestHeatWave = length;
				length = 0;
			}
		}
		if(length > longestHeatWave)
			longestHeatWave = length;
		return longestHeatWave;
	}
	
	public String toString()
	{
		return "" + temperatures;
	}
}


/*



*/
