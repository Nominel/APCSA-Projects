package word2;

import java.util.*;

public class Words
{
    private ArrayList<Word> words;

    public Words(String[] wordList)
    {
            words= new ArrayList<Word>();
            for (String s : wordList) {
                    words.add(new Word(s));
            }
    }

    public int countWordsWithXChars(int size)
    {
        int count=0;
        for(Word word1:words)
            if(word1.getLength()==size)
                count++;
        return count;
    }

    //this method will remove all words with a specified size / length
    //this method will also return the sum of the vowels in all words removed
    public int removeWordsWithXChars(int size)
    {
            int vowelsRemoved=0;
            int i = 0;
            while(i<words.size()){
                if (words.get(i).getLength() == size) {
                    vowelsRemoved += words.get(i).getNumVowels();
                    words.remove(i);
                }
                else
                        i++;
            }
        return vowelsRemoved;
    }

    public int countWordsWithXVowels(int numVowels)
    {
            int count=0;
            for(Word word1:words)
                    if(word1.getNumVowels()==numVowels)
                            count++;
            return count;
    }


    //add in a toString

        @Override
        public String toString() {
                return ""+words;
        }
}