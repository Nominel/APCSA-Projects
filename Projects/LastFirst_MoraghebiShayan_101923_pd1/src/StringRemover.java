
class StringRemover
{
   private String remove;
   private String sentence;
   private String removed;

	public StringRemover( String sen, String rem )
	{
		remove = rem;
		sentence = sen;
	}

	public void removeStrings()
	{
		String sen = sentence;
		int index;
		while(sen.contains(remove)){
			if(sen.indexOf(remove)==0){
				index = sen.indexOf(remove);
			}
			else{
				index = sen.indexOf(remove)-1;
			}
			sen = sen.substring(0,index)+sen.substring(sen.indexOf(remove)+remove.length());
		}
		removed = sen;
	}

	public String toString()
	{
		removeStrings();
		return sentence+" - String to remove "+remove+"\n"+removed;
	}
}