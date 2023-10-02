public class WordFun
{
    private String word;
    public WordFun(String w)
    {
        word=w;
    }
    public void makeUpper() {
        String upper = word.toUpperCase();
        String upperA = upper.replace("A", "a");
        String upperE = upperA.replace('E', 'e');
        String upperI = upperE.replace('I', 'i');
        String upperO = upperI.replace('O', 'o');
        String upperU = upperO.replace('U', 'u');
        word = upperU;
    }
    public void addHyphen()
    {
        word=word.replace(' ','-');
    }
    public String toString()
    {
        return word;
    }
}