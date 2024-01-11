package mostFrequent;

import java.util.ArrayList;

public class ListMostFreq
{
    //The method findMost will return the integer
    //   that appears the most in list ray.
    //If several numbers all appear
    //   the same number of times
    //   return the first number found.
    //Read document for further examples.

    public static int findMost(ArrayList<Integer> ray )
    {
        int mostCommon = 0;
        int mostCommonCount = 0;
        for(Integer i : ray){
            int commonCount = 0;
            for(Integer g : ray){
                if(i.equals(g))
                    commonCount++;
            }
            if(commonCount>mostCommonCount) {
                mostCommon = i;
                mostCommonCount=commonCount;
            }
        }
        //algorithm needed
        return mostCommon;
    }
}