package story;

public class TellStoryRunner
{
	public static void main(String[] args)
	{
		//All 4 data files must be in the project folder!
		//make a new MadLib
		TellStory story = new TellStory("src/story.txt","src/nouns.txt","src/verbs.txt","src/adjectives.txt");
		System.out.println(story);
	}
}