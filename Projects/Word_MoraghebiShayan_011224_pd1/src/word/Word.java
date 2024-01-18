package word;


public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   // why is it static?

   //add an instance variable
   private String word;
   //create a constructor
   public Word(String w){
      word=w;
   }
   //create necessary methods

   public int getNumVowels() {
      int numVowels=0;
      for(int i = 0; i<word.length(); i++){
         if(vowels.indexOf(word.charAt(i))!=-1){
            numVowels++;
         }
      }
      return numVowels;
   }

   public int getLength(){
      return word.length();
   }

   public void setWord(String w){
      word=w;
   }
   //look at the sample runner code (on document)

	
   //create a toString method

   @Override
   public String toString() {
      return word;
   }
}