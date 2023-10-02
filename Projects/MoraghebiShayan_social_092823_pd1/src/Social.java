//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
public class Social
{
    private final String num;
    public Social( String n )
    {
        num=n;
    }
    private boolean isValid()
    {
        return ((num.charAt(3)=='-')&&(num.charAt(6)=='-'));
    }
    //method go must call isValid
    public String go()
    {
        if(isValid()) {
            return num.substring(7);
        }
        else {
            return "bad";
        }
    }
}