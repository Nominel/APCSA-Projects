package encryption;

public class CipherRunner {
	public static void main(String[] args) {
		String str = "123456789abcde";
		Cipher x = new Cipher(str);
		System.out.println(x.matrixCipher());
		String str1 = "This is a regular hello world I need to hit the character count";
		Cipher y = new Cipher(str1);
		System.out.println(y.matrixCipher());
	}
}
