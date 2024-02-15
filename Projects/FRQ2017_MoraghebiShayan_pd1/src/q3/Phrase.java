package q3;

public class Phrase
{
	private String currentPhrase;
	
    public Phrase( String p )
    {
            currentPhrase=p;
    }
    
    public int findNthOccurence( String str, int n )
    {
            int occurence = 0;
            for (int i = 0; i < currentPhrase.length()-str.length(); i++) {
                    if(str.equals(currentPhrase.substring(i,i+str.length())))
                            occurence++;
                    if(occurence==n)
                            return i;
            }
            return -1;
    }	
    	
    public void replaceNthOccurence( String str, int n, String repl )
    {
            int index = findNthOccurence(str, n);
            if(currentPhrase.length()==1)
                    currentPhrase = repl;
            if(index!=-1){
                    currentPhrase = currentPhrase.substring(0,index)+repl+currentPhrase.substring(index+str.length());
            }
    }
    
    public int findLastOccurence( String str )
    {
            int lastIndex = -1;
            int index = currentPhrase.indexOf(str);

            while (index != -1) {
                    lastIndex = index;
                    index = currentPhrase.indexOf(str, index + 1);
            }

            return lastIndex;
    }       	
    	
    public String toString()
    {
    	return currentPhrase;
    }    
}