public class oddEven {
    public static double oddEvenAve(long i) {
        String s = String.valueOf(i);
        char a = s.charAt(0);
        int one = Integer.parseInt(String.valueOf(a));
        char b = s.charAt(s.length()-2);
        int last1 = Integer.parseInt(String.valueOf(b));
        char c = s.charAt(s.length()-1);
        int last2 = Integer.parseInt(String.valueOf(c));
        if(one%2==0){
            return ((double) (one + last2) /2);
        }
        return ((double) (last1 + last2) /2);
    }
}
