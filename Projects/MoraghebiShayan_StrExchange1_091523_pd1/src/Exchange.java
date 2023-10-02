public class Exchange {
    public String switchTwo(String str){
        if(str.length()>=4){
            String char1=str.substring(0,1);
            String char2=str.substring(1,2);
            String str1=str.substring(2,str.length()-2);
            String char3=str.substring(str.length()-2,str.length()-1);
            String char4=str.substring(str.length()-1);
            return (char4+char3+str1+char2+char1);
        }
        else{
            return str;
        }
    }
}
