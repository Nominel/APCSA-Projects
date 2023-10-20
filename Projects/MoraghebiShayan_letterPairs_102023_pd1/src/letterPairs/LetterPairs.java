package letterPairs;

public class LetterPairs {
    public static int numOfPairs(String str){
        int pairs = 0;
        for(int index=0; index<str.length()-1;index++){
            if(str.charAt(index)==str.charAt(index+1)){
                pairs++;
            }
        }
        return pairs;
    }
}
