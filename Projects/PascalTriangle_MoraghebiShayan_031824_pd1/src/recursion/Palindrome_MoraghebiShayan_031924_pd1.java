package recursion;

public class Palindrome_MoraghebiShayan_031924_pd1 {
	public static void main(String[] args){
		System.out.println(isPalindrome("abcdcba",0, 6, 1));
		System.out.println(isPalindrome("aabbccddccbbaa", 0, 13, 2));
		System.out.println(isPalindrome("aabbccddccbbaa", 0, 13, 1));
		System.out.println(isPalindrome("aqubcdfghbcdaqu", 0, 14, 3));
		System.out.println(isPalindrome("aqubcdfghbcdaqu", 0, 14, 2));
		System.out.println(isPalindrome("abakadakadaba",0,12,1));
		System.out.println(isPalindrome("abcdexxxxxxxxxxxxxxabcde",0,23,5));
	}

	public static boolean isPalindrome(String str, int start, int end, int n){
		if (start+n>end-n)
			return true;
		String first = str.substring(start,start+n);
		String second = str.substring(end-n+1);
		if(first.equals(second))
			return isPalindrome(str.substring(0,end-n+1),start+n,end-n,n);
		else
			return false;
	}
}
