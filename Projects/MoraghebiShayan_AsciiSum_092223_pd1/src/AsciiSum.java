public class AsciiSum
{
    private String word;
    private char letter;
    private int sum;
    public AsciiSum()
    {
    }
    public AsciiSum(String w , char l)
    {  // initalize word and letter
        word=w;
        letter=l;
    }
    public void setInfo(String w , char l)
    {  // initalize word and letter
        word=w;
        letter=l;
    }
    public void locateAndAdd()
    {  // sum calculation
        int index1;
        int index2;
        char before1;
        char after1;
        char before2;
        char after2;

        index1 = word.indexOf(letter);
        index2 = word.lastIndexOf(letter);
        before1 = word.charAt(index1-1);
        after1 = word.charAt(index1+1);
        before2 = word.charAt(index2-1);
        after2 = word.charAt(index2+1);
        sum = before1+after1+before2+after2;
    }
    public String toString()
    {    //returns String that is shown in the expected output in main of AsciiSumRunner
        return "The letters surrounding the "+letter+"'s in "+word+" have a total of "+sum;
    }
} // end of class