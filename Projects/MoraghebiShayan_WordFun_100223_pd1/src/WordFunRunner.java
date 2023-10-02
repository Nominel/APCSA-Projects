import static java.lang.System.*;
public class WordFunRunner
{
    public static void main( String args[] )
    {
        WordFun test = new WordFun("Hello World");
        out.println(test);
        test.makeUpper();
        out.println(test);
        test.addHyphen();
        out.println(test);

        WordFun test1 = new WordFun("Carnegie rhinos");
        out.println(test1);
        test1.makeUpper();
        out.println(test1);
        test1.addHyphen();
        out.println(test1);

        WordFun test2 = new WordFun("Computer Science");
        out.println(test2);
        test2.makeUpper();
        out.println(test2);
        test2.addHyphen();
        out.println(test2);

        WordFun test3 = new WordFun("CVHS TEAM");
        out.println(test3);
        test3.makeUpper();
        out.println(test3);
        test3.addHyphen();
        out.println(test3);

        WordFun test4 = new WordFun("State Champions");
        out.println(test4);
        test4.makeUpper();
        out.println(test4);
        test4.addHyphen();
        out.println(test4);
    }
}