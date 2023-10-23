package search;

public class SearchRunner {
    public static void main(String[] args){
        String x = "I think that I shall never see; A poem lovely as a tree. ";
        Search m = new Search(x);
        m.findNemo1();
        System.out.println(m);
        m.findNemo2();
        System.out.println(m);
    }
}
