package phrase;

public class Phrase
{
	private String currentPhrase;
	
    public Phrase( String p )
    {
        currentPhrase=p;
    }
    
    public int findNthOccurence( String str, int n )
    {
        int occurence=0;
    	for(int i = 0; i<currentPhrase.length();i++){
            String p;
            if(i+str.length()<currentPhrase.length())
                p = currentPhrase.substring(i,i+str.length());
            else
                p = currentPhrase.substring(i);
            if(p.equals(str))
                occurence++;
            if(occurence==n)
                return i;
        }
        return -1;
    }	
    	
    public void replaceNthOccurence( String str, int n, String repl )
    {
    	int occur = findNthOccurence(str, n);
        if(occur!=-1)
            currentPhrase = currentPhrase.substring(0,occur)+repl+currentPhrase.substring(occur+1+str.length()-1);
    }
    
    public int findLastOccurence( String str )
    {
        int occurence=0;
        boolean occured=false;
        for(int i = 0; i<currentPhrase.length();i++){
            String p;
            if(i+str.length()<currentPhrase.length())
                p = currentPhrase.substring(i,i+str.length());
            else
                p = currentPhrase.substring(i);
            if(p.equals(str)) {
                occurence=i;
                occured=true;
            }
        }
        if (occured)
            return occurence;
        return -1;
    }       	
    	
    public String toString()
    {
    	return currentPhrase;
    }    
}