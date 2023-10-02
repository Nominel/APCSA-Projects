public class firstLast {
    //incomplete declaration
    public static  String  check(String word) {
        char last = word.charAt(word.length()-1);
        char first = word.charAt(0);
        boolean firstVowel=false;
        boolean lastVowel=false;
        boolean bothVowel=false;
        if(last == 'a'){
            lastVowel=true;
        }
        if(last == 'e'){
            lastVowel=true;
        }
        if(last == 'i'){
            lastVowel=true;
        }
        if(last == 'o'){
            lastVowel=true;
        }
        if(last == 'u'){
            lastVowel=true;
        }
        if(last == 'y'){
            lastVowel=true;
        }
        if(first == 'a'){
            firstVowel=true;
        }
        if(first == 'e'){
            firstVowel=true;
        }
        if(first == 'i'){
            firstVowel=true;
        }
        if(first == 'o'){
            firstVowel=true;
        }
        if(first == 'u'){
            firstVowel=true;
        }
        if (firstVowel==lastVowel){
            if (firstVowel){
                bothVowel=true;
            }
        }
        if (word.length()==1){
            return (first+" == "+bothVowel);
        }
        return (""+last+first+" == "+bothVowel);
    }
}