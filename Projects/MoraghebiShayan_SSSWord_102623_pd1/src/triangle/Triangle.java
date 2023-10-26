package triangle;

public class Triangle {
    private String word;
    public Triangle(String s){
        word=s;
    }
    private String reverse(){
        String result = "";
        for(int i=word.length()-1; i>=1;i--){
            result+=word.charAt(i);
        }
        return result;
    }
    public String toString(){
        String result="";
        int s=1;

        for(int g=word.length()-2;g>=0;g--){
            result+=" ";
        }
        result+=word.charAt(0);
        for(int g=word.length()-2;g>=0;g--){
            result+=" ";
        }
        result+="\n";


        for(int i=1; i<word.length()-1;i++){
            for(int b=word.length()-i-2; b>=0;b--){
                result+=" ";
            }

            result+=word.charAt(i);

            for(int b =s; b>0;b--){
                result+=" ";
            }

            result+=word.charAt(i);

            for(int b=word.length()-i-2; b>=0;b--){
                result+=" ";
            }

            result+="\n";
            s+=2;
        }
        result+=reverse()+word;
        return result;
    }
}
