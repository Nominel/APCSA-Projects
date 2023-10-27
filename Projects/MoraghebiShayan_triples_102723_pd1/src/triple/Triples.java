package triple;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
public class Triples
{
   private int number;

	public Triples(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd =1;
		for(int i=1; i<=a&&i<=b&&i<=c;i++){
			if(a%i==0&&b%i==0&&c%i==0){
				gcd=i;
			}
		}
		return gcd;
	}

	public String toString()
	{
		String output="";
		boolean triple=true;
		for(int a = 1;a<number;a++){
			for(int b = 1;b<number;b++){
				for(int c = 1;c<number;c++){
					if(greatestCommonFactor(a,b,c)!=1){
						triple=false;
					}
					if(Math.pow(a,2)+Math.pow(b,2)!=Math.pow(c,2)){
						triple=false;
					}
					if(c%2!=1&&!((a%2==0&&b%2==1)||(a%2==1&&b%2==0))){
						triple=false;
					}
					if(b<a){
						triple=false;
					}
					if(triple){
						output=output.concat(a+" "+b+" "+c+"\n");
					}
					triple=true;
				}
			}
		}
		return output+"\n";
	}
}