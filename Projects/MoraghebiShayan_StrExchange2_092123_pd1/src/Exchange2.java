public class Exchange2 {
    public String stitch(String first, String last){
        if(first.length()<2||last.length()<2){
            return (last+first);
        }
        else{
            int firstLength = first.length();
            int lastLength = last.length();
            int firstHalf = firstLength/2;
            int lastHalf = lastLength/2;

            if(firstLength%2!=0){
                firstHalf++;
            }
            if(lastLength%2!=0){
                lastHalf++;
            }

            String part1 = last.substring(lastHalf,lastLength);
            String part2 = first.substring(0,firstHalf);
            String part3 = last.substring(0,lastHalf);
            String part4 = first.substring(firstHalf,firstLength);

            return (part1+part2+part3+part4);
        }
    }
    public String zip(String first, String last){
        char char1 = first.charAt(0);
        char char2 = last.charAt(0);
        char char3 = first.charAt(1);
        char char4 = last.charAt(1);
        char char5 = first.charAt(2);
        char char6 = last.charAt(2);
        char char7 = first.charAt(3);
        char char8 = last.charAt(3);
        return (""+char1+char2+char3+char4+char5+char6+char7+char8);
    }
}
