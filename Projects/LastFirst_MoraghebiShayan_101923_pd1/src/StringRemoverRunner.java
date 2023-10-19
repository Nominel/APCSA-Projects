
public class StringRemoverRunner
{
	public static void main(String[] args)
	{
		StringRemover remove1 = new StringRemover("xR-MxR-MHelloxR-M","R-M");
		System.out.println(remove1);
		StringRemover remove2 = new StringRemover("sxsssxssxsxssexssxsesss","xs");
		System.out.println(remove2);
		StringRemover remove3 = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");
		System.out.println(remove3);
		StringRemover remove4 = new StringRemover("dogdogcatddodogdogdoggog","dog");
		System.out.println(remove4);
	}
}