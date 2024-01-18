package word2;

import java.util.Scanner;

import static java.lang.System.*;

public class WordsRunner
{
	public static void main(String[] args)
	{
                Scanner scan = new Scanner(System.in);
                out.println("Please enter your array with the elements seperated by , ex: one, two, three, four");
		String[] wrds = scan.nextLine().split(", ");
		Words test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");		
				
		//add more test cases
	
	}
}