package search;

public class Search {
    private String nemo;
    private int n_count;
    private int e_count;
    private int m_count;
    private int o_count;
    public Search(String s){
        nemo = s.replaceAll("[^A-Za-z]+","");
    }
    public void findNemo1(){
        int n=0;
        int e=0;
        int m=0;
        int o=0;
        int index = 0;
        do{
            if(nemo.charAt(index)=='n'||nemo.charAt(index)=='N'){
                n++;
            }
            index++;
        }while(index<nemo.length());
        index = 0;
        do{
            if(nemo.charAt(index)=='e'||nemo.charAt(index)=='E'){
                e++;
            }
            index++;
        }while(index<nemo.length());
        index = 0;
        do{
            if(nemo.charAt(index)=='m'||nemo.charAt(index)=='M'){
                m++;
            }
            index++;
        }while(index<nemo.length());
        index = 0;
        do{
            if(nemo.charAt(index)=='o'||nemo.charAt(index)=='O'){
                o++;
            }
            index++;
        }while(index<nemo.length());
        n_count=n;
        e_count=e;
        m_count=m;
        o_count=o;
    }
    public void findNemo2(){
        int n=0;
        int e=0;
        int m=0;
        int o=0;
        for(int index = 0; index<nemo.length();index++){
            if(nemo.charAt(index)=='n'||nemo.charAt(index)=='N'){
                n++;
            }
        }
        for(int index = 0; index<nemo.length();index++){
            if(nemo.charAt(index)=='e'||nemo.charAt(index)=='E'){
                e++;
            }
        }
        for(int index = 0; index<nemo.length();index++){
            if(nemo.charAt(index)=='m'||nemo.charAt(index)=='M'){
                m++;
            }
        }
        for(int index = 0; index<nemo.length();index++){
            if(nemo.charAt(index)=='o'||nemo.charAt(index)=='O'){
                o++;
            }
        }
        n_count=n;
        e_count=e;
        m_count=m;
        o_count=o;
    }
    public double percentage(int letter){
        double result = (double)letter/nemo.length();
        result = (Math.round(result*100000000))/1000000.0;
        return result;
    }
    public String toString(){
        return "There are "+nemo.replaceAll("[^A-Za-z]+","").length()+" letter in the \""+nemo+"\"\n"+
                "n = "+n_count+" at "+percentage(n_count)+"%\n"+
                "e = "+e_count+" at "+percentage(e_count)+"%\n"+
                "m = "+m_count+" at "+percentage(m_count)+"%\n"+
                "o = "+o_count+" at "+percentage(o_count)+"%\n";
    }
}
