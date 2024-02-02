package story;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class TellStory
{
	private final ArrayList<String> verbs; //@
	private final ArrayList<String> nouns; //&
	private final ArrayList<String> adjectives; //#
	private String story;
	
	public TellStory()
	{
		//add code here: create the lists
		nouns = new ArrayList<>();
		verbs = new ArrayList<>();
		adjectives = new ArrayList<>();
	}

	public TellStory(String storyFile, String nounFile, String verbFile, String adjectiveFile) //from main
	{
		this(); //call default constructor

		//call the 3 loader methods: 


		try{     
			//load story into a list (with 3 elemnts)
			Scanner file = new Scanner(new File(storyFile));
			ArrayList<String> story = new ArrayList<>();
			while (file.hasNextLine())
				story.add(file.nextLine());
			loadNouns(nounFile);
			loadVerbs(verbFile);
			loadAdjectives(adjectiveFile);
			
			//Add more code here to select randomly one of the 3 stories
                        // and replace the nouns, verbs, adjectives.
                        //Use the helper methods shown below.	

			this.story = story.get((int)(Math.random()*story.size()));
			while(this.story.indexOf('@')!=-1)
				this.story = this.story.substring(0,this.story.indexOf('@'))+getRandomVerb()+this.story.substring(this.story.indexOf('@')+1);
			while(this.story.indexOf('&')!=-1)
				this.story = this.story.substring(0,this.story.indexOf('&'))+getRandomNoun()+this.story.substring(this.story.indexOf('&')+1);
			while(this.story.indexOf('#')!=-1)
				this.story = this.story.substring(0,this.story.indexOf('#'))+getRandomAdjective()+this.story.substring(this.story.indexOf('#')+1);
		}
		catch(Exception e){
			System.out.println("Rhinos, we have a problem! - story file not found!");
		}
		
	}

        // Helper methods:
	public void loadNouns(String nounFile)
	{
		try{
			Scanner file = new Scanner(new File(nounFile));
			while (file.hasNextLine())
				nouns.add(file.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Rhinos, we have a problem! - noun file not found!");
		}			
	}
	
	public void loadVerbs(String verbFile)
	{
		try{
			Scanner file = new Scanner(new File(verbFile));
			while (file.hasNextLine())
				verbs.add(file.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Rhinos, we have a problem! - verb file not found!");
		}
	}

	public void loadAdjectives(String adjectiveFile)
	{
		try{
			Scanner file = new Scanner(new File(adjectiveFile));
			while (file.hasNextLine())
				adjectives.add(file.nextLine());
		}
		catch(Exception e)
		{
			System.out.println("Rhinos, we have a problem! - adjective file not found!");
		}
	}

	public String getRandomVerb() //Use Math.random()
	{
		return verbs.get((int)(Math.random()* verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get((int)(Math.random()* nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get((int)(Math.random()*adjectives.size()));
	}		

	public String toString()
	{
	   return story; // returns edited story
	}


} // end of TellStory